package com.example.days4indahwulandari.Tugas4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.days4indahwulandari.R;

public class activity_main extends AppCompatActivity {

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void clicklanjut(View view) {
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }
}