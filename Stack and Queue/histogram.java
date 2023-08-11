class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int n = heights.length;
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        
        for (int i = 0; i < heights.length; i++) {
            if (s.isEmpty()) {
                s.push(i);
                left[i] = 0;
            } else {
                while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                    s.pop();
                }
                left[i] = s.isEmpty() ? 0 : s.peek() + 1;
                s.push(i);
            }
        }
        
        while (!s.isEmpty()) {
            s.pop();
        }
        
        for (int i = n - 1; i >= 0; i--) {
            if (s.isEmpty()) {
                s.push(i);
                right[i] = n - 1;
            } else {
                while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                    s.pop();
                }
                right[i] = s.isEmpty() ? n - 1 : s.peek() - 1;
                s.push(i);
            }
        }
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, heights[i] * (right[i] - left[i] + 1));
        }
        
        return max;
    }
}
