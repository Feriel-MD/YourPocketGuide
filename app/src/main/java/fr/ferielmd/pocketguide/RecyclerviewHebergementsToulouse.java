package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewHebergementsToulouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_hebergemets_toulouse);

        RecyclerView recyclerView14 = findViewById(R.id.recyclerview14);

        List<Item> items = new ArrayList<>();
        items.add(new Item("The Social Hub Toulouse","1 Rue de Sébastopol,\n31000 Toulouse","Téléphone :  05 82 88 10 60",R.drawable.t_h_hub));
        items.add(new Item("Le Clocher de Rodez","14 & 15 Place Jeanne d'Arc,\n31000 Toulouse","Téléphone : 05 61 62 42 92",R.drawable.t_h_clocher));
        items.add(new Item("L’Insolite","40 Rue Paul Valéry,\n31000 Toulouse","Téléphone : 06 23 09 14 09",R.drawable.t_h_insolite));
        items.add(new Item("Eklo","181 Avenue de Grande Bretagne,\n31300 Toulouse","\nTéléphone : 05 82 95 92 31",R.drawable.t_h_eklo));
        items.add(new Item("Residhome","105 Boulevard de l'Embouchure,\n31200 Toulouse","\nTéléphone : 05 34 57 33 00",R.drawable.t_h_residhome));


        recyclerView14.setLayoutManager(new LinearLayoutManager(this));
        recyclerView14.setAdapter(new MyAdapter(getApplicationContext(),items,R.layout.item_view_hebergement_toulouse));
    }
}