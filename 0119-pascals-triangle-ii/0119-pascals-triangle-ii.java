class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList <Integer> list = new ArrayList<>();
        long num = 1;
        list.add((int) num);
        for (int i = 1; i <= rowIndex; i++) {
            num *= rowIndex - i + 1;
            num /= i;
            list.add((int) num);
        }
        return list;
    }
}