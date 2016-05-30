package com.github.abdalimran.passingdatausingbundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText inputname;
    private EditText inputage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputname = (EditText) findViewById(R.id.inputname);
        inputage = (EditText) findViewById(R.id.inputage);
    }

    public void PassDatatoActivity(View view) {
        String name=inputname.getText().toString();
        String agestr=inputage.getText().toString();
        int age=Integer.parseInt(agestr);

        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);

        Bundle bundledata=new Bundle();
        bundledata.putString("name",name);
        bundledata.putInt("age",age);
        intent.putExtras(bundledata);

        startActivity(intent);

    }
}
