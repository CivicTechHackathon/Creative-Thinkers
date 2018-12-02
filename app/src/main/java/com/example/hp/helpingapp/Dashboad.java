package com.example.hp.helpingapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Dashboad extends AppCompatActivity {


    FloatingActionButton btn;
    CardView card,card2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboad);

        btn= (FloatingActionButton)  findViewById(R.id.btnaddasg);
        card = (CardView) findViewById(R.id.asgCard);
        card2 = (CardView) findViewById(R.id.asgCard2) ;

        btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Dashboad.this, MainActivity.class);
                        startActivity(intent);

                    }
                });


        card.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent( Dashboad.this, Details.class );
                        startActivity(intent);
                    }
                });

        card2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                            Intent intent = new Intent(Dashboad.this, ngo.class);
                            startActivity(intent);
                    }
                });
    }
}
