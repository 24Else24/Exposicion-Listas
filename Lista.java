public class Lista {
    private Nodo inicio;
    private Nodo fin;
    private int cantidad;

    public Lista() {
        this.inicio = null;
        this.fin = null;
        this.cantidad = 0;
    }

    public boolean vacia() {
        return inicio == null && fin == null;
    }

    public void agregarInicio(Object dato) {
        if (vacia()) {
            inicio = fin = new Nodo(dato, null, null);
        } else {
            Nodo nuevo = new Nodo(dato, inicio, null);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
        cantidad++;
    }

    public void agregarFin(Object dato) {
        if (vacia()) {
            inicio = fin = new Nodo(dato, null, null);
        } else {
            Nodo nuevo = new Nodo(dato, null, fin);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        cantidad++;
    }

    public void eliminarInicio() {
        if (!vacia()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);
            }
            cantidad--;
        }
    }

    //para eliminar el fin
    public void eliminarFin() {
        if (!vacia()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                fin = fin.getAnterior();
                fin.setSiguiente(null);
            }
            cantidad--;
        }
    }

    public boolean palabraPalindroma() {
        if (!vacia()) {
            int mitad = (int) (this.getCantidad() / 2);
            int i = 0;
            Nodo primero = inicio;
            Nodo ultimo = fin;
            while (i < mitad) {
                if (primero.getDato() == ultimo.getDato()) {
                    primero = primero.getSiguiente();
                    ultimo = ultimo.getAnterior();
                } else {
                    return false;
                }
                i++;
            }
            return true;
        }
        return false;
    }

    //Para eliminar el inicio


    //mostrar cada uno de los datos
    public String mostrarFinInicio() {
        String salida = "";
        if (!vacia()) {
            Nodo aux = fin;
            while (aux != null) {
                salida += aux.getDato() + "\n";
                aux = aux.getAnterior();
            }
        }
        return salida;
    }

    public void insertarLista() {
        Nodo primero = inicio;
        Nodo ultimo = fin;

        for (int i = 0; i < this.cantidad / 2; i++) {
            Object aux = primero.getDato();
            primero.setDato(ultimo.getDato());
            ultimo.setDato(aux);
            ultimo = ultimo.getAnterior();
            primero = primero.getSiguiente();
        }


    }

    public String mostrarInicioFin() {
        String salida = "";
        if (!vacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                salida += aux.getDato() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return salida;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
