package com.mycompany.libropoo;

public class Libro {
    
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private boolean leido; 

   
    public Libro(String titulo, String autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.leido = false;
    }

   /*Complejidadtemporal:O(1)Tiempoconstante.*/
    public String mostrarInformacion() {
        return "Título: " + titulo + ", Autor: " + autor + 
               ", Año de publicación: " + anoPublicacion + 
               ", Leído: " + (leido ? "Sí" : "No");
    }

   /**Complejidadtemporal:O(1)Tiempoconstante.*/
    public void marcarLeido() {
        this.leido = true;
    }

     /**Complejidadtemporal:O(1)Tiempoconstante.*/
    public boolean esAntiguo() {
        return (2023 - anoPublicacion) > 50;
    }

     /**Complejidadtemporal:O(1)Tiempoconstante.*/
    public boolean isLeido() {
        return leido;
    }
    
}
