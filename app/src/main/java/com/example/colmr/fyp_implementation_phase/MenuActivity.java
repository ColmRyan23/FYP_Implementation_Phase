package com.example.colmr.fyp_implementation_phase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        }

        public void games (View v){
            Intent menu_item_1_intent = new Intent(MenuActivity.this, GamesMenuActivity.class);
            startActivity(menu_item_1_intent);
        }
}
