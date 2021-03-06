package buni_hub.follow.testsdb;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class myPlaces extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_places);


        TextView place1 = (TextView)findViewById(R.id.placeName1);
        TextView place2 = (TextView)findViewById(R.id.placeName2);
        TextView place3 = (TextView)findViewById(R.id.placeName3);
        MyListener listener = new MyListener();
        place1.setTag (1);
        place1.setOnClickListener(listener);
        place2.setTag(2);
        place2.setOnClickListener(listener);
        place3.setTag(3);
        place3.setOnClickListener(listener);

    }
    public class MyListener implements View.OnClickListener {

        @ Override
        public void onClick (View v) {
            int tag = ( Integer) v.getTag ();
            switch (tag) {
                case 1:
                    Intent intent1 = new Intent(myPlaces.this,posts.class);
                    startActivity(intent1);
                    break;
                case 2:
                    Intent intent2 = new Intent(myPlaces.this,posts.class);
                    startActivity(intent2);
                    break;
                case 3:
                    Intent intent3 = new Intent(myPlaces.this,posts.class);
                    startActivity(intent3);
                    break;

            }
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_places, menu);
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
