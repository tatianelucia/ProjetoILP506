package com.ilp506.conversao;


import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Spinner spinner;
    TextView txtEntrada;
    TextView txtSaida;
    TextView entrada;
    TextView saida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner= findViewById(R.id.spConversor);
        txtSaida = findViewById(R.id.txtSaida);
        txtEntrada = findViewById(R.id.txtEntrada);
        txtSaida.setEnabled(false);
        entrada = findViewById(R.id.entrada);
        saida = findViewById(R.id.saida);
    }

    public void onResume() {
        super.onResume();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtEntrada.setText("");
                txtSaida.setText("");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        txtEntrada.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void afterTextChanged(Editable s) {
                switch((int) spinner.getSelectedItemId()){
                    case 0 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.polegadasCentimetros(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        entrada.setText("polegadas");
                        saida.setText("cm");
                        break;
                    case 1 :

                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.centimetrosPolegadas(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        entrada.setText("cm");
                        saida.setText("polegadas");
                        break;
                    case 2 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.pesMetros(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        entrada.setText("pés");
                        saida.setText("metros");
                        break;
                    case 3 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.metrosPes(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        entrada.setText("metros");
                        saida.setText("pés");
                        break;
                    case 4 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.milhaKm(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        entrada.setText("milhas");
                        saida.setText("Km");
                        break;
                    case 5 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.kmMilha(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        entrada.setText("Km");
                        saida.setText("milhas");
                        break;
                    case 6 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.fahrenheitCelsius(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        entrada.setText("Fº");
                        saida.setText("Cº");
                        break;
                    case 7 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.celsiusFahrenheit(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        entrada.setText("Cº");
                        saida.setText("Fº");
                        break;
                    case 8 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.nosKm(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        entrada.setText("nós");
                        saida.setText("Km");
                        break;
                    case 9 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.kmNos(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        entrada.setText("Km");
                        saida.setText("nós");
                        break;
                }
            }
        });
    }
}