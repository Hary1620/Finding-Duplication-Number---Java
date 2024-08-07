import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Main {
    public static List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();


        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 2, 3, 4, 5, 5, 5, 5};
        List<Integer> result = findDuplicates(nums);

        System.out.println(result);
    }
}