package unidad3.AlgoritmosdeOrdenamiento;

public class MainMezcla {
    public static void main(String[] args) {
        OrdenamientoMezcla.MergeSort mergeSort = new OrdenamientoMezcla.MergeSort();
        int arr [] = {47,12,10,9,80,20};
        int n = arr.length;

        System.out.println("Array original:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("Array ordenado:");
        mergeSort.sort(arr,0,n-1);
        mergeSort.printArray(arr);
    }
}
