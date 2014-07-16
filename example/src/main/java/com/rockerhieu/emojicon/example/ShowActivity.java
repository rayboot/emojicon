package com.rockerhieu.emojicon.example;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ShowActivity extends FragmentActivity
{

    TextView tvUnicode;
    TextView tvStringHex;
    TextView tvHtml;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        tvUnicode = (TextView) findViewById(R.id.tvUnicode);
        tvStringHex = (TextView) findViewById(R.id.tvStringHex);
        tvHtml = (TextView) findViewById(R.id.tvHtml);

        tvUnicode.setText(R.string.i_love_emojicon);

        tvStringHex.setText(":smile::bamboo::yum:");

        tvHtml.setText(String.format(
                "<font color='#ff0000'>%1$s</font><font color='#039ae3'> %2$s</font>",
                "Username",
                ":smile::bamboo::yum:\n:smile::bamboo::yum:\n:smile::bamboo::yum:\n111111\n\ue32d\ue32d\ue32d"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.show, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
