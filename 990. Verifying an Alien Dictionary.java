class Solution {

    private int[] arr = new int[26];

    private int getNum(char c) {
        return arr[c-'a'];
    }

    public boolean isAlienSorted(String[] words, String order) {

        int i1 = 0;
        for (char c : order.toCharArray()) {
            arr[c-'a']=i1;
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