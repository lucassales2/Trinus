package lucassales2.trinus.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import lucassales2.trinus.R;
import lucassales2.trinus.ui.match.MatchScoreFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame, new MatchScoreFragment())
                    .commit();
        }

    }
}
