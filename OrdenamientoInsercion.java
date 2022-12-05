package unidad3.AlgoritmosdeOrdenamiento;

public class OrdenamientoInsercion {
    public static void main(String[] args) {
        int[] arreglo = {5, 2, 4, 1, 3};
        int aux;
        int j;
        for (int i = 1; i < arreglo.length; i++) {
            aux = arreglo[i];
            j = i - 1;
            while (j >= 0 && arreglo[j] > aux) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
