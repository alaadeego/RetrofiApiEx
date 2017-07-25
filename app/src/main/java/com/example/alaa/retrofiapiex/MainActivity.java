package com.example.alaa.retrofiapiex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(R.id.button);
    }
    public void getfruit(View view)
    {
        Intent intent=new Intent(this,ListActivity.class);
                intent.putExtra("type","fruits");
        startActivity(intent);
    }
}
