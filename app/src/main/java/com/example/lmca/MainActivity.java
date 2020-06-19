package com.example.lmca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button customerButton = (Button) findViewById(R.id.customer_button);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void customer_screen(View view){
        Intent newScreen = new Intent (this, CustomerScreen.class);
        startActivity(newScreen);
    }

    public void notification_screen(View view){

    }

    public void schedule_screen(View view){

    }

}