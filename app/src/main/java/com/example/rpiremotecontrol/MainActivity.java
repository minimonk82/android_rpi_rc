package com.example.rpiremotecontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onFRONT(android.view.View view)
    {
        final TextView txt1  = (TextView)findViewById(R.id.ID_TEXT_STATUS);
        txt1.setText("FRONT");
    }

    public void onSTOP(android.view.View view)
    {
        final TextView txt1  = (TextView)findViewById(R.id.ID_TEXT_STATUS);
        txt1.setText("STOP");
    }

    public void onREAR(android.view.View view)
    {
        final TextView txt1  = (TextView)findViewById(R.id.ID_TEXT_STATUS);
        txt1.setText("REAR");
    }

    public void onLEFT(android.view.View view)
    {
        final TextView txt1  = (TextView)findViewById(R.id.ID_TEXT_STATUS);
        txt1.setText("LEFT");
    }

    public void onCENTER(android.view.View view)
    {
        final TextView txt1  = (TextView)findViewById(R.id.ID_TEXT_STATUS);
        txt1.setText("CENTER");
    }

    public void onRIGHT(android.view.View view)
    {
        final TextView txt1  = (TextView)findViewById(R.id.ID_TEXT_STATUS);
        txt1.setText("RIGHT");
    }

}
