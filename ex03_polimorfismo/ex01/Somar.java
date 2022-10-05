package ex03_polimorfismo.ex01;

public class Somar extends Calculadora {
    float resultado;

    public void calcular (float n1, float n2) {
        resultado = n1 + n2;
    }

    public void exibeResultado() {
        System.out.println("Soma: " + resultado);
    }
}
