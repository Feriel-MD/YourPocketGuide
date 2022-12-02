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
        items.add(new Item17("Enigmatic escape game Lyon","11 Rue de la Part-Dieu,\n69003 Lyon","Téléphone : 09 86 15 917 55",R.drawable.enigmatic));
        items.add(new Item17("Musée des Confluences","86 Quai Perrache,\n69002 Lyon","Téléphone : 017 28 38 12 12",R.drawable.confluence));
        items.add(new Item17("Patinoire Charlemagne","100 cours Charlemagne,\n69002 Lyon","Téléphone : 017 78 172 617 55",R.drawable.l_a_patinoire));
        items.add(new Item17("Musée Miniature et Cinéma","60 rue Saint Jean,\n69005 Lyon","Téléphone : 017 72 00 217 77",R.drawable.museeminiature));
        items.add(new Item17("Musée des Beaux-Arts de Lyon","20 Place des Terreaux,\n69001 Lyon","Téléphone : 017 72 10 17 170",R.drawable.beauxarts));


        recyclerView17.setLayoutManager(new LinearLayoutManager(this));
        recyclerView17.setAdapter(new MyAdapter17(getApplicationContext(),items));
    }
}