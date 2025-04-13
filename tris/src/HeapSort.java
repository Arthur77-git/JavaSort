public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Construire le tas (heap)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extraire les éléments du tas un par un
        for (int i = n - 1; i > 0; i--) {
            // Déplacer la racine vers la fin
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Réorganiser le tas réduit
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;      // Initialiser le plus grand comme racine
        int left = 2 * i + 1; // Fils gauche
        int right = 2 * i + 2;// Fils droit

        // Si le fils gauche est plus grand que la racine
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Si le fils droit est plus grand que le plus grand actuel
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Si le plus grand n'est pas la racine
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Réorganiser le sous-arbre affecté
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {

    }
}