package com.mycompany.libropoo;

public class Libro {
    
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private boolean leido; // Initially set to false

   
    public Libro(String titulo, String autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.leido = false;
    }

   
    public String mostrarInformacion() {
        return "Título: " + titulo + ", Autor: " + autor + 
               ", Año de publicación: " + anoPublicacion + 
               ", Leído: " + (leido ? "Sí" : "No");
    }

   
    public void marcarLeido() {
        this.leido = true;
    }

 
    public boolean esAntiguo() {
        return (2023 - anoPublicacion) > 50;
    }

  
    public boolean isLeido() {
        return leido;
    }
    
}
