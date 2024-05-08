package deveberr.java.oop.Bintroducaometodos.test;

import deveberr.java.oop.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 4);
        System.out.println(resultado);
    }
}
