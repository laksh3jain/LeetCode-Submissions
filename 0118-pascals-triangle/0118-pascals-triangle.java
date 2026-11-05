class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> rows = new ArrayList<>();
        for (int nrow = 0; nrow < numRows; nrow++) {
            ArrayList <Integer> row = new ArrayList<>();
            long num = 1;
            row.add((int) num);
            for (int i = 1; i <= nrow; i++) {
                num *= nrow - i + 1;
                num /= i;
                row.add((int) num);
            }
            rows.add(row);
        }
        return rows;
    }
}