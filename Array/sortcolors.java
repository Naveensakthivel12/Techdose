class Solution {
    public void sortColors(int[] arr) {
      int i, j, temp;
      int n=arr.length;
        boolean swap;
        for (i = 0; i < n - 1; i++) {
            swap = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                      
                  
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
  
            if (swap == false)
                break;
        }
    }
}