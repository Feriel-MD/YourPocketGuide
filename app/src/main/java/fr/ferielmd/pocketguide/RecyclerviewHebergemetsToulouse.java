package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewHebergemetsToulouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_hebergemets_toulouse);

        RecyclerView recyclerView14 = findViewById(R.id.recyclerview14);

        List<Item14> items = new ArrayList<>();
        items.add(new Item14("Le Lotus","24 Rue Jean Palaprat,\n31000 Toulouse","Téléphone :  09 88 42 02 60",R.drawable.lotus));
        items.add(new Item14("La Verriere","7 Rue Joutx Aigues,\n31000 Toulouse","Téléphone : 05 61 47 28 35",R.drawable.verriere));
        items.add(new Item14("Le Baratie","39 Boulevard des Récollets,\n31400 Toulouse","Téléphone : 05 67 06 32 34",R.drawable.baratie));
        items.add(new Item14("Restaurant Saveurs et Musiques Du Monde","69 Gd Rue Saint-Michel,\n31400 Toulouse","Téléphone : 07 85 74 67 99",R.drawable.saveur));
        items.add(new Item14("Le Bouillon Languedoc","4 Rue du Languedoc,\n31000 Toulouse","Téléphone : 05 67 22 59 66",R.drawable.bouillon));


        recyclerView14.setLayoutManager(new LinearLayoutManager(this));
        recyclerView14.setAdapter(new MyAdapter14(getApplicationContext(),items));
    }
}