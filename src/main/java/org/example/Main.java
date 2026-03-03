package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Digite um número: ");
            int a = sc.nextInt();

            System.out.println("Digite outro número: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e){
            System.out.println("Erro: Não da para dividir por zero");
        } catch (InputMismatchException ex){
            System.out.println("Erro: Voce precisa inserir apenas numeros");
        } catch (Exception ex2){
            System.out.println("Erro: " + ex2.getMessage());
        }

    }

}