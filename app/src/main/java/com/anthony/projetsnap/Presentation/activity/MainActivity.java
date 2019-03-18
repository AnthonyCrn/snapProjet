package com.anthony.projetsnap.Presentation.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.anthony.projetsnap.R;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

      ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //imageView.findViewById(R.id.main_background);
       // Glide.with(this).load(R.drawable.snap).into(imageView);
    }

    public void onExploreSnaps(View view) {

        Intent intent = new Intent(this, SnapListActivity.class);
        startActivity(intent);
    }

    public void onPublishingSnaps(View view) {
    }
}
