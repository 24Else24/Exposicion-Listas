import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Metodos lista = new Metodos();

        System.out.println("Ingrese una palabra:");
        String palabra = sc.nextLine();

        // llenar la lista
        for (int i = 0; i < palabra.length(); i++) {
            lista.agregarFin(palabra.charAt(i));
        }

        System.out.println("\nLista (inicio -> fin):");
        System.out.println(lista.mostrarInicioFin());

        // verificar palíndromo
        if (lista.palabraPalindroma()) {
            System.out.println("Es palíndroma");
        } else {
            System.out.println("No es palíndroma");
        }

        // invertir lista
        System.out.println("\nLista (fin -> inicio):");
        lista.invertirLista();

        System.out.println(lista.mostrarInicioFin());

        
    }
}