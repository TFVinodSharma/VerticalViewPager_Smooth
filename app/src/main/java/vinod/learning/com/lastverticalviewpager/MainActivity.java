package vinod.learning.com.lastverticalviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import static vinod.learning.com.lastverticalviewpager.R.*;

public class MainActivity extends AppCompatActivity {
    VerticalViewPager verticalViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
      /*  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
*/
        verticalViewPager = findViewById(id.verticleViewPager);
        verticalViewPager.setAdapter(new VerticlePagerAdapter(this));

    }
}
