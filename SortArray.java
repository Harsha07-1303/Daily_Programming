public class SortArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i<5&&j<4){
            if(arr1[i]<arr2[j]){
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while(i<5){
            arr3[k++] = arr1[i++];
        }
        while(j<4){
            arr3[k++] = arr2[j++];
        }
        for(int num : arr3){
            System.out.print(num + " ");
        }
    }
}