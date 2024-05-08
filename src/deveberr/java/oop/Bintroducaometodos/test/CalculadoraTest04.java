package deveberr.java.oop.Bintroducaometodos.test;

import deveberr.java.oop.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Calculadora calculadora2 = new Calculadora();

        int resultado1 = calculadora.plusMethod(10, 20);
        float resultado2 = calculadora2.plusMethod(3.2f, 5.22f);

        System.out.println("Int: " + resultado1);
        System.out.println("Float: " + resultado2);
    }
}
