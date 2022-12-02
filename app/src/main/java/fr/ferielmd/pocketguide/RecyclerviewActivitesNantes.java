package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewActivitesNantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_activites_nantes);

        RecyclerView recyclerView10 = findViewById(R.id.recyclerview10);

        List<Item10> items = new ArrayList<>();
        items.add(new Item10("Visite du Château des Ducs de Bretagne","4 Pl. Marc Elder,\n44000 Nantes","Téléphone : 02 51 17 49 48",R.drawable.chateau));
        items.add(new Item10("Les Machines de l’île","2 Boulevard Léon Bureau,\n44200 Nantes","Téléphone : 08 10 12 12 25",R.drawable.machines));
        items.add(new Item10("l’Estuaire","9 rue des Etats,\n44000 Nantes","Téléphone : 02 72 64 04 79",R.drawable.estuaire));
        items.add(new Item10("Découverte du Planétarium","8 rue des Acadiens,\n44100 Nantes","Téléphone : 02 40 73 99 23",R.drawable.planetarium));
        items.add(new Item10("Visite de la Cathédrale Saint-Pierre-et-Saint-Paul","7 Imp. Saint-Laurent,\n44000 Nantes","Téléphone : 02 40 47 84 64",R.drawable.cathedrale));


        recyclerView10.setLayoutManager(new LinearLayoutManager(this));
        recyclerView10.setAdapter(new MyAdapter10(getApplicationContext(),items));
    }
}