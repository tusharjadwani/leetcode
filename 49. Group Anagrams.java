class Solution {

    private boolean isAnagrams(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int[] chars = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i) - 'a']++;
            chars[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0)
                return false;
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        Set<Integer> set = new HashSet<>();
        List lst = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            List<String> arr = new ArrayList<>();
            for (int j = i + 1; j < strs.length; j++) {
                if (!set.contains(j) && isAnagrams(strs[i], strs[j])) {
                    if (!set.contains(i))
                        arr.add(strs[i]);

                    arr.add(strs[j]);

                    set.add(i);
                    set.add(j);
                }
            }

            if (arr.size() > 0)
                lst.add(arr);
            else if (!set.contains(i)) {
                lst.add(List.of(strs[i]));
            }
        }
        return lst;
    }
}