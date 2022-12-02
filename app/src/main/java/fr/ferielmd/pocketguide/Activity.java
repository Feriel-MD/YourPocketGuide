package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity extends AppCompatActivity {

    ImageButton imageButton;
    ImageButton imageButton1;
    ImageButton imageButton2;
    Class restaurant = null;
    Class activite = null;
    Class hebergement = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        imageButton = findViewById(R.id.imageButton);
        imageButton1 = findViewById(R.id.imageButton1);
        imageButton2 = findViewById(R.id.imageButton2);
        /* Permet de savoir sur quelle ville on a appuyé afin de savoir quelle recyclerview générer ensuite */
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("view");

            if (value.equals("paris")) {
                restaurant = RecyclerviewRestaurantsParis.class;
                activite = RecyclerviewActivitesParis.class;
                hebergement = RecyclerviewHebergementsParis.class;

            }

            if (value.equals("lyon")) {
                restaurant = RecyclerviewRestaurantsLyon.class;
                activite = RecyclerviewActivitesLyon.class;
                hebergement = RecyclerviewHebergementsLyon.class;

            }

            if (value.equals("marseille")) {
                restaurant = RecyclerviewRestaurantsMarseille.class;
                activite = RecyclerviewActivitesMarseille.class;
                hebergement = RecyclerviewHebergementsMarseille.class;

            }

            if (value.equals("nantes")) {
                restaurant = RecyclerviewRestaurantsNantes.class;
                activite = RecyclerviewActivitesNantes.class;
                hebergement = RecyclerviewHebergementsNantes.class;

            }

            if (value.equals("toulouse")) {
                restaurant = RecyclerviewRestaurantsToulouse.class;
                activite = RecyclerviewActivitesToulouse.class;
                hebergement = RecyclerviewHebergementsToulouse.class;

            }

            if (value.equals("strasbourg")) {
                restaurant = RecyclerviewRestaurantsStrasbourg.class;
                activite = RecyclerviewActivitesStrasbourg.class;
                hebergement = RecyclerviewHebergementsStrasbourg.class;

            }

        }

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity.this, restaurant);
                startActivity(i);
                //finish();
            }
        });

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity.this, activite);
                startActivity(i);
                //finish();
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity.this, hebergement);
                startActivity(i);
                //finish();
            }
        });

    }
}