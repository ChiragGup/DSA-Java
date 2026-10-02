public class arraySorted {
    public static void main(String[] args) {

        int[] arr = {2, 5, 4, 7, 8, 9};

        int i = 1;
        boolean flagData = false;

        while (i < arr.length - 1) {

            if (arr[i - 1] < arr[i] && arr[i + 1] > arr[i]) {
                flagData = true;
            } else {
                flagData = false;
                break;
            }

            i = i + 2;
        }

        if (flagData) {
            System.out.println("sorted");
        } else {
            System.out.println("Not sorted");
        }
    }
}