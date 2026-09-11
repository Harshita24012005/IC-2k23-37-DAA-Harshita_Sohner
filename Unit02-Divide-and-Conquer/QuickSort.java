public class QuickSort {
    public static void quicksort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pivotIdx = partition(arr, low, high);
            quicksort(arr, low, pivotIdx - 1);
            quicksort(arr, pivotIdx + 1, high);
        }
    }
    private static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i= low-1;
        for(int j= low; j<high; j++)
        {
            if(arr[j]<= pivot)
            {
                i++;
                int temp = arr[i];
                arr[j]= arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void main(String[] args)
    {
        int[] arr = {2,6,1,7,3};
        QuickSort ms = new QuickSort();
        ms.quicksort(arr, 0, arr.length - 1);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
