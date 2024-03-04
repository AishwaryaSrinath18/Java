//Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left = 0, right = matrix[0].length-1;
        int top = 0, bottom = matrix.length-1;
        while (left <= right && top <= bottom){
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            } top++;
            if(left > right || top > bottom) break;
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            } right--;
            if(left > right || top > bottom) break;
            for(int i=right; i>=left; i--){
                result.add(matrix[bottom][i]);
            } bottom--;
            if(left > right || top > bottom) break;
            for(int i=bottom; i>=top; i--){
                result.add(matrix[i][left]);
            } left++;
            if(left > right || top > bottom) break;
        }
        return result;
    }
}
