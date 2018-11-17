package com.setyaadidev.itumeetup4.presenter;

import android.content.Context;
import android.content.Intent;

import com.setyaadidev.itumeetup4.Main2Activity;
import com.setyaadidev.itumeetup4.MainActivity;


public class IntentPresenter {
    public void intentPresenter(Context context) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_TEXT, "Intent Explicit");
        intent.putExtra(Intent.EXTRA_TITLE, "Coba Intent Explicit");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Aku nyoba intent explicit ya");
        context.startActivity(Intent.createChooser(intent, "Share Image"));
    }

    public void IntentImplicit (Context context){
        context.startActivity(new Intent (context, MainActivity.class));
    }

}

