package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int a, b;

        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();
        System.out.println("Digite o primeiro valor:");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subitrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("somar: " + somar);
        System.out.println("subtrair: " + subtrair);
        System.out.println("multiplicar: " + multiplicar);
        System.out.println("dividir: " + dividir);
    }

    public static int somar (int a , int b){
        return a + b;
    }  public static int subitrair (int a , int b){
        return a - b;
    }public static int multiplicar (int a , int b){
        return a * b;
    }public static double dividir (double a , double b){
        return a / b;
    }
}
