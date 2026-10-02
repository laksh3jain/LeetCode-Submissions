class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap <Character, Character> code = new HashMap<>();
        HashSet <Character> t_test = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);
            if (code.containsKey(s_char)) {
                if (code.get(s_char) != t_char) {
                    return false;
                }
            }
            else {
                if (t_test.contains(t_char)) {
                    return false;
                }
            }
            code.put(s_char, t_char);
            t_test.add(t_char);
        }
        return true;
    }
}