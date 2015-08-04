package com.example.sample;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
    private MovingCirclesView mcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mcv = (MovingCirclesView) findViewById(R.id.movingCirclesView1);
        mcv.addCircle(new CircleMove(20, 80, 50, 10, 5, R.color.Red));
        mcv.addCircle(new CircleMove(40, 100, 200, -15, 5, R.color.Blue));
        mcv.addCircle(new CircleMove(30, 50, 200, -15, 15, R.color.Green));
    }
    
}
