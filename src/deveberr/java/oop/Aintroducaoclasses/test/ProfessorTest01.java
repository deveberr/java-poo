package deveberr.java.oop.Aintroducaoclasses.test;

import deveberr.java.oop.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kame";
        professor.idade = 300;
        professor.sexo = 'M';
        System.out.println("Professor: " + professor.nome + " " + "Idade: " + professor.idade + " " + "Sexo:" + " " + professor.sexo);
    }
}
