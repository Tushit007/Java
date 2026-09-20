
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Practice {

    public static char fncr(String s) {
        Map<Character, Integer> fmap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s.toCharArray()) {
            if (fmap.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';
    }

    public static void frequencyCounter(int[] arr) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> fmap = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            fmap.put(num, fmap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : fmap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }

    public static int[] findintersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : arr2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
