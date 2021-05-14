package com.ilp506.conversao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dado = (EditText)findViewById(R.id.txt_dado);
        fc = (RadioButton)findViewById(R.id.rb_FC);
        cf = (RadioButton)findViewById(R.id.rb_CF);
    }

    EditText dado;
    RadioButton fc, cf;

    public void btnConverterOnClick(View view) {
        double valor = new Double(dado.getText().toString());
        if(fc.isChecked()) {
            valor = Conversao.fahrenheitCelsius(valor);
        }
        else {
            valor = Conversao.celsiusFahrenheit(valor);
        }
        dado.setText(new Double(valor).toString());
    }
}