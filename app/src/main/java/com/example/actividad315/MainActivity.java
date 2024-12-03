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

        SeekBar seekBar1 = findViewById(R.id.seekbar1);
        SeekBar seekBar2 = findViewById(R.id.seekbar2);
        EditText editText1 = findViewById(R.id.edittxt1);
        TextView editText2 = findViewById(R.id.edittxt2);
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Lógica cuando cambia el progreso del SeekBar
                String textInput=editText1.getText().toString();
                if (!textInput.isEmpty()) {
                    try {
                        int temperatura = Integer.parseInt(textInput);
                        //Si el seekbar1 es Celsius
                        if (seekBar.getProgress() == 0) {
                            //Para pasar de Celsius a Celsius
                            if (seekBar2.getProgress() == 0) {
                                int resultado = temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Celsius a Kelvin
                            else if(seekBar2.getProgress() == 1) {
                                int resultado = temperatura + 273;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Celsius a Farenheit
                            else if (seekBar2.getProgress() == 2) {
                                int resultado = (temperatura * 9/5) + 32;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                        //Si el seekbar1 es Kelvin
                        else if (seekBar.getProgress() == 1) {
                            //Para pasar de Kelvin a Celsius
                            if (seekBar2.getProgress() == 0) {
                                double resultado = temperatura - 273.15;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Kelvin a Kelvin
                            else if(seekBar2.getProgress() == 1) {
                                int resultado = temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Kelvin a Farenheit
                            else if (seekBar2.getProgress() == 2) {
                                double resultado = (temperatura - 273.15) * 9 / 5 + 32;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                        //Si el seekbar1 es Farenheit
                        else if (seekBar.getProgress() == 2) {
                            //Para pasar de Farenheit a Celsius
                            if (seekBar2.getProgress() == 0) {
                                double resultado = (temperatura - 32) * 5 / 9;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Farenheit a Kelvin
                            else if(seekBar2.getProgress() == 1) {
                                double resultado =((temperatura- 32) / 1.8) + 273.15;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Farenheit a Farenheit
                            else if (seekBar2.getProgress() == 2) {
                                double resultado =temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                    }catch (NumberFormatException e){
                        // Si hay un error en la conversión del texto a número
                        editText2.setText("Error: Entrada no válida");
                    }
                } else {
                    //Vacio
                    // Si el texto está vacío
                    editText2.setText("Error: Ingrese un valor");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Lógica al empezar a mover el SeekBar
                String textInput=editText1.getText().toString();
                if (!textInput.isEmpty()) {
                    try {
                        int temperatura = Integer.parseInt(textInput);
                        //Si el seekbar1 es Celsius
                        if (seekBar.getProgress() == 0) {
                            //Para pasar de Celsius a Celsius
                            if (seekBar2.getProgress() == 0) {
                                int resultado = temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Celsius a Kelvin
                            else if(seekBar2.getProgress() == 1) {
                                int resultado = temperatura + 273;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Celsius a Farenheit
                            else if (seekBar2.getProgress() == 2) {
                                int resultado = (temperatura * 9/5) + 32;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                        //Si el seekbar1 es Kelvin
                        else if (seekBar.getProgress() == 1) {
                            //Para pasar de Kelvin a Celsius
                            if (seekBar2.getProgress() == 0) {
                                double resultado = temperatura - 273.15;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Kelvin a Kelvin
                            else if(seekBar2.getProgress() == 1) {
                                int resultado = temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Kelvin a Farenheit
                            else if (seekBar2.getProgress() == 2) {
                                double resultado = (temperatura - 273.15) * 9 / 5 + 32;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                        //Si el seekbar1 es Farenheit
                        else if (seekBar.getProgress() == 2) {
                            //Para pasar de Farenheit a Celsius
                            if (seekBar2.getProgress() == 0) {
                                double resultado = (temperatura - 32) * 5 / 9;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Farenheit a Kelvin
                            else if(seekBar2.getProgress() == 1) {
                                double resultado =((temperatura- 32) / 1.8) + 273.15;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Farenheit a Farenheit
                            else if (seekBar2.getProgress() == 2) {
                                double resultado =temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                    }catch (NumberFormatException e){
                        // Si hay un error en la conversión del texto a número
                        editText2.setText("Error: Entrada no válida");
                    }
                } else {
                    //Vacio
                    // Si el texto está vacío
                    editText2.setText("Error: Ingrese un valor");
                }
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Lógica al soltar el SeekBar
                String textInput=editText1.getText().toString();
                if (!textInput.isEmpty()) {
                    try {
                        int temperatura = Integer.parseInt(textInput);
                        //Si el seekbar1 es Celsius
                        if (seekBar.getProgress() == 0) {
                            //Para pasar de Celsius a Celsius
                            if (seekBar2.getProgress() == 0) {
                                int resultado = temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Celsius a Kelvin
                            else if(seekBar2.getProgress() == 1) {
                                int resultado = temperatura + 273;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Celsius a Farenheit
                            else if (seekBar2.getProgress() == 2) {
                                int resultado = (temperatura * 9/5) + 32;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                        //Si el seekbar1 es Kelvin
                        else if (seekBar.getProgress() == 1) {
                            //Para pasar de Kelvin a Celsius
                            if (seekBar2.getProgress() == 0) {
                                double resultado = temperatura - 273.15;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Kelvin a Kelvin
                            else if(seekBar2.getProgress() == 1) {
                                int resultado = temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Kelvin a Farenheit
                            else if (seekBar2.getProgress() == 2) {
                                double resultado = (temperatura - 273.15) * 9 / 5 + 32;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                        //Si el seekbar1 es Farenheit
                        else if (seekBar.getProgress() == 2) {
                            //Para pasar de Farenheit a Celsius
                            if (seekBar2.getProgress() == 0) {
                                double resultado = (temperatura - 32) * 5 / 9;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Farenheit a Kelvin
                            else if(seekBar2.getProgress() == 1) {
                                double resultado =((temperatura- 32) / 1.8) + 273.15;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Farenheit a Farenheit
                            else if (seekBar2.getProgress() == 2) {
                                double resultado =temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                    }catch (NumberFormatException e){
                        // Si hay un error en la conversión del texto a número
                        editText2.setText("Error: Entrada no válida");
                    }
                } else {
                    //Vacio
                    // Si el texto está vacío
                    editText2.setText("Error: Ingrese un valor");
                }
            }
        });

        //Listener seekbar2
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar2, int i, boolean b) {
                String textInput=editText1.getText().toString();
                if (!textInput.isEmpty()) {
                    try {
                        int temperatura = Integer.parseInt(textInput);
                        //Si el seekbar2 es Celsius
                        if (seekBar2.getProgress() == 0) {
                            //Para pasar de Celsius a Celsius
                            if (seekBar1.getProgress() == 0) {
                                int resultado = temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Celsius a Kelvin
                            else if(seekBar1.getProgress() == 1) {
                                int resultado = temperatura + 273;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Celsius a Farenheit
                            else if (seekBar1.getProgress() == 2) {
                                int resultado = (temperatura * 9/5) + 32;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                        //Si el seekbar2 es Kelvin
                        else if (seekBar2.getProgress() == 1) {
                            //Para pasar de Kelvin a Celsius
                            if (seekBar1.getProgress() == 0) {
                                double resultado = temperatura - 273.15;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Kelvin a Kelvin
                            else if(seekBar1.getProgress() == 1) {
                                int resultado = temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Kelvin a Farenheit
                            else if (seekBar1.getProgress() == 2) {
                                double resultado = (temperatura - 273.15) * 9 / 5 + 32;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                        //Si el seekbar2 es Farenheit
                        else if (seekBar2.getProgress() == 2) {
                            //Para pasar de Farenheit a Celsius
                            if (seekBar1.getProgress() == 0) {
                                double resultado = (temperatura - 32) * 5 / 9;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Farenheit a Kelvin
                            else if(seekBar1.getProgress() == 1) {
                                double resultado =((temperatura- 32) / 1.8) + 273.15;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Farenheit a Farenheit
                            else if (seekBar1.getProgress() == 2) {
                                double resultado =temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                    }catch (NumberFormatException e){
                        // Si hay un error en la conversión del texto a número
                        editText2.setText("Error: Entrada no válida");
                    }
                } else {
                    //Vacio
                    // Si el texto está vacío
                    editText2.setText("Error: Ingrese un valor");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar2) {
                String textInput=editText1.getText().toString();
                if (!textInput.isEmpty()) {
                    try {
                        int temperatura = Integer.parseInt(textInput);
                        //Si el seekbar2 es Celsius
                        if (seekBar2.getProgress() == 0) {
                            //Para pasar de Celsius a Celsius
                            if (seekBar1.getProgress() == 0) {
                                int resultado = temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Celsius a Kelvin
                            else if(seekBar1.getProgress() == 1) {
                                int resultado = temperatura + 273;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Celsius a Farenheit
                            else if (seekBar1.getProgress() == 2) {
                                int resultado = (temperatura * 9/5) + 32;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                        //Si el seekbar2 es Kelvin
                        else if (seekBar2.getProgress() == 1) {
                            //Para pasar de Kelvin a Celsius
                            if (seekBar1.getProgress() == 0) {
                                double resultado = temperatura - 273.15;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Kelvin a Kelvin
                            else if(seekBar1.getProgress() == 1) {
                                int resultado = temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Kelvin a Farenheit
                            else if (seekBar1.getProgress() == 2) {
                                double resultado = (temperatura - 273.15) * 9 / 5 + 32;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                        //Si el seekbar2 es Farenheit
                        else if (seekBar2.getProgress() == 2) {
                            //Para pasar de Farenheit a Celsius
                            if (seekBar1.getProgress() == 0) {
                                double resultado = (temperatura - 32) * 5 / 9;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Farenheit a Kelvin
                            else if(seekBar1.getProgress() == 1) {
                                double resultado =((temperatura- 32) / 1.8) + 273.15;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Farenheit a Farenheit
                            else if (seekBar1.getProgress() == 2) {
                                double resultado =temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                    }catch (NumberFormatException e){
                        // Si hay un error en la conversión del texto a número
                        editText2.setText("Error: Entrada no válida");
                    }
                } else {
                    //Vacio
                    // Si el texto está vacío
                    editText2.setText("Error: Ingrese un valor");
                }
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar2) {
                String textInput=editText1.getText().toString();
                if (!textInput.isEmpty()) {
                    try {
                        int temperatura = Integer.parseInt(textInput);
                        //Si el seekbar2 es Celsius
                        if (seekBar2.getProgress() == 0) {
                            //Para pasar de Celsius a Celsius
                            if (seekBar1.getProgress() == 0) {
                                int resultado = temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Celsius a Kelvin
                            else if(seekBar1.getProgress() == 1) {
                                int resultado = temperatura + 273;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Celsius a Farenheit
                            else if (seekBar1.getProgress() == 2) {
                                int resultado = (temperatura * 9/5) + 32;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                        //Si el seekbar2 es Kelvin
                        else if (seekBar2.getProgress() == 1) {
                            //Para pasar de Kelvin a Celsius
                            if (seekBar1.getProgress() == 0) {
                                double resultado = temperatura - 273.15;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Kelvin a Kelvin
                            else if(seekBar1.getProgress() == 1) {
                                int resultado = temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Kelvin a Farenheit
                            else if (seekBar1.getProgress() == 2) {
                                double resultado = (temperatura - 273.15) * 9 / 5 + 32;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                        //Si el seekbar2 es Farenheit
                        else if (seekBar2.getProgress() == 2) {
                            //Para pasar de Farenheit a Celsius
                            if (seekBar1.getProgress() == 0) {
                                double resultado = (temperatura - 32) * 5 / 9;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Farenheit a Kelvin
                            else if(seekBar1.getProgress() == 1) {
                                double resultado =((temperatura- 32) / 1.8) + 273.15;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                            //Para pasar de Farenheit a Farenheit
                            else if (seekBar1.getProgress() == 2) {
                                double resultado =temperatura;
                                editText2.setText(String.valueOf(resultado));
                                System.out.println(resultado);
                            }
                        }
                    }catch (NumberFormatException e){
                        // Si hay un error en la conversión del texto a número
                        editText2.setText("Error: Entrada no válida");
                    }
                } else {
                    //Vacio
                    // Si el texto está vacío
                    editText2.setText("Error: Ingrese un valor");
                }
            }
        });

    }
}