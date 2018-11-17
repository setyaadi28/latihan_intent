package com.setyaadidev.itumeetup4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.setyaadidev.itumeetup4.presenter.IntentPresenter;

public class MainActivity extends AppCompatActivity {
    // TODO format penamaan variable
    // TODO TypeData namaVariable (dengan syarat cammelCase)
    Button btnIntentExplicit;
    Button btnIntentImplicit;
    IntentPresenter intentExplicitPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO menyambungkan antara Java ke XML dengan bantuan findViewById
        btnIntentExplicit = findViewById(R.id.btn_intent_explicit);
        btnIntentImplicit= findViewById(R.id.btn_intent_implicit);
        intentExplicitPresenter = new IntentPresenter();
        btnIntentExplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentExplicitPresenter.intentPresenter(MainActivity.this);
            }
        });



    }
}
