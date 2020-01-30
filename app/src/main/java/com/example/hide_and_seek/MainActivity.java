package com.example.hide_and_seek;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private TextView resultView;
    private ImageView ghostView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultView = (TextView)findViewById(R.id.PeekaBooTextView);
        ghostView = (ImageView)findViewById(R.id.GhostimageView);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButtonID);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {

                    resultView.setVisibility(View.VISIBLE);
                    ghostView.setVisibility(View.VISIBLE);

                    //toggle is enabled
                }else {

                    resultView.setVisibility(View.INVISIBLE);
                    ghostView.setVisibility(View.INVISIBLE);


                    //toggle disabled.

                }
            }
        });

    }
}
