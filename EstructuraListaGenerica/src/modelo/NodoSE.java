
package modelo;


public class NodoSE<T extends Comparable<T> > {
    private T dato;
    private NodoSE<T> siguiente;
    
    public NodoSE(T dato) {
        this.dato = dato;
        siguiente = null;
    }
    
    public T dato() // get Dato
    {
        return dato;
    }
    
    // get Siguiente
    public NodoSE<T> siguiente() {
        return siguiente;
    }
    
    public void setDato(T dato) {
        this.dato = dato;
    }
    
    public void setSiguiente(NodoSE<T> enlace) {
        siguiente = enlace;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder("| " + dato + " | ");
        if (siguiente != null)
            s.append(" --> ");
        else
            s.append(" *");
        return s.toString();
    }
}
