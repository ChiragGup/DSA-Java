public class secondLarrgest {
    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 8, 8, 9, 9};

        int value = arr[0];
        int value_1 = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value) {
                value = arr[i];
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > value_1 && arr[j] != value) {
                value_1 = arr[j];
            }
        }

        System.out.println("answser" + " "+ value_1);
    }
}