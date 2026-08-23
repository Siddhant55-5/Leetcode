class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(int i = 0;i<strs.length;i++){
            String str = strs[i];
            char[] a = str.toCharArray();
            Arrays.sort(a);

            String key = new String(a);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}