package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewRestaurentsMarseille extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_restaurents_marseille);

        RecyclerView recyclerView6 = findViewById(R.id.recyclerview6);

        List<Item6> items = new ArrayList<>();
        items.add(new Item6("La Délicatesse","7 Bd de la Libération,\n13001 Marseille","Téléphone : 09 81 81 85 95",R.drawable.m_r_delicatesse));
        items.add(new Item6("La Poule Noire","61 Rue Sainte, 13001 Marseille","Téléphone : 04 91 55 68 86",R.drawable.m_r_poulenoire));
        items.add(new Item6("Chez Marinette","27 Rue Joël Recher, 13007 Marseille","Téléphone : 07 82 10 06 46",R.drawable.m_r_marinette));
        items.add(new Item6("Giorgia","45 Rue Sainte, 13001 Marseille","Téléphone : 06 17 21 24 52",R.drawable.m_r_giorgia));
        items.add(new Item6("Restaurant l'Inattendu","35 Rue de la Paix Marcel Paul, 13001 Marseille","Téléphone : 06 15 06 44 56",R.drawable.m_r_linattendu));

        
        recyclerView6.setLayoutManager(new LinearLayoutManager(this));
        recyclerView6.setAdapter(new MyAdapter6(getApplicationContext(),items));
    }
}