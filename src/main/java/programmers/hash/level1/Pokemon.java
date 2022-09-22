package programmers.hash.level1;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {

    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int getCnt = nums.length / 2;
        return getCnt <= set.size() ? getCnt : set.size();
    }
}
