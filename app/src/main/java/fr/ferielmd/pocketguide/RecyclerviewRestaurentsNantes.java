package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewRestaurentsNantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_restaurents_nantes);

        RecyclerView recyclerView9 = findViewById(R.id.recyclerview9);

        List<Item9> items = new ArrayList<>();
        items.add(new Item9("Lë Bö Vins","6 Rue des Petites Écuries 44000 Nantes","Téléphone : 02 55 10 27 12",R.drawable.n_r_bovin));
        items.add(new Item9("Les Epices de l’Inde","7 Rue de Mazagran, 44100 Nantes","Téléphone : 02 40 47 35 04",R.drawable.n_r_indien));
        items.add(new Item9("Terrazze Di Bouffay","Rue du Vieil Hôpital, 44000 Nantes","Téléphone : 02 72 25 59 68",R.drawable.n_r_terrazze));
        items.add(new Item9("Coin de Jasmine","2 Place René Bouhier, 44100 Nantes","Téléphone : 07 66 00 22 82",R.drawable.jasmine));
        items.add(new Item9("L’Alsacien","15 Allée Commandant Charcot, 44000 Nantes","Téléphone : 02 40 37 73 54",R.drawable.n_r_alsacien));


        recyclerView9.setLayoutManager(new LinearLayoutManager(this));
        recyclerView9.setAdapter(new MyAdapter9(getApplicationContext(),items));
    }
}