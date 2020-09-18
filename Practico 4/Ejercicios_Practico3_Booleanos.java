package Practico3;

import java.util.Scanner;

public class Ejercicios_Practico3_Booleanos {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();

        //System.out.println("Ingrese un numero");
        //int num2 = input.nextInt();

       //boolean esMayor= esMayor(num,num2);
       //System.out.println( esMayor);

        //boolean menor18 = menor18(num);
        //System.out.println(menor18);

        //boolean impar = impar(num);
        //System.out.println(impar);

        boolean imparMayor = imparMayor(num);
        System.out.println(imparMayor);
    }

    //Método que reciba dos números y retorne verdadero si el primer numero es mayor que el segundo.
    // De lo contrario, retornar debe retornar falso.
    public static boolean esMayor(int num1, int num2){
        if(num1>num2){
            return true;
        }else{
            return false;
        }
    }

    //Dado un número, retorne verdadero si el número es menor a 0.
    public static boolean menor(int num){
        if (num<=0){
            return false;
        }else{
            return true;
        }
    }

    //Método que retorne verdadero si el número recibido
    // por parámetro es mayor a 18. De lo contrario, se debe retornar falso.
    public static boolean menor18(int num){
        if (num>=18){
            return true;
        }else{
            return false;
        }
    }
    //Realizar un método que retorne verdadero si el número recibido por parámetro es impar
    public static boolean impar(int num){
        if(num %2 !=0){
            return true;
        }else{
            return false;
        }
    }
    //Realizar un método que retorne verdadero si el número recibido por parámetro es impar y mayor a 20
    public static boolean imparMayor(int num){
        if(num %2 !=0 || num > 20){
            return true;
        }else{
            return false;
        }

    }
    //Realizar un método llamado esPrimo que reciba un número,
    // y retorne true si solo si el número es primo (es divisible entre si, y la unidad)

}
