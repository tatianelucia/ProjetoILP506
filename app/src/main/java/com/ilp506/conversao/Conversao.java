package com.ilp506.conversao;

import android.icu.text.DecimalFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.N)
public class Conversao {

    public static double celsiusFahrenheit(double c){
        return c*1.8 + 32;
    }

    public static double fahrenheitCelsius(double f){
        return (f-32)/1.8;
    }

    public static Object centimetrosPolegadas(double centimetros){
        DecimalFormat formatador = new DecimalFormat("0.00");
        return formatador.format(centimetros/2.54);
    }

    public static Object polegadasCentimetros(double polegadas) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        return formatador.format(polegadas*2.54);
        }

    public static Object pesMetros(double pes) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        return formatador.format(pes/3.2808);
    }

    public static Object metrosPes(double metros) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        return formatador.format(metros*3.2808);
    }

    public static Object milhaKm(double milha) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        return formatador.format(milha*1.609);
    }

    public static Object kmMilha(double km) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        return formatador.format(km/1.609);  }

    public static Object nosKm(double nos) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        return formatador.format(nos*1.852);
    }

    public static Object kmNos(double km) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        return formatador.format(km/1.852);
    }
}
