package com.cosmoadz.library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }


    /**
     * multiple tow numbers
     *
     * @param x int
     * @param y int
     * @return result
     */
    public int addTwoNumber(int x, int y) {
        return x + y;
    }

    /**
     * multiple tow numbers
     *
     * @param x int
     * @param y int
     * @return result
     */
    public int multipleTwoNumber(int x, int y) {
        return x * y;
    }


}
