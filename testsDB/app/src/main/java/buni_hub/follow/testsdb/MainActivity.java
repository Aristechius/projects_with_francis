package buni_hub.follow.testsdb;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = new Intent(this, FolowActivity.class);
        startActivity(intent);


        //--- find all the check buttons---
        ImageButton checkBox1 = (ImageButton) findViewById(R.id.checkPlace1);
        ImageButton checkBox2 = (ImageButton) findViewById(R.id.checkPlace2);
        ImageButton checkBox3 = (ImageButton) findViewById(R.id.checkPlace3);

        //---create an array to store ids

        //---create an on click event for each checkbox, storing the ids in array

        //---create an onclick event for follow button sending the ids to the next activity
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.checkPlace1: {
                if (v.getBackground() == getResources().getDrawable(R.drawable.unchecked)) {
                    v.setBackgroundResource(R.drawable.checked);
                } else {
                    v.setBackgroundResource(R.drawable.unchecked);
                }
                break;
            }
            case R.id.checkPlace2: {
                if (v.getBackground() == getResources().getDrawable(R.drawable.unchecked)) {
                    v.setBackgroundResource(R.drawable.checked);
                } else {
                    v.setBackgroundResource(R.drawable.unchecked);
                }
                break;
            }

            case R.id.checkPlace3: {
                if (v.getBackground() == getResources().getDrawable(R.drawable.unchecked)) {
                    v.setBackgroundResource(R.drawable.checked);
                } else {
                    v.setBackgroundResource(R.drawable.unchecked);
                }
                break;
            }
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
