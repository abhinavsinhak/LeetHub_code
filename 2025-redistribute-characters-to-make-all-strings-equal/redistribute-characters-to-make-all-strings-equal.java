class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> hash = new HashMap<>();
        int lenst= words[0].length();
        for(String c : words){
           
            for(int i=0;i<c.length();i++){
                hash.put(c.charAt(i),hash.getOrDefault(c.charAt(i),0)+1);
            }
        }
        int wordCount = words.length;
        for (int count : hash.values()) {
            if (count % wordCount != 0) {
                return false;
            }
        }

        return true;
    }
}