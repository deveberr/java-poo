package deveberr.java.oop.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() { // (CalculadoraTest01)
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() { // (CalculadoraTest01)
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(int a, double b) { // Parâmetros (CalculadoraTest02)
        System.out.println(a * b);
    }

    public double divideDoisNumeros(double num1, double num2) { // Retorno (CalculadoraTest03)
        return num1 / num2;
    }

    public int plusMethod(int x, int y) { // Sobrecarga de método (CalculadoraTest04)
        return x + y;
    }

    public float plusMethod(float x, float y) { // Sobrecarga de método (CalculadoraTest04)
        return x + y;
    }
}
