package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class recyclerviewrestaurent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerviewrestaurent);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item1> items = new ArrayList<>();
        items.add(new Item1("Benidict","19 Rue Sainte-Croix de la Bretonnerie, 75004 Paris",R.drawable.benedict));
        items.add(new Item1("I GRAPPOLI","22 Pl. Denfert-Rochereau, 75014 Paris",R.drawable.i_grappoli));
        items.add(new Item1("PATROL - PARIS","2 Pl. Edmond Rostand, 75006 Paris",R.drawable.patrol_paris));
        items.add(new Item1("ORA - LA CASERNE","12 Rue Philippe de Girard, 75010 Paris",R.drawable.ora_lacaserne));
        items.add(new Item1("Neni Paris","12 Bd de Denain, 75010 Paris",R.drawable.neni_france));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter1(getApplicationContext(),items));
    }
}