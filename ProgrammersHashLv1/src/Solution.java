import java.util.HashMap;

public class Solution {
  
	public static void main(String[] args) {
		
		String [] participant = {"a","b","c","d"};
		String [] completion = {"a","b","c"} ;
		int value = 0;
		String result ="";
		HashMap <String,Integer> hm = new HashMap<String,Integer>();
		
		for(String msg : participant)
		{
			if(hm.get(msg)==null)
			{
				hm.put(msg,1);
			}
			else
			{
				value = hm.get(msg)+1;
				hm.put(msg,value);
			}
		}
		
		for (String msg2 : completion)
		{
			value = hm.get(msg2)-1;
			hm.put(msg2,value);
		}
		
		for ( String key : hm.keySet())
		{
			if(hm.get(key)==1)
			{
				result = key;
			}
		}
		System.out.println(hm.keySet());
		System.out.println(result);	
		System.out.println("bye");
	}
}
