import java.util.*;

public class Solution {
	public static void main(String[] args) {

		HashMap<String, Integer> hsm = new HashMap<>();
		
		// ���ڸ� üũ�ؼ� �ֳ� ���� �񱳸� �ϴ°ǵ�
		boolean check = true;

		String[] phone_book = { "119", "97674223", "1195524421" };
		
		
		// 1���� �ٳ־ üũ�ϱ�
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 1; j < phone_book[i].length(); j++) {
				hsm.put(phone_book[i].substring(0, j), 1);
			}
		}

		for (String pb : phone_book) {
			if (hsm.containsKey(pb))
				check = false;
		}

		System.out.println(check);

	}
}
