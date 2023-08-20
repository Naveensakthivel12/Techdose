class Solution {
    public void rotate(int[][] matrix) {
        int [][]temp=new int[matrix[0].length][matrix[0].length];
        int n=matrix[0].length;
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix[0].length;j++){
                temp[j][n-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix[0].length;j++){
               matrix[i][j]=temp[i][j];
            }
         
        }
    }
}
