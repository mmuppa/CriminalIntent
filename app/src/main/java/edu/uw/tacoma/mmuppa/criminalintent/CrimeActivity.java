package edu.uw.tacoma.mmuppa.criminalintent;

import android.app.FragmentManager;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Fragment;

public class CrimeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        if (findViewById(R.id.fragment_container) != null && savedInstanceState == null ) {
            FragmentManager fm = getFragmentManager();

            CrimeFragment fragment = new CrimeFragment();
                fm.beginTransaction()
                        .add(R.id.fragment_container, fragment)
                        .commit();

        }
    }
}
