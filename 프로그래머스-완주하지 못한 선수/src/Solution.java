import java.util.HashMap;

class Solution {
    //public String solution(String[] participant, String[] completion) {
      	public static void main(String [] args) {
		HashMap <String,Integer> hm = new HashMap<>();
        int result=0;
        int result1=0;
        
        String [] participant = {"leo", "kiki", "eden"};
        String [] completion = {"eden", "kiki"};
        
        
        for(String prp : participant)
        {
            if(hm.get(prp)!=null)
            {
                result = hm.get(prp)+1;
                hm.put(prp , result);
            }
            else
            {
                hm.put(prp,1);
            }
            
        }

        for(String cmp : completion)
        {
        	result1 = hm.get(cmp)-1;
        	hm.put(cmp, result1);
        }
        
        String answer = "";
        for(String key : hm.keySet())
        {
        	if(hm.get(key)==1)
        	{
        		answer=key;
        	}
        
        }
        
        System.out.println(answer);
        
        
        return;
        
        
        
        
    }
}