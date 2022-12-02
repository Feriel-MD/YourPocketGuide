package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewRestaurentsParis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_restaurent_paris);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item0> items = new ArrayList<>();
        items.add(new Item0("Benidict","19 Rue Sainte-Croix de la Bretonnerie,\n75004 Paris","Téléphone : 01 42 76 91 37",R.drawable.benidict));
        items.add(new Item0("I GRAPPOLI","22 Pl. Denfert-Rochereau,\n75014 Paris","Téléphone : 01 43 21 22 59",R.drawable.i_grappoli));
        items.add(new Item0("PATROL - PARIS","2 Pl. Edmond Rostand,\n75006 Paris","Téléphone : 01 53 19 82 70",R.drawable.patrol_paris));
        items.add(new Item0("ORA - LA CASERNE","12 Rue Philippe de Girard,\n75010 Paris","Téléphone : 06 75 70 59 72",R.drawable.ora_lacaserne));
        items.add(new Item0("Neni Paris","12 Bd de Denain,\n75010 Paris","Téléphone : 01 42 80 20 00",R.drawable.neni_france));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter0(getApplicationContext(),items));
    }
}