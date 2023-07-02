package com.example.cricket_temp_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etchirps;
    Button btncalculate_temp;
    TextView etshowingresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btncalculate_temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Numberofchirps = etchirps.getText().toString().trim();
                if(Numberofchirps.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Invalid Value", Toast.LENGTH_SHORT).show();
                }
                else {
                    int Chirps = Integer.parseInt(Numberofchirps);
                    float Temp = (Chirps/3.0f)+4;
                    etshowingresult.setText(getString(R.string.Msg_1)+""+Temp+""+getString(R.string.Msg_2));
                }
            }
        });



    }

    public void init()
    {
        etchirps = findViewById(R.id.etchirps);
        btncalculate_temp = findViewById(R.id.btncalculate_temp);
        etshowingresult = findViewById(R.id.tvshowingresult);
    }
}