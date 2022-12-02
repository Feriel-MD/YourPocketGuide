package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewRestaurentsStrasbourg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_restaurents_strasbourg);

        RecyclerView recyclerView15 = findViewById(R.id.recyclerview15);

        List<Item15> items = new ArrayList<>();
        items.add(new Item15("Âme à Table","7 Rue du Vieux Marché aux Poissons,\n67000 Strasbourg","Téléphone : 03 88 23 00 69",R.drawable.ame));
        items.add(new Item15("Pierres et Gamelles","4 Rue des Charpentiers,\n67000 Strasbourg","Téléphone : 03 90 23 85 01",R.drawable.pierre));
        items.add(new Item15("Brasserie K","3 Place de la Gare,\n67000 Strasbourg","Téléphone : 03 88 62 62 29",R.drawable.brasserie));
        items.add(new Item15("O.Friend's","61 Rue du Faubourg-de-Pierre,\n67000 Strasbourg","Téléphone : 03 88 32 79 27",R.drawable.ofriend));
        items.add(new Item15("Le 1741","22 quai des Bateliers,\n67000 Strasbourg","Téléphone : 03 88 35 50 50",R.drawable.dixsept));


        recyclerView15.setLayoutManager(new LinearLayoutManager(this));
        recyclerView15.setAdapter(new MyAdapter15(getApplicationContext(),items));
    }
}