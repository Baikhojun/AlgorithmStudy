import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
       	int[] answer = {};
		int[] num1 = { 1, 2, 3, 4, 5 };
		int[] num2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] num3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        
		HashMap<Integer, Integer> hsm = new HashMap<Integer, Integer>();
		hsm.put(1, 0);
		hsm.put(2, 0);
		hsm.put(3, 0);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == num1[i % num1.length]) {
				hsm.put(1, hsm.get(1) + 1);
			}
			if (answers[i] == num2[i % num2.length]) {
				hsm.put(2, hsm.get(2) + 1);
			}
			if (answers[i] == num3[i % num3.length]) {
				hsm.put(3, hsm.get(3) + 1);
			}
		}

		int maxNum = Math.max(Math.max(hsm.get(1), hsm.get(2)),hsm.get(3));
		
		
		for (int j = 1; j <= 3; j++) {
			if(maxNum==hsm.get(j))
			{
				list.add(j);
			}
		}
		answer = new int[list.size()];
        
		for(int z=0; z<list.size() ;z++)
		{
			answer[z]=list.get(z);
		}
    
        return answer;
    }
}