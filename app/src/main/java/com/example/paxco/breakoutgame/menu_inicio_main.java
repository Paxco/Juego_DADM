package com.example.paxco.breakoutgame;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class menu_inicio_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_inicio);

        final Button botoncito = (Button) findViewById(R.id.botoncito);
        botoncito.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent actividad= new Intent(menu_inicio_main.this , BreakoutGame.class);
                startActivity(actividad);
            }
        });



    }
}

