package at.breitenfellner.myportfolio;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_spotify).setOnClickListener(this);
        findViewById(R.id.button_scores).setOnClickListener(this);
        findViewById(R.id.button_library).setOnClickListener(this);
        findViewById(R.id.button_buildit).setOnClickListener(this);
        findViewById(R.id.button_xyzreader).setOnClickListener(this);
        findViewById(R.id.button_own_app).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String appName = ((Button)v).getText().toString();
        String msg = getString(R.string.onclick_message, appName);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
