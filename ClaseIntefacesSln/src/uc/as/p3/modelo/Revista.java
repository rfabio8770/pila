package uc.as.p3.modelo;

public class Revista extends Publicacion {

    private int numero;

    public Revista(String codigo, String titulo, int anio, int numero) {
        super(codigo, titulo, anio);
        this.numero = numero;
    }


    public String toString() {
        StringBuilder s = new StringBuilder(super.toString());
        s.append("\nNúmero de Publicación de la revista " + numero);
        return s.toString();
    }
}
