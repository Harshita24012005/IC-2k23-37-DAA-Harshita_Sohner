public class InsertionSort {
    public static void selectionSort(int nums[])
    {
        int n = nums.length;
        for(int i=1; i<n; i++)
        {
            int key = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j]> key)
            {
                if(nums[j] > key)
                {
                    nums[j+1] = nums[j];
                }
                j--;
            }
            nums[j+1] = key;
        }
    }
    public static void main(String[] args)
    {
        int nums[] = {4,3,2,1,0,12,3,9,5,4,3,6,8,7};
        System.out.println("Array before sorting: ");
        for(int i=0; i < nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        selectionSort(nums);
        System.out.println("Array after sorting: ");
        for(int i=0; i < nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

}
