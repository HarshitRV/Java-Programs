package src.ds.Binary_Search;

class Binary_Search_Algo {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target  = 48;
        int start = 0;
        int end = arr.length-1;
        // int ans = binarySearch(arr, target, start, end);

        System.out.println("Answer is : "+binarySearch(arr, target, start, end));

    }

    // recursive algo , needs work
    static int binarySearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        int mid = start+(end-start)/2;
        System.out.println("Function called: "+"start: "+start+" end: "+end+" mid: "+mid);
        if (arr[mid] == target){
            System.out.println("start: "+start+" end: "+end);
            System.out.println(mid);
            int ans = mid;
            System.out.println(mid+" "+ans);
            return mid; // why its not getting returned ?
        }else if(arr[mid] < target){
            start++;
            System.out.println("After start++ = start: "+start+" end: "+end+" mid: "+mid);
            binarySearch(arr, target, start, end);
        }else{
            end--;
            System.out.println("After end-- = start: "+start+" end: "+end+" mid: "+mid);
            binarySearch(arr, target, start, end);
        }

        return -1; // why this is getting returned
    }
}