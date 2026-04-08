package org.example;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro para a comparação: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número inteiro para a comparação: ");
        int num2 = input.nextInt();

        if ( num1 == num2 ) {
            System.out.println("Os dois números são iguais");

        }else{
                System.out.println("Os números são diferentes");
                if (num1 > num2){
                    System.out.println("O primeiro número é maior.");
                }
                else{
                    System.out.println("O segundo número é maior.");
                }
        }
    }
}
