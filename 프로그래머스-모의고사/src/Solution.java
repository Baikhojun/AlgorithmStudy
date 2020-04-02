import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int []std1= {1,2,3,4,5};  // �л�1 5��
		int []std2= {2,1,2,3,2,4,2,5}; // �л�2 8��
		int []std3= {3,3,1,1,2,2,4,4,5,5}; // �л�3 10��
		
		int scoreStd1=0;
		int scoreStd2=0;
		int scoreStd3=0;
		
		int [] answer = {1,2,3,4,5};
		
		int [] solution;
		
		//1 . �����̶� ������ �´� ���� ���ϱ� 
		for(int i=0; i< answer.length; i++)
		{
			if(answer[i]==std1[i]) scoreStd1++;
			if(answer[i]==std2[i%8]) scoreStd1++;
			if(answer[i]==std3[i%10]) scoreStd1++;
		}
		
		// 2. ���� ū�� ã�� 
		int maxNum = Math.max(scoreStd1, Math.max(scoreStd2,scoreStd3));
		
		
		// 3. ���� ����ū ���� �ߺ��ϼ��������� .. �̰� ������ ������ִ� ArrayList �� �ְ� ���ϱ�
		ArrayList <Integer> list = new ArrayList<>();
		
		// 4. ��������� list�� ���� ���� ������ ����ϱ� 
		if( maxNum==scoreStd1) list.add(1);
		if( maxNum==scoreStd1) list.add(2);
		if( maxNum==scoreStd1) list.add(3);
		
		solution =new int[list.size()];
		for(int j=0;j<list.size();j++)
		{
			solution[j]=list.get(j);
		}
		
		System.out.println("����");
		for( int num : solution)
		{
			System.out.println(num);
		}
		
		
	}
}
