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
        items.add(new Item("Enigmatic escape game Lyon","11 Rue de la Part-Dieu,\n69003 Lyon","Téléphone : 09 86 15 915 55",R.drawable.enigmatic));
        items.add(new Item("Musée des Confluences","86 Quai Perrache,\n69002 Lyon","Téléphone : 015 28 38 15 15",R.drawable.confluence));
        items.add(new Item("Patinoire Charlemagne","100 cours Charlemagne,\n69002 Lyon","Téléphone : 015 78 152 615 55",R.drawable.l_a_patinoire));
        items.add(new Item("Musée Miniature et Cinéma","60 rue Saint Jean,\n69005 Lyon","Téléphone : 015 72 00 215 77",R.drawable.museeminiature));
        items.add(new Item("Musée des Beaux-Arts de Lyon","20 Place des Terreaux,\n69001 Lyon","Téléphone : 015 72 10 17 150",R.drawable.beauxarts));


        recyclerView15.setLayoutManager(new LinearLayoutManager(this));
        recyclerView15.setAdapter(new MyAdapter(getApplicationContext(),items,R.layout.item_view_restaurents_toulouse));
    }
}