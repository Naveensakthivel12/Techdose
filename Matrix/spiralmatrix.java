class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>l=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        int left=0;
        int right=col-1;
        int top=0;
        int bottom=row-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                l.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                l.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                l.add(matrix[bottom][i]);
            }
            }
            bottom--;
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                l.add(matrix[i][left]);
            }
            }
            left++;
        }
        return l;
    }
}
