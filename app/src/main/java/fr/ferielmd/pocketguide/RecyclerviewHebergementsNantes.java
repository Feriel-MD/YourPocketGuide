package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewHebergementsNantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_hebergemets_nantes);

        RecyclerView recyclerView11 = findViewById(R.id.recyclerview11);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Surprenantes","86 quai de la Fosse,\n44100 Nantes","Téléphone : 06 38 44 49 98",R.drawable.n_h_surprenantes));
        items.add(new Item("La Maison d'Hôtes Nantes Centre","14 rue Malherbe,\n44000 Nantes","Téléphone : 06 13 80 28 49",R.drawable.n_h_maison));
        items.add(new Item("Marc's Flat - Calm & Cosy","16 bis rue Albert Calmette,\n44300 Nantes","Téléphone : 011 78 112 611 55",R.drawable.n_h_marc));
        items.add(new Item("Les machines de Jules","2 Rue de l'Échelle,\n44000 Nantes","Téléphone : 07 66 40 57 85",R.drawable.n_h_jules));
        items.add(new Item("La Rivière House - Péniche Carpe Diem","65 Rue du Port Durand,\n44300 Nantes","Téléphone : 07 66 51 35 21",R.drawable.n_h_peniche));


        recyclerView11.setLayoutManager(new LinearLayoutManager(this));
        recyclerView11.setAdapter(new MyAdapter(getApplicationContext(),items,R.layout.item_view_hebergement_nantes));
    }
}