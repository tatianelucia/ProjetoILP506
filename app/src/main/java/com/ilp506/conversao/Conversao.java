package com.ilp506.conversao;

import android.view.View;

public class Conversao {

    public static double celsiusFahrenheit(double c){
        return c*1.8 + 32;
    }

    public static double fahrenheitCelsius(double f){
        return (f-32)/1.8;
    }

    public static double centimetrosPolegadas(double centimetros){ return (centimetros/2.54); }

    public static double polegadasCentimetros(double polegadas) {return (polegadas*2.54); }


    public static double pesMetros(double pes) {return (pes/0.3048); }

    public static double metrosPes(double metros) {return (metros*0.3048); }

    public static double milhaKm(double milha) {return (milha*1.609); }

    public static double kmMilha(double km) {return (km/1.609);  }

    public static double nosKm(double nos){return (nos*1.852);   }

    public static double kmNos(double km){return (km/1.852);    }
}
