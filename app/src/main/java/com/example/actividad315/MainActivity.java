package com.example.actividad315;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        SeekBar seekBar1=findViewById(R.id.seekbar1);
        SeekBar seekBar2=findViewById(R.id.seekbar2);
        EditText editText1=findViewById(R.id.edittxt1);
        TextView editText2=findViewById(R.id.edittxt2);
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Lógica cuando cambia el progreso del SeekBar

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Lógica al empezar a mover el SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Lógica al soltar el SeekBar
                if(seekBar.getProgress()==0){

                } else if (seekBar.getProgress()==1) {
                    
                } else if (seekBar.getProgress()==2) {
                    
                }
            }
        });
    }

}