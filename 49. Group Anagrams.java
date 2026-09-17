class Solution {

    private String getAnagramKey(String s1) {

        int[] chars = new int[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length(); i++)
            chars[s1.charAt(i) - 'a'] += 1;

        for (int i = 0; i < chars.length; i++)
            sb.append(chars[i]).append("#");

        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String st = getAnagramKey(strs[i]);
            if (map.get(st) == null)
                map.put(st, new ArrayList<>());

            map.get(st).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}