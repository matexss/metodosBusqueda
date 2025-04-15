import controllers.MetodosBusqueda;

public class App {
    public static void main(String[] args) {
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        int[] arreglo = {3, 8, 15, 22, 35};
        int valorBuscado = 22;

        metodosBusqueda.busquedaLineal(arreglo, valorBuscado);
    }
}
