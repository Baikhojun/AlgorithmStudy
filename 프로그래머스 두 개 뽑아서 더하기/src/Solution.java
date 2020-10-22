import java.util.*;

class Solution {
	public int[] solution(int[] numbers) {

		HashSet<Integer> hs = new HashSet<Integer>();
		int len = numbers.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				hs.add(numbers[i] + numbers[j]);
			}
		}

		List<Integer> list = new ArrayList<Integer>(hs);
		Collections.sort(list);

		int[] answer = new int[list.size()];
		for (int z = 0; z < list.size(); z++) {
			answer[z] = list.get(z);
		}
		return answer;
	}
}