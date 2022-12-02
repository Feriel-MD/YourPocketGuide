package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewRestaurantsLyon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_restaurents_lyon);

        RecyclerView recyclerView3 = findViewById(R.id.recyclerview3);

        List<Item> items = new ArrayList<>();
        items.add(new Item("LASKA","13 rue Terraille,\n69001 Lyon ","Téléphone : 04 78 98 86 30",R.drawable.laska));
        items.add(new Item("LES TROIS DOMES","20, quai Gailleton,\n69002 Lyon ","Téléphone : 04 72 41 20 97",R.drawable.domes));
        items.add(new Item("IODE","2 Rue des Marronniers,\n69002 Lyon","Téléphone : 04 78 92 94 24",R.drawable.iode));
        items.add(new Item("LYON DAKAR","227 rue de Créqui,\n69003 Lyon","Téléphone : 04 78 62 29 54",R.drawable.dakar));
        items.add(new Item("GOURMET BAR CONFLUENCE","3 rue Paul Montrochet,\n69002 Lyon","Téléphone : 04 37 23 64 14",R.drawable.gourmet));


        recyclerView3.setLayoutManager(new LinearLayoutManager(this));
        recyclerView3.setAdapter(new MyAdapter(getApplicationContext(),items,R.layout.item_view_restaurents_lyon));
    }
}