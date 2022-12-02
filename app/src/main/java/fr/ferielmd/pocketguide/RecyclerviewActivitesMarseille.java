package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewActivitesMarseille extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_activites_marseille);

        RecyclerView recyclerView7 = findViewById(R.id.recyclerview7);

        List<Item7> items = new ArrayList<>();
        items.add(new Item7("Le musée des Civilisations de l'Europe et de la Méditerranée (MuCEM)"," 1 Esp. J4,\n13002 Marseille","Téléphone : 04 84 35 13 13",R.drawable.muceum));
        items.add(new Item7("La Basilique Notre-Dame-de-la-Garde","9 Pl. des Combattants,\n91310 Longpont-sur-Orgen","Téléphone : 01 69 01 02 24",R.drawable.notre_dame_marseille));
        items.add(new Item7("La Cathédrale de la Major","Pl. de la Major,\n13002 Marseille","Téléphone : 04 91 90 52 87",R.drawable.majormarseille));
        items.add(new Item7("Le Stade Vélodrome","3 Bd Michelet,\n13008 Marseille","Téléphone : 04 13 64 64 64",R.drawable.velodrome));
        items.add(new Item7("Le palais Longchamp","Bd Jard. Zoologique,\n13004 Marseille","Téléphone : 04 91 55 25 51",R.drawable.longchamp));

        recyclerView7.setLayoutManager(new LinearLayoutManager(this));
        recyclerView7.setAdapter(new MyAdapter7(getApplicationContext(),items));
    }
}