package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        Toast.makeText(getApplicationContext(), "Values are:" + value1 + "\n Second value:" + value2, Toast.LENGTH_LONG).show();

    }

    public void callFirsActivity(View view){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        i.putExtra("Value1","Android BY Myapplication");
        i.putExtra("Value2","Simple");
        startActivity(i);
    }
}