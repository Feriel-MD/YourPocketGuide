package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewHebergementsLyon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_hebergemets_lyon);

        RecyclerView recyclerView5 = findViewById(R.id.recyclerview5);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Villa 216 ","216 Avenue Félix Faure,\n69003 Lyon","Téléphone : 07 86 58 02 03",R.drawable.villa));
        items.add(new Item("Le Jardin de Beauvoir ","8 rue de Trion,\n69005 Lyon ","Téléphone : 06 03 67 27 84",R.drawable.jardin));
        items.add(new Item("Bread et Couette ","12 Rue Louis Bouquet,\n69009 Lyon ","Téléphone : 07 68 85 23 55",R.drawable.bread));
        items.add(new Item("L’Atelier de Saint-Just ","22 Rue de Trion,\n69005 Lyon ","Téléphone : 04 72 57 49 55 ",R.drawable.atelier));
        items.add(new Item("LOGE DE L'OPERA","20 RUE JOSEPH SERLIN,\n69001 Lyon","Téléphone : 06 44 05 71 84",R.drawable.opera));

        recyclerView5.setLayoutManager(new LinearLayoutManager(this));
        recyclerView5.setAdapter(new MyAdapter(getApplicationContext(),items,R.layout.item_view_hebergement_lyon));
    }
}