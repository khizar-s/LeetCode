class Solution {
    public int totalFruit(int[] tree) {
        int last = -1;
        int second_last = -1;
        int last_count = 0;
        int current = 0;
        int max = 0;
        
        for (Integer fruit : tree) {
            if (fruit == last || fruit == second_last) {
                current += 1;
            } else {
                current = last_count + 1;
            }
            
            if (fruit == last) {
                last_count += 1;
            } else {
                last_count = 1;
                second_last = last;
                last = fruit;
            }
            
            max = Math.max(current, max);
        }
        
        return max;
    }
}