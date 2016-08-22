package com.a4bit.we.mycontentprovider;

import android.content.ContentValues;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAddName(View view) {
        ContentValues values = new ContentValues();
        values.put(MyProvider.name, ((EditText) findViewById(R.id.txtName))
                .getText().toString());
        Uri uri = getContentResolver().insert(MyProvider.CONTENT_URI, values);
        Toast.makeText(getBaseContext(), "New record inserted", Toast.LENGTH_LONG)
                .show();
    }
}
