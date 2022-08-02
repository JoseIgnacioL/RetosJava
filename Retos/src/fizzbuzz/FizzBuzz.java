/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Jose Ignacio
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
//    Enunciado de FizzBuzz
//    Devuelve Fizz si el número es divisible por 3. Devuelve FizzBuzz si el número es divisible por 3 y por 5. El código de la primera iteración es este.
    public static void fizzBuzz() {

        for (int i = 0; i < 101; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //Preguntar el proximo dia no se como plantearlo
    public static void pintarCodigoMorse() {
        System.out.println("=========== CODIGO MORSE ===========");
        System.out.println("-------------------------------------");
        System.out.println(":A .-       :  B -... :  C -.-. :  D -.. ");
        System.out.println(":E .        :  F ..-. :  G --.  :  H ....");
        System.out.println(":I .        :  J .--- :  K -.-. :  L .-..");
        System.out.println(":M --       :  N -.   :  O ---. :  P .--.");
        System.out.println(":Q --.-     :  R .-.  :  S ...  :  T - ");
        System.out.println(":U ..-      :  V ...- :  W .--  :  X -..- ");
        System.out.println(":Y -.--     :  Z --.. ");
        System.out.println("-------------------------------------");

    }

    public static void pasarMorse() {
        Scanner sc = new Scanner(System.in);
        String datoUsuario;
        System.out.println("Introduce mensaje en codigo morse");
        datoUsuario = sc.nextLine();

    }

    public static void main(String[] args) {
        // TODO code application logic here
        fizzBuzz();
//        pintarCodigoMorse();
//        pasarMorse();


 
    }
    }


