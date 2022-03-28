package com.example.days4indahwulandari.Tugas4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.days4indahwulandari.R;

public class help extends AppCompatActivity {

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.help);
    }

    public void clicknext(View view) {
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }
}
