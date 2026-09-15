class Solution {

    private Map<Character, Integer> map = new HashMap<>();

    private int getNum(char c) {
        return map.get(c);
    }

    public boolean isAlienSorted(String[] words, String order) {

        int i1 = 0;
        for (char c : order.toCharArray()) {
            map.put(c, i1);
            i1++;
        }

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i + 1].length() <= j)
                    return false;
                else if (getNum(words[i + 1].charAt(j)) != getNum(words[i].charAt(j)))
                    if (getNum(words[i + 1].charAt(j)) < getNum(words[i].charAt(j)))
                        return false;
                    else
                        break;
            }
        }
        return true;
    }
}