/* selection sort */

public class selection{

    public static void ssort(int[] arr){
        for(int i =0;i<arr.length-1;i++)
        {
            int index= i;
            for(int j = i+1; j < arr.length;j++)
            {
                if(arr[j]<arr[index])
                    index = j;
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        
        }
    }


    public static void main(String[] args){
        int arr[] = {3,62,35,2,45,320,5,17,32,90};
        System.out.println("Before Sorting");
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        ssort(arr);
        System.out.println("After Sorting");
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        
    }
}