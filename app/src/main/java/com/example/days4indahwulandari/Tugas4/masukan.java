package com.example.days4indahwulandari.Tugas4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.days4indahwulandari.R;

public class masukan extends AppCompatActivity {

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.masukan);
    }

    public void clickemail(View view) {
        Intent i = new Intent(this, masukan.class);
        startActivity(i);
    }
    public void clickkirim(View view) {
        Intent i = new Intent(this, masukan.class);
        startActivity(i);
    }
}