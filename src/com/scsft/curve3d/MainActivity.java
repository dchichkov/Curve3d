package com.scsft.curve3d;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
    private FallingSnowView snowView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        snowView = new FallingSnowView(this);
        setContentView(snowView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        snowView.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        snowView.pause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
