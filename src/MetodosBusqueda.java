public class MetodosBusqueda {

    public int busquedaSecuencial(int[] arreglo, int valorBuscado) {

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;

            }

        }
        return -1;
    }

    public void printArreglo(int[] arreglo) {
        for (int elem : arreglo) {
            System.out.println(elem + "");
        }
    }

    public int BusquedaBinaria(int[] arr, int value) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (arr[medio] == value) {
                return medio;
            }
            if (arr[medio] < value) {
                inicio = medio + 1; // Buscar en el medio de la derecha

            } else {
                // buscar el mitdad de la izquierda
                fin = medio - 1;

            }
        }
        return -1;
    } // comparacio; tiempo
}
