package com.ilp506.conversao;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    Spinner spinner;
    TextView txtEntrada;
    TextView txtSaida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner= findViewById(R.id.spConversor);
        txtSaida = findViewById(R.id.txtSaida);
        txtEntrada = findViewById(R.id.txtEntrada);
        txtSaida.setEnabled(false);
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

            @Override
            public void afterTextChanged(Editable s) {
                switch((int) spinner.getSelectedItemId()){
                    case 0 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.polegadasCentimetros(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        break;
                    case 1 :

                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.centimetrosPolegadas(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        break;
                    case 2 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.pesMetros(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        break;
                    case 3 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.metrosPes(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        break;
                    case 4 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.milhaKm(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        break;
                    case 5 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.kmMilha(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        break;
                    case 6 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.fahrenheitCelsius(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        break;
                    case 7 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.celsiusFahrenheit(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        break;
                    case 8 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.nosKm(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        break;
                    case 9 :
                        if(!txtEntrada.getText().toString().isEmpty())
                        txtSaida.setText(String.valueOf(
                                Conversao.kmNos(
                                        Double.parseDouble(txtEntrada.getText().toString()))));
                        break;
                }
            }
        });
    }
}