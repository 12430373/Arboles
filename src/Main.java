import Abb.Arbol_Binario_Busqueda;

public class Main {
    public static void main(String[] args) {
        Arbol_Binario_Busqueda Abb = new Arbol_Binario_Busqueda();

        Abb.insertar(3);
        Abb.insertar(2);
        Abb.insertar(4);
        Abb.insertar(1);
        Abb.insertar(3);
        Abb.insertar(5);
        Abb.insertar(7);
        Abb.insertar(6);

        Abb.mostrarInOrden();

        Abb.insertar(8);
        Abb.insertar(11);
        Abb.insertar(2);

        Abb.mostrarInOrden();

    }

}
