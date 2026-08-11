class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>>map = new HashMap<>();
        for(String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String Key = new String(chars);
            map.computeIfAbsent(Key,k-> new ArrayList<>()).add(str);
        }
       return new ArrayList<>(map.values());
    }
}
