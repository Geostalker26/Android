package com.example.brent.test2;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getversion();
        version();
        getrotation();
        rotation();
    }

    private void version(){
        TextView voutput = findViewById(R.id.output);
        boolean finder = getversion();
        if (finder == true){
            voutput.setText("You are up to date");
        }else{
            voutput.setText("You suck, upgrade!");
        }
    }
    private boolean getversion() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            return true;
        } else {
            return false;
        }
    }

    private void getrotation(){
        TextView routput = findViewById(R.id.rotate);
        boolean orientation = rotation();
        if (orientation == true){
            routput.setText("Portrait");
        }else{
            routput.setText("Landscape");
        }
    }
    private boolean rotation(){
        if(getResources().getConfiguration().orientation == 1){
            return true;
        }else{
            return false;
        }
    }
}
