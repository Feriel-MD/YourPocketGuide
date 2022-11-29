package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewRestaurents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerviewrestaurent);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Benidict","19 Rue Sainte-Croix de la Bretonnerie, 75004 Paris","Téléphone : 01 42 76 91 37",R.drawable.benidict));
        items.add(new Item("I GRAPPOLI","22 Pl. Denfert-Rochereau, 75014 Paris","Téléphone : 01 43 21 22 59",R.drawable.i_grappoli));
        items.add(new Item("PATROL - PARIS","2 Pl. Edmond Rostand, 75006 Paris","Téléphone : 01 53 19 82 70",R.drawable.patrol_paris));
        items.add(new Item("ORA - LA CASERNE","12 Rue Philippe de Girard, 75010 Paris","Téléphone : 06 75 70 59 72",R.drawable.ora_lacaserne));
        items.add(new Item("Neni Paris","12 Bd de Denain, 75010 Paris","Téléphone : 01 42 80 20 00",R.drawable.neni_france));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}