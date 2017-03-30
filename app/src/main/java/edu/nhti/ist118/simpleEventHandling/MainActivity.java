package edu.nhti.ist118.simpleEventHandling;

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

public class MainActivity extends AppCompatActivity {

    TextView textViewOutput;
    Button buttonOK;
    Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // find View-elements
        textViewOutput = (TextView) findViewById(R.id.textViewOut);
        buttonOK = (Button) findViewById(R.id.buttonOk);
        buttonCancel = (Button) findViewById(R.id.buttonCancel);

        // Event Handlers
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        View.OnClickListener onClickListnerButtonOK = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewOutput.setText("Button OK clicked");
                v.setBackgroundColor(Color.GREEN);
                buttonCancel.setBackgroundColor(Color.RED);

            }
        };

        View.OnClickListener onClickListnerButtonCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change text of TextView (textViewOutput)
                textViewOutput.setText("Button Cancel clicked");
                v.setBackgroundColor(Color.GREEN);
                buttonOK.setBackgroundColor(Color.RED);
            }
        };


        // assign click listener to the OK button (btnOK)
        buttonOK.setOnClickListener(onClickListnerButtonOK);
        buttonCancel.setOnClickListener(onClickListnerButtonCancel);


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
