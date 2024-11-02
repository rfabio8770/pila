package uc.as.p3.test;
import uc.as.p3.modelo.*;
public class Main {

    public static void main(String args[]) {
        Publicacion p = new Publicacion("Codigo", "Titulo", 2022);
        Libro libro = new Libro("8900", "Los palomares cercados", 1990);
        System.out.println(libro);
        libro.prestar();
        System.out.println(libro);
        Revista r = new Revista("8918", "Informática Hoy", 2014, 9009);
        System.out.println(r);
    }
}
