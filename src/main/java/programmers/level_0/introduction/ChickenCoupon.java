package programmers.level_0.introduction;

public class ChickenCoupon {

    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;

        while (coupon >= 10) {
            answer += coupon / 10;
            coupon = coupon % 10 + coupon / 10;
        }

        return answer;
    }
}
