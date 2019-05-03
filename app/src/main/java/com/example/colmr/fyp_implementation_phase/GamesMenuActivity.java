package com.example.colmr.fyp_implementation_phase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GamesMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_menu);
    }

    public void gamesItem1 (View v){
        Intent games_menu_item_1_intent = new Intent(GamesMenuActivity.this, SpeedSortLevelsActivity.class);
        startActivity(games_menu_item_1_intent);
    }
}
