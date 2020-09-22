package Program;


import model.Calculadora;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Entre com o primeiro número");
        int s1 = sc.nextInt();

        System.out.println("Entre com o segundo número");
        int s2 = sc.nextInt();



        int c1 = new Calculadora().somar(s1,s2);
        int c2 = new Calculadora().subtrair(s1,s2);
        int c3 = new Calculadora().multiplicar(s1,s2);
        int c4 = new Calculadora().dividir(s1,s2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
