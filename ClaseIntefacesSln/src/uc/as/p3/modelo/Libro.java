
package uc.as.p3.modelo;


public class Libro extends Publicacion implements Prestable {
    private boolean prestado;
    
    public Libro(String codigo, String titulo, int anio) {
        super(codigo, titulo, anio);
        prestado = false;
    }

    public void prestar() {
    prestado = true;
        
    }

    public void devolver() {
    prestado = false;
        
    }


    public boolean prestado() {
        return prestado;
    }

    @Override
    public String toString() {
       StringBuilder s = new StringBuilder(super.toString());
       s.append("\nEstado del libro prestado true o false " + prestado);
       return s.toString();
    }
}
