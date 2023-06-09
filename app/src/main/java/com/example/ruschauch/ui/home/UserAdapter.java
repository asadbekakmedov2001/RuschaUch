package com.example.ruschauch.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ruschauch.R;

import java.util.ArrayList;
import java.util.List;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserAdapterViewHolder> implements Filterable {

    private List<ModelRcycler> userModelList;
    private List<ModelRcycler> userModelListFilter;
    private Context context;
    private SelectedUser selectedUser;

    public UserAdapter(List<ModelRcycler> userModelList, HomeFragment selectedUser) {
        this.userModelList = userModelList;
        this.userModelListFilter = userModelList;
        this.selectedUser = selectedUser;
    }

    @NonNull
    @Override
    public UserAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new UserAdapterViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recycler,null));
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapterViewHolder holder, int position) {
        ModelRcycler modelRcycler = userModelList.get(position);

        holder.tvUserNAme.setText(modelRcycler.getLessonName());
        holder.tvtextName.setText(modelRcycler.getTextName());
        holder.imIcon.setImageResource(modelRcycler.getImgID());
        holder.cardView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.scale_animation_for_card));

    }

    @Override
    public int getItemCount() {
        return userModelList.size();
    }

    @Override
    public Filter getFilter() {
        Filter filter  = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults filterResults = new FilterResults();

                if (constraint==null || constraint.length()==0){
                    filterResults.count = userModelListFilter.size();
                    filterResults.values = userModelListFilter;
                }
                else {
                    String searchCHr = constraint.toString().toLowerCase();
                    List<ModelRcycler> resultData = new ArrayList<>();
                    for(ModelRcycler userModel: userModelListFilter){
                        if (userModel.getLessonName().toLowerCase().contains(searchCHr)){
                            resultData.add(userModel);
                        }
                    }
                    filterResults.count = resultData.size();
                    filterResults.values = resultData;
                }

                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                userModelList  = (List<ModelRcycler>) results.values;
                notifyDataSetChanged();
            }
        };
        return filter;
    }

    public interface SelectedUser{
        void selectedUser(ModelRcycler modelRcycler);
    }

    public class UserAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView tvUserNAme;
        TextView tvtextName ;
        ImageView imIcon;
        CardView cardView;

        public UserAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            tvUserNAme = itemView.findViewById(R.id.title);
            tvtextName = itemView.findViewById(R.id.desc);
            imIcon = itemView.findViewById(R.id.imageView);
            cardView = itemView.findViewById(R.id.mainCard);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectedUser.selectedUser(userModelList.get(getAdapterPosition()));



                }
            });
        }
    }
}

