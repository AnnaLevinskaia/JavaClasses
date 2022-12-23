package Recap8;

import java.util.HashMap;
import java.util.Map;

public class InterviewQ {
    // Create a method that returns a map of characters and their count in a String
    public static void main(String[] args) {
        String str="bdljabbdbsddsadsdjhsadsjdsj";
        System.out.println(getCount(str));

    }
    public static Map<Character, Integer> getCount(String st){
        char[]  charArr=st.toCharArray(); //convert to CharArray
        Map<Character, Integer> map=new HashMap<>();
        for (char c:charArr) {
            if(map.get(c)==null){  //null-checking whether it is already present in the map
                map.put(c,1);
            } else{
                int count=map.get(c); //we want to get privious characters
                count=count+1;
                map.put(c,count);
            }


        }
        return map;
    }
}
