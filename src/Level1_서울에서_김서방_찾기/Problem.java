package Level1_서울에서_김서방_찾기;

class Solution {
    public String solution(String[] seoul) {
    	int count = 0;
    	for(int i=0; i<seoul.length; i++) {
    		if(seoul[i].equals("Kim"))
    			count = i;
    	}
        return "김서방은 " + count + "에 있다";
    }
}

public class Problem {

	public static void main(String[] args) {
		
	}
}
