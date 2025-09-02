class MaxPointsinCards{
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,1};
        int k=4;
        int n=arr.length-1;
        int lsum=0,rsum=0,max=0;
        for(int i=0;i<k;i++){
            lsum+=arr[i];
            max=Math.max(max,lsum);
        }
        for(int i=k-1;i>=0;i--){
            lsum-=arr[i];
            rsum+=arr[n--];
            max=Math.max(max,lsum+rsum);
        }
        System.out.println(max);
    }
}