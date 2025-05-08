import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        boolean sortir = false;

        int opcio;
        while (!sortir) {
            System.out.println("\n=== MENÚ DE GESTIÓ DE LLIBRES ===");
            System.out.println("1. Afegir llibre");
            System.out.println("2. Modificar llibre");
            System.out.println("3. Eliminar llibre");
            System.out.println("4. Mostrar llibres");
            System.out.println("0. Sortir");
            System.out.print("Opció: ");
            opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    System.out.print("Títol: ");
                    String titolNou = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autorNou = scanner.nextLine();
                    biblioteca.afegirLlibre(new Llibre(titolNou, autorNou));
                    break;
                case 2:
                    System.out.print("Títol del llibre a modificar: ");
                    String titolOriginal = scanner.nextLine();
                    Llibre llibreModificar = biblioteca.buscarLlibre(titolOriginal);
                    if (llibreModificar != null) {
                        System.out.print("Nou títol: ");
                        String nouTitol = scanner.nextLine();
                        System.out.print("Nou autor: ");
                        String nouAutor = scanner.nextLine();
                        llibreModificar.setTitol(nouTitol);
                        llibreModificar.setAutor(nouAutor);
                    } else {
                        System.out.println("Llibre no trobat.");
                    }
                    break;
                case 3:
                    System.out.print("Títol del llibre a eliminar: ");
                    String titolEliminar = scanner.nextLine();
                    Llibre llibreEliminar = biblioteca.buscarLlibre(titolEliminar);
                    if (llibreEliminar != null) {
                        biblioteca.getLlibres().remove(llibreEliminar);
                        System.out.println("Llibre eliminat.");
                    } else {
                        System.out.println("Llibre no trobat.");
                    }
                    break;
                case 4:
                    if (biblioteca.getLlibres().isEmpty()) {
                        System.out.println("No hi ha llibres.");
                    } else {
                        for (Llibre l : biblioteca.getLlibres()) {
                            System.out.println(l);
                        }
                    }
                    break;
                case 0:
                    sortir = true;
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        }

        scanner.close();
        System.out.println("Fins aviat!");
    }
}
