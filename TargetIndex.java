
public class TargetIndex {

    public static String returnIndex(int[] arr, int target) {

        String data = "";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                data += i + " ";
            }
        }

        return data.isEmpty() ? "Not Found" : data;
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 2, 7, 2};
        int target = 2;

        String result = returnIndex(arr, target);

        System.out.println(result);
    }
}
