
class MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();
        int[] nums = {1, 2, 4, 5, 6};
        int missing = solution.missingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }
}
