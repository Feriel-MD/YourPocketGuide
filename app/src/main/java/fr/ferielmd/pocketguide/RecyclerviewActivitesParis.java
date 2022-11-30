package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewActivitesParis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_activites_paris);

        RecyclerView recyclerView2 = findViewById(R.id.recyclerview2);

        List<Item2> items = new ArrayList<>();
        items.add(new Item2("Sainte-Chapelle","10 Bd du Palais, 75001 Paris","Téléphone : 01 53 40 60 80",R.drawable.sainte_chapelle));
        items.add(new Item2("Musée du Louvre","Rue de Rivoli, 75001 Paris","Téléphone : 01 40 20 50 50",R.drawable.louvre));
        items.add(new Item2("Panthéon","Pl. du Panthéon, 75005 Paris","Téléphone : 01 44 32 18 00",R.drawable.pantheon));
        items.add(new Item2("Musée d'Orsay","1 Rue de la Légion d'Honneur, 75007 Paris","Téléphone : 01 40 49 48 14",R.drawable.orsay));
        items.add(new Item2("Cathédrale Notre-Dame de Paris","6 Parvis Notre-Dame - Pl. Jean-Paul II, 75004 Paris","Téléphone : 01 42 34 56 10",R.drawable.notre_dame));

        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.setAdapter(new MyAdapter2(getApplicationContext(),items));
    }
}