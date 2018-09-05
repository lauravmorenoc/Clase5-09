/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Estudiante
 */
public class PruebaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor a1=new Autor("Cassandra", "Claire");
        Libro libro[]=new Libro[10];
        libro[0]=new Libro(a1, "Cazadores", 250, 4.5);
        ConjuntoLibro c1=new ConjuntoLibro(libro);
        if (c1.anadirLibro(libro[0])==true){
            System.out.println("Libro añadido.");   
        }
    }
    
    /* Clase 05/09/18
    Relaciones de dependencia:
    1. En un método de una clase, se crea objetos de otra clase
    2. Un método de una clase recibe como parámtro o retorna un objeto de otra clase
    */
}
