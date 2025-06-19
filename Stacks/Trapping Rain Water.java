class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        prefix[0]=height[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        suffix[n-1]=height[n-1];
        for(int j=n-2;j>=0;j--){
            suffix[j]=Math.max(suffix[j+1],height[j]);
        }
        int total=0;
        for(int k=0;k<n;k++){
            total+=Math.min(prefix[k],suffix[k])-height[k];
        }
        return total;
    }
}
