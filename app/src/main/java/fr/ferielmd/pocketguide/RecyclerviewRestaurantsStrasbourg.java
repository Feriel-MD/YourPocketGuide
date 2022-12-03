package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewRestaurantsStrasbourg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_restaurents_strasbourg);

        RecyclerView recyclerView15 = findViewById(R.id.recyclerview15);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Âme à Table","7 Rue du Vieux-Marché-aux-Poissons,\n67000 Strasbourg","Téléphone : 03 88 23 00 69",R.drawable.s_r_ame));
        items.add(new Item("Pierres et Gamelles","4 Rue des Charpentiers,\n67000 Strasbourg","Téléphone : 03 90 23 85 01",R.drawable.s_r_pierre));
        items.add(new Item("Brasserie K","3 Place de la Gare,\n67000 Strasbourg","Téléphone : 03 88 62 62 29",R.drawable.s_r_brasserie));
        items.add(new Item("O.Friend's","61 Rue du Faubourg-de-Pierre,\n67000 Strasbourg","Téléphone : 03 88 32 79 27",R.drawable.s_r_ofriend));
        items.add(new Item("Le 1741","22 quai des Bateliers,\n67000 Strasbourg","Téléphone : 03 88 35 50 50",R.drawable.s_r_dixsept));


        recyclerView15.setLayoutManager(new LinearLayoutManager(this));
        recyclerView15.setAdapter(new MyAdapter(getApplicationContext(),items,R.layout.item_view_restaurents_toulouse));
    }
}