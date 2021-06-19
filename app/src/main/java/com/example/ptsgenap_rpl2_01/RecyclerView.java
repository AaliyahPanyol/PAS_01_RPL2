package com.example.ptsgenap_rpl2_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class RecyclerView extends AppCompatActivity {

    private ArrayList<String> profile = new ArrayList<>();
    private ArrayList<String> nama = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        getDataFromInternet();
    }

     private void prosesRecyclerViewAdapter(){
        androidx.recyclerview.widget.RecyclerView recyclerView = findViewById(R.id.recycleraview);
      RecyclerViewAdapter adapter = new RecyclerViewAdapter(profile, nama, this);

      recyclerView.setAdapter(adapter);
      recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromInternet(){

        nama.add("Devin");
        profile.add("https://i.pinimg.com/564x/b9/b7/8f/b9b78feef136d29fc6ac7cffc12bc991.jpg");

        nama.add("Ajeng");
        profile.add("https://i.pinimg.com/564x/cd/fb/a6/cdfba667290ca25a6bd97bbd344b9f4c.jpg");

        nama.add("Humam");
        profile.add("https://i.pinimg.com/564x/51/10/12/51101264b9fa406f67a8d0314fe71f83.jpg");

        nama.add("Alya");
        profile.add("https://i.pinimg.com/564x/ec/58/0e/ec580ed52d4d33f2e2f87f013b8451fc.jpg");

        nama.add("Budi");
        profile.add("https://i0.wp.com/www.bakamitai.com/wp-content/uploads/2021/02/Gambar-Profil-Kosong-WA-Topi-Sapi-300x300.jpg");

        nama.add("Andika");
        profile.add("https://i0.wp.com/www.bakamitai.com/wp-content/uploads/2021/02/Foto-Profil-WA-Moster-300x300.jpg");

        nama.add("Salsa");
        profile.add("https://i0.wp.com/www.bakamitai.com/wp-content/uploads/2021/02/Foto-Profil-WA-Kosong-Keren-Udud.jpg");

        nama.add("Dini");
        profile.add("https://i0.wp.com/www.bakamitai.com/wp-content/uploads/2021/02/PP-WA-Kosong-Boyband-Korea-300x300.jpg");

        nama.add("Uut");
        profile.add("https://i0.wp.com/www.bakamitai.com/wp-content/uploads/2021/02/Foto-Profil-Whatsapp-Cute-Kosong-Aesthetics-300x295.jpg");

        nama.add("Kevin");
        profile.add("https://i0.wp.com/www.bakamitai.com/wp-content/uploads/2021/02/PP-WA-Kosong-Keren-Melet-300x291.jpg");



        prosesRecyclerViewAdapter();

    }
}