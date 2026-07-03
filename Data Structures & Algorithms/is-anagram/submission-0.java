class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for(char l : s.toCharArray()){
             map.put(l, map.getOrDefault(l,0)+1);
          
        }

        for(char z : t.toCharArray()){
           if(!map.containsKey(z) || map.get(z)==0) return false;
           map.put(z, map.getOrDefault(z,0)-1);
        }

        return true;
    }
}
