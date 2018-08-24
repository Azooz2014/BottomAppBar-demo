package io.blacketron.bottomappbardemo;

import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomAppBar bottomAppBar = findViewById(R.id.bottomBar);
        setSupportActionBar(bottomAppBar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.bottomappbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Toast toast;
        switch(item.getItemId()){

            case android.R.id.home:

                BottomNavigationDrawerFragment bNavFragment = new BottomNavigationDrawerFragment();
                bNavFragment.show(getSupportFragmentManager(), bNavFragment.getTag());
                break;

            case R.id.act_favorite:
                toast = Toast.makeText(this, "Favorite is pressed!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 200);
//                Log.i("toastGrav", "Toast Gravity: " + toast.getGravity());
                toast.show();
                break;

            case R.id.act_search:
                toast = Toast.makeText(this, "Search is pressed!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 200);
//                Log.i("toastGrav", "Toast Gravity: " + toast.getGravity());
                toast.show();
                break;

            case R.id.act_settings:
                toast = Toast.makeText(this, "Settings is pressed!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 200);
//                Log.i("toastGrav", "Toast Gravity: " + toast.getGravity());
                toast.show();
                break;
        }
        return true;
    }
}
