package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewHebergementsMarseille extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_hebergemets_marseille);

        RecyclerView recyclerView8 = findViewById(R.id.recyclerview8);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Les Appartements du Vieux Port","48 rue Vacon, 13001 Marseille","Téléphone : 04 91 33 73 83",R.drawable.m_h_appartvieuxport));
        items.add(new Item("Maison Juste","28 Rue Balthazar-Dieudé, Castellane et Préfecture, 13006 Marseille","\nTéléphone : 06 23 63 19 77",R.drawable.maisonjuste));
        items.add(new Item("MaisonMars","47 Rue de Suez, 13007 Marseille","Téléphone : 06 20 12 61 76",R.drawable.maisonmars));
        items.add(new Item("Sofitel Marseille Vieux-Port","36 Boulevard Charles Livon, 13007 Marseille","Téléphone : 04 91 15 59 00",R.drawable.sofitel));
        items.add(new Item("Residhotel Le Grand Prado","7 Sq. des Frères Ambrogiani, 13008 Marseille","Téléphone : 04 91 17 70 50",R.drawable.residhotel));


        recyclerView8.setLayoutManager(new LinearLayoutManager(this));
        recyclerView8.setAdapter(new MyAdapter(getApplicationContext(),items,R.layout.item_view_hebergement_marseille));
    }
}