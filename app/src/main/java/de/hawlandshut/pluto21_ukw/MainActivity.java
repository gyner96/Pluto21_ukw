package de.hawlandshut.pluto21_ukw;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "xx MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate called");
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called");
    }

    /* Erzeugen des Menus aus der XML-Datei */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    /* Reaktion auf Clicks in die Menue-Einträge */

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // TODO: Clean up!
        switch( item.getItemId()) {
            case R.id.mainMenuHelp:
                Toast.makeText(getApplicationContext(), "You pressed HELP.", Toast.LENGTH_LONG).show();
                Log.d(TAG, "Menue Help erkannt");
                return true;

            case R.id.mainMenuManageAccount:
                Toast.makeText(getApplicationContext(), "You pressed MANAGE ACC.", Toast.LENGTH_LONG).show();
                Log.d(TAG, "Menue Manage Account erkannt");
                return true;

            case R.id.mainMenuTest:
                Toast.makeText(getApplicationContext(), "You pressed TEST.", Toast.LENGTH_LONG).show();
                Log.d(TAG, "Menue Test erkannt");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called");
    }
}