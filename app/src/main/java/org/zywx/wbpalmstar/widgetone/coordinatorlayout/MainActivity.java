package org.zywx.wbpalmstar.widgetone.coordinatorlayout;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppBarLayout appBarLayout= findViewById(R.id.appBarLayout);
        final TabLayout tabLayout= findViewById(R.id.tabs);

        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                //appBarLayout.setAlpha(getAlpha(verticalOffset, appBarLayout.getTotalScrollRange()));
                tabLayout.setAlpha(1.0f - getAlpha(verticalOffset, appBarLayout.getTotalScrollRange()));
            }
        });
    }


    private float getAlpha(int a, int b){
        float f = Math.abs((float)a/b);
        float result = 1.0f-f;
        return result;
    }
}
