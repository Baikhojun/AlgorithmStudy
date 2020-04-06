import java.util.*;

public class Solution {
	public static void main(String[] args) {

		HashMap<String, Integer> hsm = new HashMap<>();
		
		// 숫자를 체크해서 있나 없나 비교를 하는건데
		boolean check = true;

		String[] phone_book = { "119", "97674223", "1195524421" };
		
		
		// 1개씩 다넣어서 체크하기
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
