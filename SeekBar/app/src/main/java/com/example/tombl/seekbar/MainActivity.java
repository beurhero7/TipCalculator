package com.example.tombl.seekbar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        resultTextView = (TextView) findViewById(R.id.ResultId);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        resultTextView.setText("Pain Level" + seekBar.getProgress() + "/" + seekBar.getMax());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText("Pain Level" + seekBar.getProgress() + "/" + seekBar.getMax());

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                Log.d("SB", "OnpStarTtrackingTouch");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                if (seekBar.getProgress() >= 7){
                    resultTextView.setTextColor(Color.RED);
                }

                Log.d("SB", "OnStop");

            }
        });
    }
}
