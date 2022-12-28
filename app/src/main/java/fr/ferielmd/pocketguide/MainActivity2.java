package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/* *******************************************
Affichage d ela liste des différentes villes
On initialise de boutons auxquels on affecte le nom des villes
**********************************************/

public class MainActivity2 extends AppCompatActivity {
    ImageButton btn ,btn1,btn2,btn3,btn4,btn5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        btn = findViewById(R.id.btn);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, Activity.class);
                i.putExtra("view","paris");
                startActivity(i);
                //finish();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, Activity.class);
                i.putExtra("view","lyon");
                startActivity(i);
                //finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,Activity.class);
                i.putExtra("view","marseille");
                startActivity(i);
                //finish();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,Activity.class);
                i.putExtra("view","nantes");
                startActivity(i);
                //finish();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,Activity.class);
                i.putExtra("view","toulouse");
                startActivity(i);
                //finish();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,Activity.class);
                i.putExtra("view","strasbourg");
                startActivity(i);
                //finish();
            }
        });

    }
}