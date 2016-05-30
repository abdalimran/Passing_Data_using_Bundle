package com.github.abdalimran.passingdatausingbundle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends Activity {

    private TextView showname;
    private TextView showage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        showname = (TextView) findViewById(R.id.showname);
        showage = (TextView) findViewById(R.id.showage);

        //Enabling a back arrow in the top-left of the activity
        if(getActionBar()!=null)
            getActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle receivedata = getIntent().getExtras();
        String name = receivedata.getString("name");
        int age = receivedata.getInt("age");

        String nameformat= String.format("Hello, %s!! You are here in the new activity!", name);
        String ageformat= String.format("So your age is %d? Is it true? HaHaHa! :D", age);

        showname.setText(nameformat);
        showage.setText(ageformat);
    }
}
