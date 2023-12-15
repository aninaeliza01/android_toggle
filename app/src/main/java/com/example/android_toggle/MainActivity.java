package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView image1,image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1=findViewById(R.id.imageView5);
        image2=findViewById(R.id.imageView4);
        View.OnClickListener click=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.imageView4){
                    image1.setVisibility(View.VISIBLE);
                    image2.setVisibility(View.GONE);
                }
                else{
                    image2.setVisibility(View.VISIBLE);
                    image1.setVisibility(View.GONE);
                }
            }
        };

        image1.setOnClickListener(click);
        image2.setOnClickListener(click);
    }

}