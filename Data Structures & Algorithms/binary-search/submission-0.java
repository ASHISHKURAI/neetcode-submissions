class Solution {
    public int search(int[] arr, int key) {

        int n=arr.length;

        int start =0, end =n-1, mid;

        while (start<=end)
        {
            // finding mid
            mid = (start+end)/2;

            if (arr[mid]==key)
            return mid;

            else if (arr[mid]<key)
            start =mid+1;

            else 
            end=mid-1;
        }

        return -1;


        
    }
}
