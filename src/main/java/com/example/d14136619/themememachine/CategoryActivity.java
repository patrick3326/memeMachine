package com.example.d14136619.themememachine;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class CategoryActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_main);

         View MemeGenerator = findViewById((R.id.textView4));
        MemeGenerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), memedisplay.class);
                startActivity(intent);
            }
        });
        View MemeGenerator2 = findViewById((R.id.textView5));
        MemeGenerator2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), memedisplay.class);
                startActivity(intent);
            }
        });
        View MemeGenerator3 = findViewById((R.id.textView6));
        MemeGenerator3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), memedisplay.class);
                startActivity(intent);
            }
        });
        View MemeGenerator4 = findViewById((R.id.textView7));
        MemeGenerator4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), memedisplay.class);
                startActivity(intent);
            }
        });
        View MemeGenerator5 = findViewById((R.id.textView8));
        MemeGenerator5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), memedisplay.class);
                startActivity(intent);
            }
        });
        View MemeGenerator6 = findViewById((R.id.textView9));
        MemeGenerator6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), memedisplay.class);
                startActivity(intent);
            }
        });

        View Back =  findViewById((R.id.imageButtonHome));
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_category, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
