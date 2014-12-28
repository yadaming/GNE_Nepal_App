package com.yadaming.gnenepalapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.app.Activity;



public class testActivity extends Activity {

    Button writeButton;
    CheckBox checkBox;

    String filename = "testFile";
    String filecontent = "filecontent variable not yet changed";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        // first, connect the checkbox and button in the layout to something usable here
        checkBox = (CheckBox) findViewById(R.id.checkBox11);
        writeButton = (Button) findViewById(R.id.button);
        // when the button is clicked, check to see if the box is
        writeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {
                if (checkBox.isChecked())
                {
                    filecontent = "checked";
                }
                else
                {
                    filecontent = "not checked";
                }
                fileIO fileio = new fileIO();
                fileio.write(filename, filecontent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test, menu);
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
