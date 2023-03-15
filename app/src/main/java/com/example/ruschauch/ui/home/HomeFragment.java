package com.example.ruschauch.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.ruschauch.MainActivity2;
import com.example.ruschauch.MainActivity3;
import com.example.ruschauch.R;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements UserAdapter.SelectedUser {




    RecyclerView mRecyclerView;
    View rootView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_home, container, false);


        // ruyhatni eloni va sozlanmasi
        mRecyclerView = rootView.findViewById(R.id.recyclerView1);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        mRecyclerView.setAdapter(userAdapter);


        return rootView;
    }

    private void initial() {
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm1,"Тема 1. ОБЩАЯ ХАРАКТЕРИСТИКА ЛИТЕРАТУРЫ XIX ВЕКА","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/tema1.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm2,"Тема 2. ОСОБЕННОСТИ РАЗВИТИЯ РОМАНТИЗМА В НЕМЕЦКОЙ ЛИТЕРАТУРЕ","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/tema2.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm3,"Тема 3. ОСОБЕННОСТИ РОМАНТИЗМА В АНГЛИЙСКОЙ ЛИТЕРАТУРЕ.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/tema3.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm4,"Тема 4. ОСОБЕННОСТИ РАЗВИТИЯ ФРАНЦУЗСКОГО РОМАНТИЗМА.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/tema4.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm5,"Тема 5. АМЕРИКАНСКИЙ РОМАНТИЗМ.                       ","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/tema5.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm6,"Тема 6. ФРАНЦУЗСКАЯ РЕАЛИСТИЧЕСКАЯ ЛИТЕРАТУРА XIX ВЕКА.  ","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/tema6.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm7,"Тема 7. ТВОРЧЕСТВО ОНОРЕ ДЕ БАЛЬЗАКА.                  ","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/tema7.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm8,"Тема 8. НЕМЕЦКАЯ ЛИТЕРАТУРА 30-40-Х ГОДОВ XIX ВЕКА.    ","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/tema8.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm9,"Тема 9. ПУТИ РАЗВИТИЯ ФРАНЦУЗСКОЙ ЛИТЕРАТУРЫ ВО ВТОРОЙ ПОЛОВИНЕ XIX ВЕКА.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/tema9.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm10,"Тема 10. КРИТИЧЕСКИЙ РЕАЛИЗМ В АНГЛИИ.                 ","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/tema10.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm11,"Тема 11. РАЗВИТИЕ ЛИТЕРАТУРЫ КОНЦА XIX - НАЧАЛА ХХ ВЕКА.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/tema11.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm12,"Тема 12. ГИ ДЕ МОПАССАН - ПРЕДСТАВИТЕЛЬ КРИТИЧЕСКОГО РЕАЛИЗМА.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/tema12.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.rasm13,"Тема 13. НАТУРАЛИЗМ ВО ФРАНЦУЗСКОЙ ЛИТЕРАТУРЕ.ЭМИЛЬ ЗОЛЯ.","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/tema13.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.test,"Тесты                                                      ","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/test.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.icon,"Глоссарий                                                  ","ИСТОРИЯ ЗАРУБЕЖНОЙ ЛИТЕРАТУРЫ XIX ВЕКА","https://github.com/asadbekakmedov2001/RuschaUch/raw/main/app/src/main/assets/glossary.docx"));


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {


//
            startActivity(new Intent(getContext(), MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));

    }

//    @Override
//    public void onPause() {
//        super.onPause();
//        modelRcyclers.clear();
//    }

    @Override
    public void onStart() {
        super.onStart();
        modelRcyclers.clear();
        initial();
    }
}