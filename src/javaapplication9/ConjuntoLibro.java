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
public class ConjuntoLibro {
    private Libro libro[];
    public ConjuntoLibro(Libro libro[]){
        this.libro=new Libro[10];
    }
    public boolean anadirLibro(Libro _libro){
        boolean guardado=false;
        for(int i=0; i<10; i++){
            if (libro[i]==null){
                libro[i]=_libro;
                guardado=true;
            }
        }
        return guardado;
    }
    public boolean eliminarLibroxTitulo(String _titulo){
        boolean eliminado=false;
        for(int i=0; i<10; i++){
            if (libro[i].getTitulo().equals(_titulo)){
                libro[i]=null;
                eliminado=true;
            }
        }
        return eliminado;
    }
    
    public boolean eliminarLibroxAutor(String nombre, String apellido){
        for(int i=0; i<10; i++){
            if (libro[i].getAutor().getNombre().equals(nombre) && libro[i].getAutor().getApellido().equals(apellido)){
                libro[i]=null;
                return true;
            }
        }
        return false;
}
    
    public Libro buscarMejorCalificado(){
        int mayor=0;
        double bestScore= libro[0].getScore();
        for(int i=1; i<this.libro.length; i++){
            if(bestScore<libro[i].getScore()){
                mayor=i;
                bestScore=libro[i].getScore();
            }
        }
        return libro[mayor];
    }
    
    public Libro buscarMenorCalificado(){
        int menor=0;
        double lowestScore= libro[0].getScore();
        for(int i=1; i<this.libro.length; i++){
            if(lowestScore>libro[i].getScore()){
                menor=i;
                lowestScore=libro[i].getScore();
            }
        }
        return libro[menor];
    }
    public Libro[] getLibros(){
        return this.libro;
    }
}
