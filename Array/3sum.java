class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n=arr.length;
       if(n<3 || arr==null) return new ArrayList<>();
        HashSet<List<Integer>>l=new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            
            int left=i+1;
            int right=n-1;
            while(left<right){
                if(arr[i]+arr[left]+arr[right]<0){
                    left++;
                }
                else if(arr[i]+arr[left]+arr[right]>0){
                    right--;
                }
                else{
                    l.add(Arrays.asList(arr[i], arr[left],arr[right]));
                    left++;
                    right--;
                }
            }
           
        }
    return new ArrayList<>(l);
    }
}