package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void PicCat(int k){
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setMargin(0,50);

        bank=(LinearLayout)toast.getView();

        ImageView Cat= new ImageView(getApplicationContext());
        Cat.setImageResource(R.drawable.cat);
        Cat.setMaxWidth(50);
        Cat.setMaxHeight(50);

        bank.addView(Cat,0);
    }
    public void PicVor(int k){
        toast.setGravity(Gravity.CENTER,0,0);
        bank=(LinearLayout)toast.getView();
        ImageView Voronac= new ImageView(getApplicationContext());
        Voronac.setImageResource(R.drawable.at713741815);
        Voronac.setMaxWidth(50);
        Voronac.setMaxHeight(50);

        bank.addView(Voronac,0);
    }
    public int Voronac=0;
    public int Cat=0;
    public int Vietnam=0;
    public TextView CountText;
          public Button AddCats;
    public Button AddVietnams;
public Toast toast;
public LinearLayout bank;
public String mytext="Hi";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String mytext="Hi";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountText=findViewById(R.id.infotext);
        AddCats=findViewById(R.id.AddCat);
        AddVietnams=findViewById(R.id.AddVietnam);
        Intent intent = getIntent();
        String message = intent.getStringExtra(mytext);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
        CountText.setText(mytext);
        AddCats.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent in=new Intent(MainActivity.this,About.class);

                startActivity(in);

                if(Voronac>0)
                    {Voronac--;
                Cat++;}
                   else{ PicCat(1); toast.show();}
                if(Vietnam>0)
                    Vietnam=Vietnam;
                CountText.setText("Vorona: "+Voronac+" Cat: "+Cat+" Vietnamec: "+Vietnam);

            }



        });
       //toast=    Toast.makeText(getApplicationContext()," ne dostatnyo kotiv",Toast.LENGTH_SHORT);
       //findViewById(R.id.AddCat)

        AddVietnams.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
int k=0;
               {
                    if(Voronac!=0)
                      {Voronac--;k++;}else{PicVor(1); toast.setText("Ne dostatnyo voron");toast.show();}
                    if(Cat!=0){Cat--;k++;}
                   else  {PicCat(1); toast.setText("Ne dostatnyo kotiv");toast.show();}


                   if(k==2) Vietnam++;
               }


                CountText.setText("Vorona: "+Voronac+" Cat: "+Cat+" Vietnamec: "+Vietnam);

            }


        });

     toast=   Toast.makeText(getApplicationContext()," ne dostatnyo kotiv",Toast.LENGTH_SHORT);
        int i = 0;
        int i1 = 0;

        //Length_short - 2.0 s
        //Length_long - 3.2 s


    }

    public void Counter(View view) {
        Voronac++;
        CountText.setText("Vorona: "+Voronac+" Cat: "+Cat+" Vietnamec: "+Vietnam);
    }
}
