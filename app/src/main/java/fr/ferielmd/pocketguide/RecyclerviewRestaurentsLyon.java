package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewRestaurentsLyon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_restaurents_lyon);

        RecyclerView recyclerView3 = findViewById(R.id.recyclerview3);

        List<Item3> items = new ArrayList<>();
        items.add(new Item3("LASKA","13 rue Terraille, 69001 Lyon ","Téléphone : 04 78 98 86 30",R.drawable.laska));
        items.add(new Item3("LES TROIS DOMES","20, quai Gailleton, 69002 Lyon ","Téléphone : 04 72 41 20 97",R.drawable.domes));
        items.add(new Item3("IODE","2 Rue des Marronniers, 69002 Lyon","Téléphone : 04 78 92 94 24",R.drawable.iode));
        items.add(new Item3("LYON DAKAR","227 rue de Créqui, 69003 Lyon","Téléphone : 04 78 62 29 54",R.drawable.dakar));
        items.add(new Item3("GOURMET BAR CONFLUENCE","3 rue Paul Montrochet, 69002 Lyon","Téléphone : 04 37 23 64 14",R.drawable.gourmet));


        recyclerView3.setLayoutManager(new LinearLayoutManager(this));
        recyclerView3.setAdapter(new MyAdapter3(getApplicationContext(),items));
    }
}