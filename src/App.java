import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

        // for (i = 0 ; i <= 100000 ; i++)
        // System.out.println(i);

        int[] arreglo = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        metodosBusqueda.printArreglo(arreglo);

        int posicion = metodosBusqueda.busquedaSecuencial(arreglo, 50);
        if (posicion != -1) {
            System.out.println("El valor se encuentra en la posicion " + posicion);
        } else {
            System.out.println("Valor no encontrado, error 404");
        }

    }

    // for (i = 0 ; i <= 100000 ; i++)
    // System.out.println(i);

    int[] arreglo = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };busquedabinaria.printArreglo(arreglo);

    int posicion = busquedabinaria.busquedaSecuencial(arreglo, 50);if(posicion!=-1)
    {
        System.out.println("El valor se encuentra en la posicion " + posicion);
    }else
    {
        System.out.println("Valor no encontrado, error 404");
    }

}}
