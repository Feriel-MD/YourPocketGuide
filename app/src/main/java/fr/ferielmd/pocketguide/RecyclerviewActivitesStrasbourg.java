package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewActivitesStrasbourg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_activites_strasbourg);

        RecyclerView recyclerView16 = findViewById(R.id.recyclerview16);

        List<Item> items = new ArrayList<>();
        items.add(new Item("La Cathédrale Notre-Dame","Pl. de la Cathédrale,\n67000 Strasbourg","Téléphone : 03 88 21 43 34",R.drawable.notre_dame_marseille));
        items.add(new Item("La Neustadt","La Neustadt,\n67000 Strasbourg","Téléphone : 03 88 52 28 28",R.drawable.neustadt));
        items.add(new Item("Le Barrage Vauban","Pl. du Qur Blanc,\n67000 Strasbourg","Téléphone : 03 88 52 28 28",R.drawable.barrage));
        items.add(new Item("Le Musée d’Art moderne et contemporain"," Place Hans Jean Arp,\n67000 Strasbourg","Téléphone : 03 68 98 50 00",R.drawable.musee));
        items.add(new Item("Le Jardin des deux rives","3 rue des Cavaliers,\n67000 Strasbourg","Téléphone : 03 88 52 28 28",R.drawable.s_a_jardin));


        recyclerView16.setLayoutManager(new LinearLayoutManager(this));
        recyclerView16.setAdapter(new MyAdapter(getApplicationContext(),items,R.layout.item_view_activites_strasbourg));
    }
}