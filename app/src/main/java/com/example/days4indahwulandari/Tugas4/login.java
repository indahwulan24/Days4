package com.example.days4indahwulandari.Tugas4;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.days4indahwulandari.R;

public class login extends AppCompatActivity {

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login);
    }
    public void clicklogin(View view) {
        Intent i = new Intent(this, activity_main.class);
        startActivity(i);
    }
}
