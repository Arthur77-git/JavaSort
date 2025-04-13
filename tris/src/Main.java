import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) {
        // Partie TRI RAPIDE
        System.out.println("\n=== Partie TRI RAPIDE ===");

        // Cas 1: Tableau avec des nombres aléatoires
        System.out.println("\nCas 1: Tableau aléatoire");
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Avant tri: ");
        printArray(arr1);
        QuickSort.quickSort(arr1, 0, arr1.length - 1);
        System.out.println("Après tri: ");
        printArray(arr1);

        // Cas 2: Tableau déjà trié
        System.out.println("\nCas 2: Tableau déjà trié");
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Avant tri: ");
        printArray(arr2);
        QuickSort.quickSort(arr2, 0, arr2.length - 1);
        System.out.println("Après tri: ");
        printArray(arr2);

        // Cas 3: Tableau avec doublons
        System.out.println("\nCas 3: Tableau avec doublons");
        int[] arr3 = {5, 2, 8, 5, 1, 9, 2, 8};
        System.out.println("Avant tri: ");
        printArray(arr3);
        QuickSort.quickSort(arr3, 0, arr3.length - 1);
        System.out.println("Après tri: ");
        printArray(arr3);

        // Partie TRI PAR TAS
        System.out.println("\n=== Partie TRI PAR TAS ===");

        // Cas 1: Tableau avec des nombres négatifs
        System.out.println("\nCas 1: Tableau avec nombres négatifs");
        int[] heapArr1 = {-4, 3, -12, 8, -1, 0, 15};
        System.out.println("Avant tri: ");
        printArray(heapArr1);
        HeapSort.heapSort(heapArr1);
        System.out.println("Après tri: ");
        printArray(heapArr1);

        // Cas 2: Tableau vide
        System.out.println("\nCas 2: Tableau vide");
        int[] heapArr2 = {};
        System.out.println("Avant tri: ");
        printArray(heapArr2);
        HeapSort.heapSort(heapArr2);
        System.out.println("Après tri: ");
        printArray(heapArr2);

        // Cas 3: Tableau à un seul élément
        System.out.println("\nCas 3: Tableau à un seul élément");
        int[] heapArr3 = {42};
        System.out.println("Avant tri: ");
        printArray(heapArr3);
        HeapSort.heapSort(heapArr3);
        System.out.println("Après tri: ");
        printArray(heapArr3);

        // Partie RECHERCHE DICHOTOMIQUE
        System.out.println("\n=== Partie RECHERCHE DICHOTOMIQUE ===");

        // Cas 1: Recherche d'un élément existant au milieu
        System.out.println("\nCas 1: Recherche élément au milieu");
        int[] searchArr1 = {2, 3, 4, 10, 40, 50, 60, 70};
        int target1 = 10;
        System.out.println("Tableau: ");
        printArray(searchArr1);
        int result1 = BinarySearch.binarySearch(searchArr1, target1);
        System.out.println("Recherche de " + target1 + ": " +
                (result1 == -1 ? "Non trouvé" : "Trouvé à l'index " + result1));

        // Cas 2: Recherche d'un élément non existant
        System.out.println("\nCas 2: Recherche élément non existant");
        int[] searchArr2 = {1, 5, 10, 15, 20};
        int target2 = 7;
        System.out.println("Tableau: ");
        printArray(searchArr2);
        int result2 = BinarySearch.binarySearch(searchArr2, target2);
        System.out.println("Recherche de " + target2 + ": " +
                (result2 == -1 ? "Non trouvé" : "Trouvé à l'index " + result2));

        // Cas 3: Recherche dans un tableau avec un seul élément
        System.out.println("\nCas 3: Recherche dans tableau à un élément");
        int[] searchArr3 = {100};
        int target3 = 100;
        System.out.println("Tableau: ");
        printArray(searchArr3);
        int result3 = BinarySearch.binarySearch(searchArr3, target3);
        System.out.println("Recherche de " + target3 + ": " +
                (result3 == -1 ? "Non trouvé" : "Trouvé à l'index " + result3));
    }

    // Méthode utilitaire pour afficher les tableaux
    private static void printArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}