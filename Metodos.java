import java.util.LinkedList;

public class Metodos {

    private LinkedList<Object> lista;

    public Metodos() {
        lista = new LinkedList<>();
    }

    public boolean vacia() {
    if (lista.isEmpty()) {
        return true;
    } else {
        return false;
    }
}

    public void agregarInicio(Object dato) {
        lista.addFirst(dato);
    }

    public void agregarFin(Object dato) {
        lista.addLast(dato);
    }

    public boolean palabraPalindroma() {
        if (vacia()) return false;

        int inicio = 0;
        int fin = lista.size() - 1;

        while (inicio < fin) {
            if (!lista.get(inicio).equals(lista.get(fin))) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }

    public void eliminarInicio() {
        if (!vacia()) {
            lista.removeFirst();
        }
    }

    public void eliminarFin() {
        if (!vacia()) {
            lista.removeLast();
        }
    }

    public String mostrarInicioFin() {
        String salida = "";
        for (Object dato : lista) {
            salida += dato + "\n";
        }
        return salida;
    }

    public String mostrarFinInicio() {
        String salida = "";
        for (int i = lista.size() - 1; i >= 0; i--) {
            salida += lista.get(i) + "\n";
        }
        return salida;
    }

    public void invertirLista() {
        int inicio = 0;
        int fin = lista.size() - 1;

        while (inicio < fin) {
            Object temp = lista.get(inicio);
            lista.set(inicio, lista.get(fin));
            lista.set(fin, temp);

            inicio++;
            fin--;
        }
    }
}