package deveberr.java.oop.Aintroducaoclasses.test;

import deveberr.java.oop.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Porsche 911";
        carro1.modelo = "911 Turbo S";
        carro1.ano = 2023;

        carro2.nome = "BMW Série 7";
        carro2.modelo = "750i xDrive";
        carro2.ano = 2022;

        System.out.println("Nome: " + carro1.nome + " " + "Modelo: " + carro1.modelo + " " + "Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + " " + "Modelo: " + carro2.modelo + " " + "Ano: " + carro2.ano);
    }
}
