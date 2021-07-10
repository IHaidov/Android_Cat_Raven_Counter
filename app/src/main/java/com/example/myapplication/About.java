package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class About extends AppCompatActivity {

    EditText myText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        myText=findViewById(R.id.editText);
    }
    public void Back(View view)
    {
        Intent in=new Intent(About.this,MainActivity.class);
       in.putExtra("mytext",myText.getText().toString());
       startActivity(in);
    }
}
