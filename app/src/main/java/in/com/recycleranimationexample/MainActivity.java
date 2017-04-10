package in.com.recycleranimationexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment recyclerFragment = fm.findFragmentById(R.id.recycler_fragment);
        if (recyclerFragment == null) {
            recyclerFragment = RecyclerFragment.newInstance();
            fm.beginTransaction()
                    .replace(R.id.recycler_fragment, recyclerFragment)
                    .commit();
        }


    }
}
