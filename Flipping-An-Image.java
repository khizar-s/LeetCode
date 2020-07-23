class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int j = 0;
            int l = A[i].length - 1;
            while (j < l) {
                int tmp = A[i][l];
                A[i][l--] = A[i][j];
                A[i][j++] = tmp;
            }
            
            for (int k = 0; k < A[i].length; k++) {
                A[i][k] = A[i][k] == 0 ? 1 : 0;
            }
        }
        
        return A;
    }
}