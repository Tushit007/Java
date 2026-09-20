
class FindFactors {

    public static void main(String[] args) {
        int number = 54; // Example number to find factors for
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
