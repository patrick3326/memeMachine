package com.example.d14136619.themememachine;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;
import android.content.Context;
import android.app.Activity;
import android.widget.VideoView;

public class memedisplay extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memedisplaypage);

        View Back =  findViewById((R.id.imageButtonHome));
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        View Back2 =  findViewById((R.id.imageButtonBack));
        Back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CategoryActivity.class);
                startActivity(intent);
            }
        });

        View Back3 =  findViewById((R.id.imageButtonRefresh));
        Back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), memedisplay.class);
                startActivity(intent);
            }
        });




        class VideoPlayerActivity extends ActionBarActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.memedisplaypage);

                final VideoView videoView =
                        (VideoView) findViewById(R.id.video);

                videoView.setVideoPath(
                        "https://youtu.be/bE4C8a48o1E");

                videoView.start();
            }
        }
    }
    public class memedisplay2 extends Activity
    {
        final Random rnd = new Random();

        @TargetApi(Build.VERSION_CODES.LOLLIPOP)
        @Override
                protected void onCreate(
            final Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.memedisplaypage);

            final ImageView img = (ImageView) findViewById(R.id.imageView);
            final String str = "meme"  + rnd.nextInt(16);
            img.setImageDrawable(
                    getDrawable(getResourceID(str, "drawable",
                            getApplicationContext()))
            );
        }
        protected int getResourceID
                (final String resName, final String resType, final Context ctx)
    {
        final int ResourceID =
                ctx.getResources().getIdentifier(resName, resType, ctx.getApplicationInfo().packageName);
        if(ResourceID == 0)
        {
            throw new IllegalArgumentException
                    (
                            "No resource string found with name" + resName
                    );
        }
        else
        {
            return ResourceID;
        }
    }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_memedisplay, menu);
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
