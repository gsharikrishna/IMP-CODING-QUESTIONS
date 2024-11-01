class Solution {
    public String makeFancyString(String s) {
         StringBuilder res = new StringBuilder();
        res.append(s.charAt(0));  

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                res.append(s.charAt(i));
            } else {
                int j = i;
                char c = s.charAt(i);
                res.append(s.charAt(j));
                while (j < s.length() && s.charAt(j) == c) {
                    j++;
                }
                i = j - 1;  
            }
        }
        return res.toString();
    }
}