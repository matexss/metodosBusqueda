package controllers;
import views.ShowConsole;

public class MetodosBusqueda {
    public ShowConsole showConsole = new ShowConsole();

    public int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                showConsole.mostrarMensaje("Valor encontrado en la posición: " + i);
                return i;
            }
        }
        showConsole.mostrarMensaje("Valor no encontrado.");
        return -1;
    }
}
