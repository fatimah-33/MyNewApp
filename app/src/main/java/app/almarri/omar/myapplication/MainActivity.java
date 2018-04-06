package app.almarri.omar.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button info;
    Button loc;
    Button grow;
    Button pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info = (Button) findViewById(R.id.infoButton);
        grow = (Button) findViewById(R.id.growButton);
        pic = (Button) findViewById(R.id.picButton);
        loc = (Button) findViewById(R.id.locationButton);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent infoIntent=new Intent(MainActivity.this,InfoActivity.class);
                startActivity(infoIntent);
            }
        });
        grow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent growIntent=new Intent(MainActivity.this,GrowActivity.class);
                startActivity(growIntent);

            }
        });
        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pictureIntent=new Intent(MainActivity.this,PicActivity.class);
                startActivity(pictureIntent);

            }
        });
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent locIntent=new Intent(MainActivity.this,LocActivity.class);
                startActivity(locIntent);

            }
        });
    }
}
