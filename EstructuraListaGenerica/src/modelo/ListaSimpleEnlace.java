
package modelo;


public class ListaSimpleEnlace<T extends Comparable<T>> {
    private NodoSE<T> cabecera;
    
    public ListaSimpleEnlace()
    {
        cabecera = null;
    }
    
    public ListaSimpleEnlace(NodoSE<T> nodo)
    {
        cabecera = nodo;
    }
    
    public boolean listaVacia() {
        return (cabecera == null);
    }
    
    
    public NodoSE<T> cabecera() {
        return cabecera;
    }
    
    public void cabecera(NodoSE<T> nodo) {
        cabecera = nodo;
    }
    public void insertar(T dato) {
        if (listaVacia())
            cabecera = new NodoSE<>(dato);
        else {
            if (cabecera.dato().compareTo(dato) > 0) {
                NodoSE<T> nodo = new NodoSE<>(dato);
                nodo.setSiguiente(cabecera);
                cabecera = nodo;
            }
            else {
                NodoSE<T> nodo = new NodoSE<>(dato);
                NodoSE<T> plista = cabecera;
                while (plista.siguiente() != null && plista.siguiente().dato().compareTo(dato) < 0) {
                    plista = plista.siguiente();
                }
                if (plista.siguiente() != null) {
                    nodo.setSiguiente(plista.siguiente());
                    plista.setSiguiente(nodo);
                } else {
                    plista.setSiguiente(nodo);
                }
                
            }
      
        }
    }
    
    public void eliminar(T dato) {
        if (listaVacia())
            return;
        else if (cabecera.dato().compareTo(dato) == 0) {
            NodoSE<T> nodoTemp = cabecera;
            cabecera = cabecera.siguiente();
            nodoTemp.setSiguiente(null);
        } else {
            NodoSE<T> nodoActual = cabecera;
            while (nodoActual.siguiente() != null && nodoActual.siguiente().dato().compareTo(dato) < 0) {
                nodoActual = nodoActual.siguiente();
            }
            if (nodoActual.siguiente() == null)
                System.out.println("No se encontro " + dato + " en la lista");
            
            if (nodoActual.siguiente().dato().compareTo(dato) == 0)
            {
                NodoSE<T> nodoTemp = nodoActual.siguiente();
                nodoActual.setSiguiente(nodoActual.siguiente().siguiente());
            }
        }
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        if (listaVacia())
            s.append("*");
        else {
            NodoSE<T> nodo = cabecera;
            while (nodo != null) {
                s.append(nodo);
                nodo = nodo.siguiente();
            }
        }
        return s.toString();
    }
}
