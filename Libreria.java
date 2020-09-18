package Practico5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Libreria {
    public static void main(String args[]) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        Libro libroUno = new Libro();
        Libro libroDos = new Libro();

        System.out.println("Ingrese el ISBN del libro");
        libroUno.setISBN(Integer.parseInt(reader.readLine()));

        System.out.println("Ingrese el titulo del libro");
        libroUno.setTitulo(reader.readLine());

        System.out.println("Ingrese el Autor del libro");
        libroUno.setAutor(reader.readLine());

        System.out.println("Ingrese el numero de paginas que contiene el libro");
        libroUno.setNumerodePaginas(Integer.parseInt(reader.readLine()));


        System.out.println("Datos del libro");
        System.out.println(libroUno);


        //**********************

        System.out.println("Ingrese el ISBN del libro 2");
        libroDos.setISBN(Integer.parseInt(reader.readLine()));

        System.out.println("Ingrese el titulo del libro 2");
        libroDos.setTitulo(reader.readLine());

        System.out.println("Ingrese el Autor del libro 2");
        libroDos.setAutor(reader.readLine());

        System.out.println("Ingrese el numero de paginas que contiene el libro 2");
        libroDos.setNumerodePaginas(Integer.parseInt(reader.readLine()));


        System.out.println("Datos del libro 2");
        System.out.println(libroDos);


    }
}






