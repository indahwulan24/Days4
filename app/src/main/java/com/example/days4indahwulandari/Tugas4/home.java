package com.example.days4indahwulandari.Tugas4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.days4indahwulandari.R;

public class home extends AppCompatActivity {

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.home);
    }

    public void clickbantuan(View view) {
        Intent i = new Intent(this, help.class);
        startActivity(i);
    }
    public void clickfeedback(View view) {
        Intent i = new Intent(this, masukan.class);
        startActivity(i);
    }
    public void clicknext(View view) {
        Intent i = new Intent(this, activity_main.class);
        startActivity(i);
    }
}
