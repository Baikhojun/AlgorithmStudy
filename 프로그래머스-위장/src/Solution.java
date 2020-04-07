import java.util.*;

public class Solution {
	public static void main(String[] args) {
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };

		/*
		 * �������� ���� ����غ��� ���� 3�� , ���� 3�� , �Ȱ� 3�� �� ������ �ִ� ���� ������ �ƹ��͵� ���Ա� ����
		 * (3+1)*(3+1)*(3+1)-1 �̴�.
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
