package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewActivitesToulouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_activites_toulouse);

        RecyclerView recyclerView13 = findViewById(R.id.recyclerview13);

        List<Item13> items = new ArrayList<>();
        items.add(new Item13("Le Canal du Midi à Vélo","89 Bd Pierre Semard,\n31500 Toulouse","Téléphone : 09 53 55 33 83",R.drawable.velo));
        items.add(new Item13("Croisière sur la Garonne","Port de la Daurade,\n31000 Toulouse","Téléphone : 05 61 80 22 26",R.drawable.croisiere));
        items.add(new Item13("Let’s visit Airbus","All. André Turcat,\n31700 Blagnac","Téléphone : 005 34 39 42 00",R.drawable.airbus));
        items.add(new Item13("La Place du Capitole","Place du Capitole,\n31000 Toulouse","Téléphone : 05 17 42 31 31",R.drawable.capitole));
        items.add(new Item13("La Basilique Saint-Sernin","13 place Saint-Sernin,\n31000 Toulouse","Téléphone : 05 61 21 80 45",R.drawable.basilique));


        recyclerView13.setLayoutManager(new LinearLayoutManager(this));
        recyclerView13.setAdapter(new MyAdapter13(getApplicationContext(),items));
    }
}