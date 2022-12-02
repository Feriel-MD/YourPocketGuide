package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewHebergementsParis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_hebergements_paris);

        RecyclerView recyclerView1 = findViewById(R.id.recyclerview1);

        List<Item> items = new ArrayList<>();
        items.add(new Item("La Maison Gobert Paris Hotel Particulier","10 rue gobert,\n75011 Paris","Téléphone : 09 52 79 20 26",R.drawable.dakar));
        items.add(new Item("Eden Lodge Paris ","175 Rue De Charonne,\n75011 Paris","Téléphone : 01 43 56 73 24",R.drawable.dakar));
        items.add(new Item("Hôtel de l'Avre","21 rue de l'Avre,\n75015 Paris","Téléphone : 01 45 75 31 03",R.drawable.dakar));
        items.add(new Item("Europe Saint Severin-Paris Notre Dame","38,40 Rue Saint Severin,\n75005 Paris","Téléphone : 01 46 34 05 70",R.drawable.dakar));
        items.add(new Item("Citadines Montmartre Paris","16 Avenue Rachel,\n75018 Paris","Téléphone : 01 44 70 45 50",R.drawable.dakar));

        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        recyclerView1.setAdapter(new MyAdapter(getApplicationContext(),items,R.layout.item_view_hebergements_paris));

    }
}