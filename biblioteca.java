import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Llibre> llibres;

    public Biblioteca() {
        this.llibres = new ArrayList<>();
    }

    public void afegirLlibre(Llibre llibre) {
        llibres.add(llibre);
    }

    public Llibre buscarLlibre(String titol) {
        for (Llibre llibre : llibres) {
            if (llibre.getTitol().equalsIgnoreCase(titol)) {
                return llibre;
            }
        }
        return null;
    }

    public List<Llibre> getLlibres() {
        return llibres;
    }

    
    public boolean prestarLlibre(Lector lector, String titol) {
        Llibre llibre = buscarLlibre(titol);
        if (llibre != null) {
            lector.afegirLlibrePrestado(llibre);
            llibres.remove(llibre);
            return true;
        }
        return false; 
    }
    public void retornarLlibre(Lector lector, String titol) {
        Llibre llibre = null;
        for (Llibre l : lector.getLlibresPrestats()) {
            if (l.getTitol().equalsIgnoreCase(titol)) {
                llibre = l;
                break;
            }
        }
        if (llibre != null) {
            lector.getLlibresPrestats().remove(llibre);
            llibres.add(llibre); 
        }
    }
}
