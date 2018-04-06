package app.almarri.omar.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by fatimah on 01/04/2018.
 */

public class PicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic);
        String[] sizeArray = {"شوارع بقيق","اسواق بقيق","بلدية بقيق"};
        ListView picListView = (ListView) findViewById(R.id.list_view);
        picListView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                sizeArray));

        picListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(PicActivity.this,ViewImage.class);
                intent.putExtra("key",i);
                Log.v("main activity","item selected "+i);

                startActivity(intent);



            }
        });

    }
}