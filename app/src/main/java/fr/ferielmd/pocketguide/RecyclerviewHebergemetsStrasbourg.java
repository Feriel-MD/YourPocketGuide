package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewHebergemetsStrasbourg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_hebergemets_strasbourg);

        RecyclerView recyclerView17 = findViewById(R.id.recyclerview17);

        List<Item17> items = new ArrayList<>();
        items.add(new Item17("The People","7 Rue de la Krutenau,\n67000 Strasbourg","Téléphone : 09 78 36 20 27",R.drawable.people));
        items.add(new Item17("Aloft Strasbourg Etoile","2 Av. du Rhin,\n67100 Strasbourg ","Téléphone : 03 67 70 78 10",R.drawable.aloft));
        items.add(new Item17("Citadines Eurometropole","11 Allée de l’Euro,\n67205 Strasbourg","Téléphone : 03 67 70 78 00",R.drawable.citadines));
        items.add(new Item17("Cerise Strasbourg","5 Rue Job,\n67100 Strasbourg","Téléphone : 03 88 40 21 08",R.drawable.cerise));
        items.add(new Item17("Le Relais de l'Orangerie ","5 allée Spach,\n67000 Strasbourg","Téléphone : 06 29 32 05 23",R.drawable.relais));


        recyclerView17.setLayoutManager(new LinearLayoutManager(this));
        recyclerView17.setAdapter(new MyAdapter17(getApplicationContext(),items));
    }
}