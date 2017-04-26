package lucassales2.trinus.ui.search;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import lucassales2.trinus.R;

public class SearchPlayerResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_resut);
        if (savedInstanceState == null) {
            SearchPlayerResultFragment fragment = SearchPlayerResultFragment.newInstance(getIntent().getStringExtra("search"));
            getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).commit();
        }
    }
}
