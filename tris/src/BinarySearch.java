public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Vérifier si l'élément est au milieu
            if (arr[mid] == target) {
                return mid;
            }

            // Si l'élément est plus grand, ignorer la moitié gauche
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // Si l'élément est plus petit, ignorer la moitié droite
            else {
                right = mid - 1;
            }
        }

        // Élément non trouvé
        return -1;
    }

    public static void main(String[] args) {

    }
}
