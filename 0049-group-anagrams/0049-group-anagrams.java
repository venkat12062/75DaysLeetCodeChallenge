class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mapp=new HashMap<>();
        for(String s:strs){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(!mapp.containsKey(key)){
                mapp.put(key,new ArrayList<>());
            }
            mapp.get(key).add(s);
        }
        return new ArrayList<>(mapp.values());
    }
}