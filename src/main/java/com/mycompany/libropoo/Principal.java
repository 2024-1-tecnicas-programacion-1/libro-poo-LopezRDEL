package com.mycompany.libropoo;
import java.util.Scanner;

public class Principal {
    
     public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

         /**Complejidadtemporal:O(1)Tiempoconstante.*/
        System.out.println("Ingrese el título del libro:");
        String titulo = lector.nextLine();
         /**Complejidadtemporal:O(1)Tiempoconstante.*/
        System.out.println("Ingrese el autor del libro:");
        String autor = lector.nextLine();
         /**Complejidadtemporal:O(1)Tiempoconstante.*/
        System.out.println("Ingrese el año de publicación del libro:");
        int anoPublicacion = lector.nextInt();

        
        Libro libro = new Libro(titulo, autor, anoPublicacion);

      
        libro.marcarLeido();

         /**Complejidadtemporal:O(1)Tiempoconstante.*/
        System.out.println(libro.mostrarInformacion());
        System.out.println("¿El libro ha sido leído? " + (libro.isLeido() ? "Sí" : "No"));
        System.out.println("¿El libro es antiguo? " + (libro.esAntiguo() ? "Sí" : "No"));

        lector.close();
    }
}
