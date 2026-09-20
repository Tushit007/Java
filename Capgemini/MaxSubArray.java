
class MaxSubArray {

    public static int maxsubArray(int arr[]) {
        int ms = arr[0];
        int cs = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cs = Math.max(arr[i], cs + arr[i]);
            ms = Math.max(ms, cs);
        }
        return ms;
    }

    public static void main(String args[]) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("The maximum subarray is: " + maxsubArray(arr));
    }
}
