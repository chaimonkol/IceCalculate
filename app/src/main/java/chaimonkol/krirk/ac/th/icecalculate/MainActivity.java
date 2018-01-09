package chaimonkol.krirk.ac.th.icecalculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chaimonkol.krirk.ac.th.icecalculate.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragment to Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();
        }

    }  // Main Method


} // Main Class
