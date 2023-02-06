public class Main {
    public static void main(String[] args) {

    int[] n1={3,6,7,9};
    int[] n2={2, 8, 9, 9, 12};

    int[]res= marge(n1, n2);
        print(res);


          }

    private static int[] marge(int[] arr1, int[] arr2) {
        if (arr1==null|| arr1.length==0)return arr2;
        if (arr2==null|| arr2.length==0)return arr1;

        int[ ] ouArr=new int[arr1.length+arr2.length];

        int i1=0, i2=0, i3=0;

        for (int i = 0; i1 < arr1.length && i2 <arr2.length; i++) {
        ouArr[i] = (arr1[i1]<arr2[i2]?arr1[i1++]:arr2[i2++]);
        }
        while (i1<arr1.length){
            ouArr[i3++]=arr1[i1++];
        }
        while (i2<arr2.length){
            ouArr[i3++]=arr2[i2++];
        }
        return  ouArr;
    }
    public static void print(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}