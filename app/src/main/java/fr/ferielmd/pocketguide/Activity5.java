package fr.ferielmd.pocketguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity5 extends AppCompatActivity {

    ImageButton imageButton;
    ImageButton imageButton1;
    ImageButton imageButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);

        /*imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity5.this, RecyclerviewRestaurentsParis.class);
                startActivity(i);
                //finish();
            }
        });

        mageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity5.this, RecyclerviewActivitesParis.class);
                startActivity(i);
                //finish();
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity5.this, RecyclerviewHebergementsParis.class);
                startActivity(i);
                //finish();
            }
        });*/
    }
}