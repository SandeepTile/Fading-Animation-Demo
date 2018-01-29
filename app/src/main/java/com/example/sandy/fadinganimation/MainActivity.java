package com.example.sandy.fadinganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void onclick(View view)
    {
        ImageView image=(ImageView) findViewById(R.id.ironimage);
        image.animate().translationXBy(1000f).translationYBy(1000f).rotationBy(3600).setDuration(2000);


       /* ImageView image2=(ImageView) findViewById(R.id.ironimage2);
        image2.animate().alpha(1f).setDuration(2000); */
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image=(ImageView) findViewById(R.id.ironimage);
        image.setTranslationX(-1000f);
        image.setTranslationY(-1000f);
    }
}
