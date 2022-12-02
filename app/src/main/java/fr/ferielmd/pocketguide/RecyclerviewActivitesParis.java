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

        List<Item> items = new ArrayList<>();
        items.add(new Item("Sainte-Chapelle","10 Bd du Palais,\n75001 Paris","Téléphone : 01 53 40 60 80",R.drawable.sainte_chapelle));
        items.add(new Item("Musée du Louvre","Rue de Rivoli,\n75001 Paris","Téléphone : 01 40 20 50 50",R.drawable.louvre));
        items.add(new Item("Panthéon","Pl. du Panthéon,\n75005 Paris","Téléphone : 01 44 32 18 00",R.drawable.pantheon));
        items.add(new Item("Musée d'Orsay","1 Rue de la Légion d'Honneur,\n75007 Paris","Téléphone : 01 40 49 48 14",R.drawable.dakar));
        items.add(new Item("Cathédrale Notre-Dame de Paris","6 Parvis Notre-Dame - Pl. Jean-Paul II,\n75004 Paris","Téléphone : 01 42 34 56 10",R.drawable.dakar));

        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.setAdapter(new MyAdapter(getApplicationContext(),items,R.layout.item_view_activites_paris));
    }
}