package programmers.hash.level1;

import java.util.HashSet;

public class Phoneketmon {

    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int n = nums.length / 2;
        int size = set.size();

        return n > size ? size : n;
    }
}
