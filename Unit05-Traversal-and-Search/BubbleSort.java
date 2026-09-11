public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for(int i=n-1; i >= 0; i--)
        {
            for(int j=0; j <= i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array after sorting...");
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] arr = {13,2,43,22,5};
        System.out.println("Array before sorting...");
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        BubbleSort sorter = new BubbleSort();
        sorter.bubbleSort(arr);
    }

}
