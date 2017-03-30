package edu.nhti.ist118.deleteme_simpleeventhandling;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

/*
Example taken from the following site
http://startandroid.ru/en/lessons/210-lesson-9-event-listeners-with-button-example.html
 */

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find View-elements
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Button OK clicked");
                v.setBackgroundColor(Color.GREEN);
                btnCancel.setBackgroundColor(Color.RED);

            }
        };

        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change text of TextView (tvOut)
                tvOut.setText("Button Cancel clicked");
                v.setBackgroundColor(Color.GREEN);
                btnOk.setBackgroundColor(Color.RED);
            }
        };


        // assign click listener to the OK button (btnOK)
        btnOk.setOnClickListener(oclBtnOk);
        btnCancel.setOnClickListener(oclBtnCancel);


    }  // end onCreate




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
