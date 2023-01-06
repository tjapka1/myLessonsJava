public class SelectionSort {
    public static void main(String[] args) {
//SelectionSort

        System.out.println("Hello world!");
        int [] arr1 = new int[5];
        fillArray(arr1, 1,2);
        printArray(arr1);
        int minIndInArr= indexMinRange(arr1,4);
        System.out.println("Min " + minIndInArr);
        System.out.println("_________________");
        selectionSort1(arr1);
        printArray(arr1);
        int search =binarySearch(arr1, 2);
        System.out.println(search);

    }
    public static void printArray(int [] arr){
        for (int i=0; i< arr.length; i++){
            System.out.println("Zell in " + i + " Num " + arr[i]);
        }
        System.out.println("_________________");
    }
    public static void fillArray(int [] arr, int min, int max){
        for (int i=0; i<arr.length; i++){
            arr[i]=(int) (min+Math.random()*(max+1-min));
        }
    }
    public static int indexMinRange(int [] arr, int startIndex){
        int index=startIndex;
        for(int i=startIndex; i<arr.length; i++ ){
            if (arr[index]>arr[i]){
                index=i;
            }

        }
        return index;
    }
    public static void selectionSort1(int[]  arr){
        for(int i=0 ; i<arr.length-1; i++){
            int index = indexMinRange(arr, i+1);
            if(arr[i]>arr[index]){
                int t=arr[i];
                arr[i]=arr[index];
                arr[index]=t;
            }
        }
    }
    public static int binarySearch(int [] arr, int value){
        int left=0;
        int right = arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==value){
                return mid;
            }
            if(arr[mid]>value){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}