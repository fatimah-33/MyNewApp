package app.almarri.omar.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by fatimah on 05/04/2018.
 */

public class ViewImage extends Activity {
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        int num= getIntent().getIntExtra("key",0);


        Log.v("main activity","pass data "+num);

        switch (num){
            case 0:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.street));
                break;
            case 1:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.dokan));
                break;
            case 2:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.building));
                break;
            default:
                Toast.makeText(this,"no image found",Toast.LENGTH_LONG);
                break;
        }

    }
    }

