package com.example.cookies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * @param view
     */
    public void eatCookie(View view){
        ImageView image = (ImageView) findViewById(R.id.status_image);
        image.setImageResource(R.drawable.after_cookie);
        TextView text = (TextView) findViewById(R.id.status_text);
        text.setText("I'm so full");
    }
}