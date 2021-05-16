package com.ilp506.conversao;

import java.text.DecimalFormat;


public class Conversao {

    private static DecimalFormat formatador = new DecimalFormat("0.00");

    public static String celsiusFahrenheit(double c){
        return formatador.format(c*1.8 + 32);
    }

    public static String fahrenheitCelsius(double f){
        return formatador.format((f-32)/1.8);
    }

    public static String centimetrosPolegadas(double centimetros){
        return formatador.format(centimetros/2.54);
    }

    public static String polegadasCentimetros(double polegadas) {
        return formatador.format(polegadas*2.54);
        }

    public static String pesMetros(double pes) {
        return formatador.format(pes/3.2808);
    }

    public static String metrosPes(double metros) {
        return formatador.format(metros*3.2808);
    }

    public static String milhaKm(double milha) {
        return formatador.format(milha*1.609);
    }

    public static String kmMilha(double km) {
        return formatador.format(km/1.609);  }

    public static String nosKm(double nos) {
        return formatador.format(nos*1.852);
    }

    public static String kmNos(double km) {

        return formatador.format(km/1.852);
    }
}
