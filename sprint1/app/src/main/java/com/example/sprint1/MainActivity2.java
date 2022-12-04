package com.example.sprint1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button buttonProduct1, buttonProduct2, buttonProduct3;
    private TextView textProduct1, textProduct2, textProduct3;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonProduct1 = (Button) findViewById(R.id.buttonProduct1);
        buttonProduct2 = (Button) findViewById(R.id.buttonProduct2);
        buttonProduct3 = (Button) findViewById(R.id.buttonProduct3);

        textProduct1 = (TextView) findViewById(R.id.textProduct1);
        textProduct2 = (TextView) findViewById(R.id.textProduct2);
        textProduct3 = (TextView) findViewById(R.id.textProduct3);


        //evento para el boton 1
        buttonProduct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                intent.putExtra("title",textProduct1.getText().toString());
                intent.putExtra("description","Description Product 1");
                intent.putExtra("imgCode",R.drawable.prodcuto1);
                startActivity(intent);
            }
        });

        //evento para el boton 2
        buttonProduct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                intent.putExtra("title",textProduct2.getText().toString());
                intent.putExtra("description","Description Product 2");
                intent.putExtra("imgCode",R.drawable.producto2);
                startActivity(intent);
            }
        });

        //evento para el boton 3
        buttonProduct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                intent.putExtra("title",textProduct3.getText().toString());
                intent.putExtra("description","Description Product 3");
                intent.putExtra("imgCode",R.drawable.producto3);
                startActivity(intent);
            }
        });
    }
}