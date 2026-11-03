class Solution {
    public String frequencySort(String s) {
        HashMap <Character, Integer> hash = new HashMap<>(26, 1);
        int max = 0;
        for (int i = 0; i < s.length(); i++) hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i), 0) + 1);
        ArrayList <Character> list = new ArrayList<>(hash.keySet());
        list.sort((a, b) -> {
            if (hash.get(a) != hash.get(b)) return Integer.compare(hash.get(b), hash.get(a));
            return Integer.compare(a, b);
        });
        String ans = "";
        for (char ch : list) for (int i = 0; i < hash.get(ch); i++) ans += ch;
        return ans;
    }
}