package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewHebergementsStrasbourg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_hebergemets_strasbourg);

        RecyclerView recyclerView17 = findViewById(R.id.recyclerview17);

        List<Item> items = new ArrayList<>();
        items.add(new Item("The People","7 Rue de la Krutenau,\n67000 Strasbourg","Téléphone : 09 78 36 20 27",R.drawable.s_h_people));
        items.add(new Item("Aloft Strasbourg Etoile","2 Av. du Rhin,\n67100 Strasbourg","Téléphone : 03 67 70 78 10",R.drawable.s_h_aloft));
        items.add(new Item("Citadines Eurometropole","11 Allée de l’Euro,\n67205 Strasbourg","Téléphone : 03 67 70 78 00",R.drawable.s_h_citadines));
        items.add(new Item("Cerise Strasbourg","5 Rue Job,\n67100 Strasbourg","Téléphone : 03 88 40 21 08",R.drawable.s_h_cerise));
        items.add(new Item("Le Relais de l'Orangerie","5 allée Spach,\n67000 Strasbourg","Téléphone : 06 29 32 05 23",R.drawable.s_h_relais));


        recyclerView17.setLayoutManager(new LinearLayoutManager(this));
        recyclerView17.setAdapter(new MyAdapter(getApplicationContext(),items,R.layout.item_view_hebergement_strasbourg));
    }
}