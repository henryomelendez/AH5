import java.util.HashMap;
import java.util.Map;

class Solution {
    public static char mostFrequentChar(String s) {
      Map<Character, Integer> map = new HashMap<>();
      char[] c = s.toCharArray();
      for(int i = 0; i < c.length; i++){
          map.put(c[i], map.getOrDefault(c[i], 0) +1);
      }
      char b = mostchars(map);
      return b;
    }

    private static char mostchars(Map<Character,Integer> map){
        int max = 0;
        char a = 'a';
        for (Map.Entry<Character, Integer> i : map.entrySet()){

            if(max <= i.getValue()){
                max = i.getValue();
                a = i.getKey();
            }
        }
       return a;
    }
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
        System.out.println(Solution.mostFrequentChar("david")); // -> 'd'
        System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
        System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'
    }

  }
