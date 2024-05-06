package deveberr.java.oop.Aintroducaoclasses.test;

import deveberr.java.oop.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante(); // Posso criar vários objetos e alterar o valor em um objeto sem afetar o outro
        estudante.nome = "Goku";
        estudante2.nome = "Gohan";
        estudante.idade = 20;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante2.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.cpf);
    }
}
