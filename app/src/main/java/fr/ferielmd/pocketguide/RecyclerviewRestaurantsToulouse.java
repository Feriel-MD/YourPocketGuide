package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewRestaurantsToulouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_restaurents_toulouse);

        RecyclerView recyclerView12 = findViewById(R.id.recyclerview12);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Le Lotus","24 Rue Jean Palaprat,\n31000 Toulouse","Téléphone :  09 88 42 02 60",R.drawable.lotus));
        items.add(new Item("La Verriere","7 Rue Joutx Aigues,\n31000 Toulouse","Téléphone : 05 61 47 28 35",R.drawable.verriere));
        items.add(new Item("Le Baratie","39 Boulevard des Récollets,\n31400 Toulouse","Téléphone : 05 67 06 32 34",R.drawable.baratie));
        items.add(new Item("Restaurant Saveurs et Musiques Du Monde","69 Gd Rue Saint-Michel,\n31400 Toulouse","Téléphone : 07 85 74 67 99",R.drawable.saveur));
        items.add(new Item("Le Bouillon Languedoc","4 Rue du Languedoc,\n31000 Toulouse","Téléphone : 05 67 22 59 66",R.drawable.bouillon));


        recyclerView12.setLayoutManager(new LinearLayoutManager(this));
        recyclerView12.setAdapter(new MyAdapter(getApplicationContext(),items,R.layout.item_view_restaurents_toulouse));
    }
}