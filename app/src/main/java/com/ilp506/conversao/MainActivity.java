package com.ilp506.conversao;


import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private  Spinner spinner;
    private  TextView txtEntrada;
    private  TextView txtSaida;
    private  TextView entrada;
    private  TextView saida;
    private  ArrayList<Double> strRegistrar;
    private  TextView txtRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spConversor);
        txtSaida = findViewById(R.id.txtSaida);
        txtEntrada = findViewById(R.id.txtEntrada);
        txtSaida.setEnabled(false);
        entrada = findViewById(R.id.entrada);
        saida = findViewById(R.id.saida);
        strRegistrar = new ArrayList<>();
        txtRegistro = findViewById(R.id.txtRegistro);

        txtRegistro.setMovementMethod(new ScrollingMovementMethod());
    }

    public void btnRegistrar(View view) {
        String result;
        //result = txtEntrada.getText().toString();
       Double.parseDouble(result = txtSaida.getText().toString());
        if(result != null) {
            strRegistrar.add(Double.parseDouble(result));
        }
        exibeRegistro();
    }

    private void exibeRegistro() {
        String s = "";
        for(int i = 0 ; i < strRegistrar.size(); i++) {
            if(i < strRegistrar.size()-1) {
                s += (i+1) + ": " + strRegistrar.get(i).toString() + saida + "\n";
            }
            else {
                s += (i+1) + ": " + strRegistrar.get(i).toString() + saida;
            }
        }
        txtRegistro.setText(s);
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

        TextWatcher txtwatcher = new TextWatcher() {
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
                        entrada.setText("Polegadas");
                        saida.setText("CM");
                        if(!txtEntrada.getText().toString().isEmpty()){
                            txtSaida.setText(Conversao.polegadasCentimetros(
                                    Double.parseDouble(txtEntrada.getText().toString())));
                        }
                        break;
                    case 1 :
                        entrada.setText("CM");
                        saida.setText("Polegadas");
                        if(!txtEntrada.getText().toString().isEmpty())
                            txtSaida.setText(Conversao.centimetrosPolegadas(
                                    Double.parseDouble(txtEntrada.getText().toString())));
                        break;
                    case 2 :
                        entrada.setText("Pés");
                        saida.setText("Metros");
                        if(!txtEntrada.getText().toString().isEmpty())
                            txtSaida.setText(Conversao.pesMetros(
                                    Double.parseDouble(txtEntrada.getText().toString())));
                        break;
                    case 3 :
                        entrada.setText("Metros");
                        saida.setText("Pés");
                        if(!txtEntrada.getText().toString().isEmpty())
                            txtSaida.setText(Conversao.metrosPes(
                                    Double.parseDouble(txtEntrada.getText().toString())));
                        break;
                    case 4 :
                        entrada.setText("Milhas");
                        saida.setText("Km");
                        if(!txtEntrada.getText().toString().isEmpty())
                            txtSaida.setText(Conversao.milhaKm(
                                    Double.parseDouble(txtEntrada.getText().toString())));
                        break;
                    case 5 :
                        entrada.setText("Km");
                        saida.setText("Milhas");
                        if(!txtEntrada.getText().toString().isEmpty())
                            txtSaida.setText(
                                    Conversao.kmMilha(
                                            Double.parseDouble(txtEntrada.getText().toString())));
                        break;
                    case 6 :
                        entrada.setText("Fº");
                        saida.setText("Cº");
                        if(!txtEntrada.getText().toString().isEmpty())
                            txtSaida.setText(Conversao.fahrenheitCelsius(
                                    Double.parseDouble(txtEntrada.getText().toString())));
                        break;
                    case 7 :
                        entrada.setText("Cº");
                        saida.setText("Fº");
                        if(!txtEntrada.getText().toString().isEmpty())
                            txtSaida.setText(Conversao.celsiusFahrenheit(
                                    Double.parseDouble(txtEntrada.getText().toString())));
                        break;
                    case 8 :
                        entrada.setText("Nós");
                        saida.setText("Km");
                        if(!txtEntrada.getText().toString().isEmpty())
                            txtSaida.setText(Conversao.nosKm(
                                    Double.parseDouble(txtEntrada.getText().toString())));
                        break;
                    case 9 :
                        entrada.setText("Km");
                        saida.setText("Nós");
                        if(!txtEntrada.getText().toString().isEmpty())
                            txtSaida.setText(Conversao.kmNos(
                                    Double.parseDouble(txtEntrada.getText().toString())));
                        break;
                }
            }
        };

        txtEntrada.addTextChangedListener(txtwatcher);


            TextView v;
            v = findViewById(R.id.txtEntrada);
            v.setText("");

        }

    @SuppressLint("WrongViewCast")
    public void btnlimpar(View view) {
        TextView v;
        //v = findViewById(R.id.spConversor);
        //v.setText("Selecionar Tipo de Conversão");
        v = findViewById(R.id.txtEntrada);
        v.setText("");
        v = findViewById(R.id.txtSaida);
        v.setText("");
    }
}