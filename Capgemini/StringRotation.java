
class StringRotation {

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
            return false;
        }
        String s3 = s1 + s2;
        return s3.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println(isRotation(s1, s2));
    }
}
