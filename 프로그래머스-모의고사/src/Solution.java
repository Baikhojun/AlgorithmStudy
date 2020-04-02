import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int []std1= {1,2,3,4,5};  // 학생1 5개
		int []std2= {2,1,2,3,2,4,2,5}; // 학생2 8개
		int []std3= {3,3,1,1,2,2,4,4,5,5}; // 학생3 10개
		
		int scoreStd1=0;
		int scoreStd2=0;
		int scoreStd3=0;
		
		int [] answer = {1,2,3,4,5};
		
		int [] solution;
		
		//1 . 정답이랑 각각의 맞는 개수 비교하기 
		for(int i=0; i< answer.length; i++)
		{
			if(answer[i]==std1[i]) scoreStd1++;
			if(answer[i]==std2[i%8]) scoreStd1++;
			if(answer[i]==std3[i%10]) scoreStd1++;
		}
		
		// 2. 가장 큰수 찾기 
		int maxNum = Math.max(scoreStd1, Math.max(scoreStd2,scoreStd3));
		
		
		// 3. 만약 가잔큰 수가 중복일수도있으니 .. 이걸 순서를 기억해주는 ArrayList 에 넣고 비교하기
		ArrayList <Integer> list = new ArrayList<>();
		
		// 4. 위순서대로 list에 들어가서 값이 있으면 출력하기 
		if( maxNum==scoreStd1) list.add(1);
		if( maxNum==scoreStd1) list.add(2);
		if( maxNum==scoreStd1) list.add(3);
		
		solution =new int[list.size()];
		for(int j=0;j<list.size();j++)
		{
			solution[j]=list.get(j);
		}
		
		System.out.println("정답");
		for( int num : solution)
		{
			System.out.println(num);
		}
		
		
	}
}
