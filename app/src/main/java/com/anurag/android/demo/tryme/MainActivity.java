package com.anurag.android.demo.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private View windowview;
    private Button tbutton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors=new int[]{Color.BLACK,Color.YELLOW,Color.BLUE,Color.GREEN,Color.WHITE,Color.CYAN,Color.DKGRAY,Color.GRAY,Color.LTGRAY,Color.MAGENTA,Color.RED,Color.TRANSPARENT};

        windowview=findViewById(R.id.windowViewId);

        tbutton=(Button)findViewById(R.id.button2);
        tbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int colorArrayLenght =colors.length;
                Random ran=new Random();
                int ranNum=ran.nextInt(colorArrayLenght);
                windowview.setBackgroundColor(colors[ranNum]);
                Log.d("Random",String.valueOf(ranNum));
            }
        });
    }
}
