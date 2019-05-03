package com.example.colmr.fyp_implementation_phase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SpeedSortInstructionsActivity extends AppCompatActivity implements View.OnLongClickListener {
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;
    private ImageView image7;
    private ImageView image8;
    private ImageView image9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_sort_instructions);
       /* image1 = (ImageView) findViewById(R.id.imageA);
        image1.setImageResource(R.drawable.tortoise);
        image1.setTag("Pets");
        image1.setOnLongClickListener(this);
        image2 = (ImageView) findViewById(R.id.imageB);
        image2.setImageResource(R.drawable.budgie);
        image2.setTag("Pets");
        image2.setOnLongClickListener(this);
        image3 = (ImageView) findViewById(R.id.imageC);
        image3.setImageResource(R.drawable.rabbit);
        image3.setTag("Pets");
        image3.setOnLongClickListener(this);*/
        image3 = findViewById(R.id.imageA);
        image3.setImageResource(R.drawable.up_arrow);
        //image3.setTag("Pets");
        //image4.setOnLongClickListener(this);
        image4 =  findViewById(R.id.imageB);
        image4.setImageResource(R.drawable.dog);
        //image4.setTag("Pets");
        //image4.setOnLongClickListener(this);
        image5 =  findViewById(R.id.imageC);
        image5.setImageResource(R.drawable.bicycle);
        //image5.setTag("Mobility");
        //image5.setOnLongClickListener(this);
        image6 =  findViewById(R.id.imageD);
        image6.setImageResource(R.drawable.flowers);
        //image6.setTag("Garden");
        //image6.setOnLongClickListener(this);
       /* image7 = (ImageView) findViewById(R.id.imageG);
        image7.setImageResource(R.drawable.cat);
        image7.setTag("Pets");
        image7.setOnLongClickListener(this);
        image8 = (ImageView) findViewById(R.id.imageH);
        image8.setImageResource(R.drawable.gold_fish);
        image8.setTag("Pets");
        image8.setOnLongClickListener(this);
        image9 = (ImageView) findViewById(R.id.imageI);
        image9.setImageResource(R.drawable.cup);
        image9.setTag("Kitchen");
        image9.setOnLongClickListener(this);*/
    }
    public void continueToGame (View v){
        Intent games_menu_item_1_intent = new Intent(SpeedSortInstructionsActivity.this, SpeedSortActivity.class);
        startActivity(games_menu_item_1_intent);
    }
    public void backToMenu (View v){
        Intent games_menu_item_1_intent = new Intent(SpeedSortInstructionsActivity.this, GamesMenuActivity.class);
        startActivity(games_menu_item_1_intent);
    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }
}
