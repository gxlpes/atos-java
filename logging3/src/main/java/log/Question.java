package log;

import java.util.Scanner;

public class Question {
    static float n1;
    static float n2;
    Scanner read = new Scanner(System.in);

    public float questionQ1() {
        System.out.println("Digite o primeiro numero: ");
        n1 = read.nextFloat();
        return n1;
    }

    public float questionQ2() {
        System.out.println("Digite o segundo numero: ");
        n2 = read.nextFloat();
        return n2;
    }
};
