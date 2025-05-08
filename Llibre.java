public class Llibre {
    private String titol;
    private String autor;
    private boolean prestat;
    private String categoria;

     public Llibre(String titol, String autor, String categoria) {
        this.titol = titol;
        this.autor = autor;
        this.categoria = categoria;
        this.prestat = false;
    }

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public boolean esPrestat() {
        return prestat;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrestat(boolean prestat) {
        this.prestat = prestat;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

   @Override
    public String toString() {
        return titol + " de " + autor + " (" + categoria + ")" + (prestat ? " (En préstec)" : " (Disponible)");
    }
}
