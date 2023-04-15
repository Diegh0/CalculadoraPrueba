package org.example;

import java.util.Scanner;

public class Calculadora {
    static Scanner reader=new Scanner(System.in);

    static int opcionMenu;
    static   int numero1,numero2;
    public static void main(String[] args) {
       showMenu();
       opciones();


    }
    public static void showMenu(){
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");
        System.out.print("OPCION: ");
        opcionMenu= reader.nextInt();
    }
    public static  void opciones(){

        switch (opcionMenu){
            case 1:
                System.out.print("Introduce un número: ");
                numero1=reader.nextInt();
                System.out.print("Introduce otro número: ");
                numero2=reader.nextInt();
                System.out.print("El resultado es: "+suma(numero1+numero2));
                break;
            case 2:
                System.out.print("Introduce un número: ");
                numero1=reader.nextInt();
                System.out.print("Introduce otro número: ");
                numero2=reader.nextInt();
                System.out.print("El resultado es: "+resta(numero1-numero2));
                break;
            case 3:
                System.out.print("Introduce un número: ");
                numero1=reader.nextInt();
                System.out.print("Introduce otro número: ");
                numero2=reader.nextInt();
                System.out.print("El resultado es: "+(numero1*numero2));
                break;
            case 4:
                System.out.print("Introduce un número: ");
                numero1=reader.nextInt();
                System.out.print("Introduce otro número: ");
                numero2=reader.nextInt();
                System.out.print("El resultado es: "+(numero1/numero2));
                break;
        }
    }
    static int suma(int resltadoSuma){
        resltadoSuma=numero1+numero2;
        return resltadoSuma;
    }
    static  int resta(int resultadoResta){
        resultadoResta=numero1-numero2;
        return resultadoResta;
    }
}