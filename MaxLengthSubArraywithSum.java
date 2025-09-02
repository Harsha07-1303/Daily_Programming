class MaxLengthSubArraywithSum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11,13,17,19};
        int k=13;
        int maxLength = 0;
        int currentLength = 0;
        int l=0,r=0,sum=0;;
        while(r<arr.length){
            if(sum<=k){
                sum+=arr[r];
                currentLength++;
                r++;
            }
            while(sum>k){
                sum-=arr[l];
                currentLength--;
                l++;
            }
            maxLength = Math.max(maxLength,currentLength);
        }
        System.out.println(maxLength);
    }
}