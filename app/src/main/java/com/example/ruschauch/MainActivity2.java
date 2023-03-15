package com.example.ruschauch;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements UserAdapterAC2.SelectedUser {



    Toolbar toolbar;
    RecyclerView recyclerView;
    List<com.example.ruschauch.ModelRcycler> modelRcyclers = new ArrayList<>();
    TextView textViewSelectedChapterName;

    int getChemgeItemPosition;


    ConstraintLayout constraintLayout;
    UserAdapterAC2 userAdapter;
    ImageView imageViewc2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        imageViewc2 = findViewById(R.id.imageViewac2);

        // ruyhatni eloni va sozlanmasi
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));



        // tool bar sozlanmasi
//        toolbar = findViewById(R.id.toolBAr);
//        this.setSupportActionBar(toolbar);
//        this.getSupportActionBar().setTitle("");
        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName);
        getChemgeItemPosition = intent.getIntExtra("swimmers",1);


        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout1);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));


        switch (getChemgeItemPosition){
            case 0: {

                textViewSelectedChapterName.setText("ILMIY TADQIQOT METODOLOGIYASI FANIDAN MA'RUZA MASHG'ULOTLAR TOP'LAMI");

                modelRcyclers.add(new ModelRcycler("1-mavzu: FAN VA UNING JAMIYATDAGI O‘RNI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza1.docx"));
                modelRcyclers.add(new ModelRcycler("2-mavzu: IJОD VА ILMIY TADQIQOT BILISH FAOLIYATINING MAHSULI","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza2.docx"));
                modelRcyclers.add(new ModelRcycler("3-mavzu: ILMIY TADQIQOTNING NAMOYON BO‘LISH JIHATLARI. ILMIY TADQIQOTNING NAMOYON BO‘LISH SHAKLLARI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza3.docx"));
                modelRcyclers.add(new ModelRcycler("4-mavzu: ILMIY TADQIQOT TIPLARI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza4.docx"));
                modelRcyclers.add(new ModelRcycler("5-mavzu: ILMIY  TАDQIQОTDА DАLILLАRNING RОLI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza5.docx"));
                modelRcyclers.add(new ModelRcycler("6-mavzu: ILMIY INFORMATSIYANI IZLASH, JAMLASH VA QAYTA ISHLASH. ILMIY ISHLAR VA ILMIY ISHNI YOZISH.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza6.docx"));
                modelRcyclers.add(new ModelRcycler("7-mavzu: ILMIY ISHLARNI BADIIY JIHATDAN RASMIYLASHIRISH VA HIMOYA QILISH. ILMIY GRANT UCHUN MATERIALLARNI TAYYORLASH METODOLOGIYASI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza7.docx"));
                modelRcyclers.add(new ModelRcycler("8-mavzu: ILMIY TADQIQOTDA MUAMMO VA MUAMMOLI VAZIYATINING O‘ZARO ALOQASI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza8.docx"));
                modelRcyclers.add(new ModelRcycler("9-mavzu: ILMIY TADQIQOTGA AXBOROT VA AXBOROT TEXNOLOGIYALARINING TA’SIRI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza9.docx"));
                modelRcyclers.add(new ModelRcycler("10-mavzu: ILMIY TADQIQOT METODIDA TUSHUNISH VA TUSHUNTIRISHNING AHAMIYATI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza10.docx"));
                modelRcyclers.add(new ModelRcycler("11-mavzu: ILMIY  TАDQIQОTDА INTUITSIYANING RОLI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza11.docx"));
                modelRcyclers.add(new ModelRcycler("12-mavzu: OLIMNING PROFESSIONAL VA  IJTIMOIY MAS’ULIYATI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza12.docx"));
                modelRcyclers.add(new ModelRcycler("13-mavzu: ILMIY INFORMATSIYANI IZLASH, JAMLASH VA QAYTA ISHLASH. ILMIY ISHLAR VA ILMIY ISHNI YOZISH","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza13.docx"));
                modelRcyclers.add(new ModelRcycler("14-mavzu: ILMIY ISHLARNI BADIIY JIHATDAN RASMIYLASHIRISH VA HIMOYA QILISH. ILMIY GRANT UCHUN MATERIALLARNI TAYYORLASH METODOLOGIYASI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza14.docx"));
                modelRcyclers.add(new ModelRcycler("15-mavzu: Ilmiy grant. Uni yozish metodologiyasi.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza15.docx"));

            }break;
            case 1: {

                textViewSelectedChapterName.setText("ILMIY TADQIQOT METODOLOGIYASI FANIDAN SEMINAR MASHG'ULOTLAR TOP'LAMI");

                modelRcyclers.add(new ModelRcycler("Seminar mavzulari","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar_mavzulari.docx"));
                modelRcyclers.add(new ModelRcycler("1-mavzu: FAN VA UNING JAMIYATDAGI O‘RNI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar1.docx"));
                modelRcyclers.add(new ModelRcycler("2-mavzu: IJОD VА ILMIY TADQIQOT BILISH FAOLIYATINING MAHSULI","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar2.docx"));
                modelRcyclers.add(new ModelRcycler("3-mavzu: ILMIY TADQIQOTNING NAMOYON BO‘LISH JIHATLARI. ILMIY TADQIQOTNING NAMOYON BO‘LISH SHAKLLARI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar3.docx"));
                modelRcyclers.add(new ModelRcycler("4-mavzu: ILMIY TADQIQOT TIPLARI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar4.docx"));
                modelRcyclers.add(new ModelRcycler("5-mavzu: ILMIY  TАDQIQОTDА DАLILLАRNING RОLI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar5.docx"));
                modelRcyclers.add(new ModelRcycler("6-mavzu: ILMIY INFORMATSIYANI IZLASH, JAMLASH VA QAYTA ISHLASH. ILMIY ISHLAR VA ILMIY ISHNI YOZISH.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar6.docx"));
                modelRcyclers.add(new ModelRcycler("7-mavzu: ILMIY ISHLARNI BADIIY JIHATDAN RASMIYLASHIRISH VA HIMOYA QILISH. ILMIY GRANT UCHUN MATERIALLARNI TAYYORLASH METODOLOGIYASI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar7.docx"));
                modelRcyclers.add(new ModelRcycler("8-mavzu: ILMIY TADQIQOTDA MUAMMO VA MUAMMOLI VAZIYATINING O‘ZARO ALOQASI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar8.docx"));
                modelRcyclers.add(new ModelRcycler("9-mavzu: ILMIY TADQIQOTGA AXBOROT VA AXBOROT TEXNOLOGIYALARINING TA’SIRI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar9.docx"));
                modelRcyclers.add(new ModelRcycler("10-mavzu: ILMIY TADQIQOT METODIDA TUSHUNISH VA TUSHUNTIRISHNING AHAMIYATI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar10.docx"));
                modelRcyclers.add(new ModelRcycler("11-mavzu: ILMIY  TАDQIQОTDА INTUITSIYANING RОLI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar11.docx"));
                modelRcyclers.add(new ModelRcycler("12-mavzu: OLIMNING PROFESSIONAL VA  IJTIMOIY MAS’ULIYATI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar12.docx"));
                modelRcyclers.add(new ModelRcycler("13-mavzu: ILMIY INFORMATSIYANI IZLASH, JAMLASH VA QAYTA ISHLASH. ILMIY ISHLAR VA ILMIY ISHNI YOZISH","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar13.docx"));
                modelRcyclers.add(new ModelRcycler("14-mavzu: ILMIY ISHLARNI BADIIY JIHATDAN RASMIYLASHIRISH VA HIMOYA QILISH. ILMIY GRANT UCHUN MATERIALLARNI TAYYORLASH METODOLOGIYASI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar14.docx"));
                modelRcyclers.add(new ModelRcycler("15-mavzu: Ilmiy grant. Uni yozish metodologiyasi.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/seminar15.docx"));


            }break;

            case 2: {

                textViewSelectedChapterName.setText("ILMIY TADQIQOT METODOLOGIYASI FANIDAN TAQDIMOTLAR TOP'LAMI");

                modelRcyclers.add(new ModelRcycler("1-mavzu: FAN – IJTIMOIY MADANIY HODISA. FANLAR TASNIFI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd1.pptx"));
                modelRcyclers.add(new ModelRcycler("2-mavzu: IJOD VA ILMIY TADQIQOT BILISH FAOLIYATINING MAHSULI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd2.ppt"));
                modelRcyclers.add(new ModelRcycler("3-mavzu: ILMIY TADQIQOTNING NAMOYON BO‘LISH JIHATLARI. ILMIY TADQIQOTNING NAMOYON BO‘LISH SHAKLLARI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd3.pptx"));
                modelRcyclers.add(new ModelRcycler("4-mavzu: ILMIY TADQIQOT TIPLARI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd4.pptx"));
                modelRcyclers.add(new ModelRcycler("5-mavzu: ILMIY  TАDQIQОTDА DАLILLАRNING RОLI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd5.pptx"));
                modelRcyclers.add(new ModelRcycler("6-mavzu: Ilmiy maktab, metod va metodologik yondashuvlar. Intellektual mulk huquqi: innovatsiya va novatsilar, kashfiyot va ixtiro, intellektual mulk va patent tushunchalarining mutanosibligi.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd6.pptx"));
                modelRcyclers.add(new ModelRcycler("7-mavzu: ОQILОNАLIK VА ILMIY TАDQIQОT MЕTОDОLОGIYASI UYG'UNLIGI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd7.ppt"));
                modelRcyclers.add(new ModelRcycler("8-mavzu: Muammo va muammoli vaziyat ilmiy tadqiqotning boshlang’ich asosi. Ijod jarayonida ilmiy izlanishlarning ahamiyati.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd8.pptx"));
                modelRcyclers.add(new ModelRcycler("9-mavzu: ILMIY TADQIQOTGA AXBOROT VA AXBOROT TEXNOLOGIYALARINING TA’SIRI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd9.pptx"));
                modelRcyclers.add(new ModelRcycler("10-mavzu: ILMIY TADQIQOT METODIDA TUSHUNISH VA TUSHUNTIRISHNING AHAMIYATI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd10.pptx"));
                modelRcyclers.add(new ModelRcycler("11-mavzu: ILMIY  TАDQIQОTDА INTUITSIYANING RОLI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd11.pptx"));
                modelRcyclers.add(new ModelRcycler("12-mavzu: OLIMNING PROFESSIONAL VA  IJTIMOIY MAS’ULIYATI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd12.pptx"));
                modelRcyclers.add(new ModelRcycler("13-mavzu: ILMIY INFORMATSIYANI IZLASH, JAMLASH VA QAYTA ISHLASH. ILMIY ISHLAR VA ILMIY ISHNI YOZISH","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd13.pptx"));
                modelRcyclers.add(new ModelRcycler("14-mavzu: ILMIY ISHLARNI BADIIY JIHATDAN RASMIYLASHIRISH VA HIMOYA QILISH. ILMIY GRANT UCHUN MATERIALLARNI TAYYORLASH METODOLOGIYASI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd14.pptx"));
                modelRcyclers.add(new ModelRcycler("15-mavzu: Ilmiy grant. Uni yozish metodologiyasi.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/slayd15.pptx"));


            }break;

            case 4: {

                textViewSelectedChapterName.setText("ILMIY TADQIQOT METODOLOGIYASI FANINING O'QUV REJASI");

                modelRcyclers.add(new ModelRcycler("5А150901-Дизайн (костюм дизайни)","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/4.1.pdf"));
                modelRcyclers.add(new ModelRcycler("5А311001–Тжичапахта, тўқимачилик ва енгил саноат","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/4.2.pdf"));
                modelRcyclers.add(new ModelRcycler("5А320310 Тўқимачилик ва енгил саноати машиналари ҳамда аппаратлари","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/4.3.pdf"));
                modelRcyclers.add(new ModelRcycler("5А320315 Пахта саноати машиналари ва жиҳозлари ","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/4.4.pdf"));
                modelRcyclers.add(new ModelRcycler("5А320401 Кимёвий технология қоғоз ва қоғоз маҳсулотлари ишлаб чиқариш","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/4.5.pdf"));
                modelRcyclers.add(new ModelRcycler("5А320904 - ТСББЛ (дессинаторлар)","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/4.6.pdf"));
                modelRcyclers.add(new ModelRcycler("5А321201 – Пахтани дастлабки ишлаш ва уруғ тайёрлаш","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/4.7.pdf"));

            }break;
            case 5: {

                textViewSelectedChapterName.setText("ILMIY TADQIQOT METODOLOGIYASI FANIDAN MUSTAQIL ISHLAR TOP'LAMI");

                modelRcyclers.add(new ModelRcycler("Mustaqil ta'limni baxolash mezoni","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/mustaqil_ishni_baholash_mezoni.docx"));
                modelRcyclers.add(new ModelRcycler("Mustaqil ta'lim mavzular","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/mustaqil_talim.docx"));

            }break;


        }

        userAdapter  = new UserAdapterAC2(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);



    }

    @RequiresApi(api = Build.VERSION_CODES.P)




    @Override
    public void selectedUser(ModelRcycler modelRcycler) {

        startActivity(new Intent(MainActivity2.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));


    }
}