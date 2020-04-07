import java.util.*;

public class Solution {
	public static void main(String[] args) {
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };

		/*
		 * 수학적인 통계로 계산해보면 상의 3개 , 하의 3개 , 안경 3개 총 입을수 있는 옷의 개수는 아무것도 안입기 빼기
		 * (3+1)*(3+1)*(3+1)-1 이다.
		 * 
		 */
		HashMap<String, Integer> hm = new HashMap<>();
		int count = 0;
		int solution = 1;

		for (int i = 0; i < clothes.length; i++) {
			if (hm.get(clothes[i][1]) == null) {
				hm.put(clothes[i][1], 1);
			} else {
				count = hm.get(clothes[i][1]) + 1;
				hm.put(clothes[i][1], count);

			}
		}


		for (int num : hm.values()) {
			solution *= (num + 1);
		}

		System.out.println(solution - 1);

		for (String key : hm.keySet()) {
			System.out.println(key + "  = " + hm.get(key));
		}
	}
}
