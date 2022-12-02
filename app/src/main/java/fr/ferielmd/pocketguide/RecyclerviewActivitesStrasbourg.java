package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewActivitesStrasbourg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_activites_strasbourg);

        RecyclerView recyclerView16 = findViewById(R.id.recyclerview16);

        List<Item16> items = new ArrayList<>();
        items.add(new Item16("Enigmatic escape game Lyon","11 Rue de la Part-Dieu,\n69003 Lyon","Téléphone : 09 86 15 916 55",R.drawable.enigmatic));
        items.add(new Item16("Musée des Confluences","86 Quai Perrache,\n69002 Lyon","Téléphone : 016 28 38 12 12",R.drawable.confluence));
        items.add(new Item16("Patinoire Charlemagne","100 cours Charlemagne,\n69002 Lyon","Téléphone : 016 78 162 616 55",R.drawable.l_a_patinoire));
        items.add(new Item16("Musée Miniature et Cinéma","60 rue Saint Jean,\n69005 Lyon","Téléphone : 016 72 00 216 77",R.drawable.museeminiature));
        items.add(new Item16("Musée des Beaux-Arts de Lyon","20 Place des Terreaux,\n69001 Lyon","Téléphone : 016 72 10 17 160",R.drawable.beauxarts));


        recyclerView16.setLayoutManager(new LinearLayoutManager(this));
        recyclerView16.setAdapter(new MyAdapter16(getApplicationContext(),items));
    }
}