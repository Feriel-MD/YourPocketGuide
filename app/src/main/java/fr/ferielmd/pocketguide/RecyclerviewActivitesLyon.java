package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewActivitesLyon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_activites_lyon);

        RecyclerView recyclerView4 = findViewById(R.id.recyclerview4);

        List<Item4> items = new ArrayList<>();
        items.add(new Item4("Enigmatic escape game Lyon","11 Rue de la Part-Dieu, 69003 Lyon","Téléphone : 09 86 15 94 55",R.drawable.enigmatic));
        items.add(new Item4("Musée des Confluences","86 Quai Perrache, 69002 Lyon","Téléphone : 04 28 38 12 12",R.drawable.confluence));
        items.add(new Item4("Patinoire Charlemagne","100 cours Charlemagne, 69002 Lyon","Téléphone : 04 78 42 64 55 ",R.drawable.l_a_patinoire));
        items.add(new Item4("Musée Miniature et Cinéma","60 rue Saint Jean, 69005 Lyon","Téléphone : 04 72 00 24 77",R.drawable.museeminiature));
        items.add(new Item4("Musée des Beaux-Arts de Lyon","20 Place des Terreaux, 69001 Lyon","Téléphone : 04 72 10 17 40",R.drawable.beauxarts));


        recyclerView4.setLayoutManager(new LinearLayoutManager(this));
        recyclerView4.setAdapter(new MyAdapter4(getApplicationContext(),items));
    }
}