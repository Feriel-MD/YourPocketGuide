package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewHebergementsparis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_hebergementsparis);

        RecyclerView recyclerView1 = findViewById(R.id.recyclerview1);

        List<Item1> items = new ArrayList<>();
        items.add(new Item1("La Maison Gobert Paris Hotel Particulier","10 rue gobert, 75011 Paris","Téléphone : 09 52 79 20 26",R.drawable.p_h_gobert));
        items.add(new Item1("Eden Lodge Paris ","175 Rue De Charonne, 75011 Paris","Téléphone : 01 43 56 73 24",R.drawable.p_h_eden));
        items.add(new Item1("Hôtel de l'Avre","21 rue de l'Avre, 75015 Paris","Téléphone : 1 45 75 31 03",R.drawable.p_h_avre));
        items.add(new Item1("Europe Saint Severin-Paris Notre Dame","38,40 Rue Saint Severin, 75005 Paris","Téléphone : 01 46 34 05 70",R.drawable.p_h_europe));
        items.add(new Item1("Citadines Montmartre Paris","16 Avenue Rachel, 75018 Paris","Téléphone : 01 44 70 45 50",R.drawable.p_h_montmartre));

        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        recyclerView1.setAdapter(new MyAdapter1(getApplicationContext(),items));

    }
}