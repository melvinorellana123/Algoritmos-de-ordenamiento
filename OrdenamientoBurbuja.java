package unidad3.AlgoritmosdeOrdenamiento;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int[] arreglo = {5, 2, 4, 1, 3};
        int aux;
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
