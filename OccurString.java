package ASSIGN;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class OccurString {
	public static void main(String[] args) {
        String name="JACKANDJILL";
        char[] arr = name.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(char val:arr){          
            map.put(val,map.containsKey(val)?map.get(val)+1:1);         
        }

        for (Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()>1){
            Character key = entry.getKey();
            Object value = entry.getValue();

            System.out.println(key + ":"+value);
            }
            }
    }
}
