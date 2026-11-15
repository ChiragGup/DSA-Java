
public class duplicate {

    public static int getDublicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 2, 4, 5};
        int result = getDublicate(arr);
        System.out.println(result);
    }
}
