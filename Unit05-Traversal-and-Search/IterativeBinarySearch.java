public class IterativeBinarySearch {
    public static int BinarySearch(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length -1;
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid]< target)
            {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {10,2,3,1,9};
        int target = 3;
        int result = BinarySearch(arr, target);
        if(result == -1)
        {
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Element found at index: " + result);
        }
    }
}
