package uc.as.p3.modelo;

public class Publicacion {

    private String codigo;
    private String titulo;
    private int anio;

    public Publicacion(String codigo, String titulo, int anio) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\nPublicación");
        s.append("\nCodigo " + codigo);
        s.append("\nTitulo " + titulo);
        s.append("\nAño " + anio);       
        return s.toString();
  
    }
}
