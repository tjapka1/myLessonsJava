import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList <Integer> num =new ArrayList<>();
        num.add(5);
        num.add(4);
        System.out.println(num);
        System.out.println(num.size());

        getRndList(num, 25, 10, 1);
        System.out.println(num);
        System.out.println(num.size());                                                                //вот тут добавляю я ещё 23 числа, к двум существующем, первые 2 числа не изменились

        getRndList(num, 30, 100, 1);
        System.out.println(num);
        System.out.println(num.size());
        // тут я добовляю ещё 5 числа, но с 3 по 25 число тоже меняються

        getRndList(num, 50, 100, 1);
        System.out.println(num);
        System.out.println(num.size());
        // тут я добовляю ещё 20 числа, но с 3 по 30 число тоже меняються

        getRndList(num, 60, 100, -5);
        System.out.println(num);
        System.out.println(num.size());

        System.out.println("_____bubbleSort__________");
        bubbleSort(num);
        System.out.println(num);

        // тут я добовляю ещё 3 числа, но с 3 по 50 число тоже меняються
        // Кал сделать чтоб только добавляющие Числа генерировались
        // А старые оставались и не генерировались заново??????????

        /*
        System.out.println("_____checkList__________");
        System.out.println(checkList(num));



        System.out.println("____________");
        System.out.println(getRndList(5,10,0));
        System.out.println(getRndList(15, 10, -10));

*/
    }

    public static boolean checkList (List<Integer> list){
            if (list.size()<3) return false;
        for (int i = 2; i < list.size() ; i++) {
            if (list.get(i)== list.get(i-1)+list.get(i-2)){
                            return true;
            }
        }
        return false;
    }

    public static List<Integer> getRndList(int size, int max, int min){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(numRand(max, min));

        }
        //Collections.sort(list);
        bubbleSort(list);
        return list;
    }
    public static List<Integer> getRndList(List<Integer> list, int newSize, int max, int min){
        int count= newSize - list.size();
        for (int i = 0; i < count; i++) {
            list.add(numRand(max, min));
        }
       // Collections.sort(list);
        bubbleSort(list);
        return list;
    }
    public static int numRand(int max, int min){
        int rnd=(int) (min + Math.random() * ((long)max - min + 1));
        return rnd;
    }
    public static void bubbleSort(List<Integer>  inputList){
        int inputListSize=inputList.size()-1;
        for (int i = 0; i < inputListSize; i++) {
            for (int j = 0; j < inputListSize; j++) {
                if (inputList.get(j) > inputList.get(j+1)){
                    int temp = inputList.get(j);
                    inputList.set(j,inputList.get(j+1));
                    inputList.set(j+1, temp);
                }
            }
        }
        }



    /*
    public static void mergeSort(List<Integer> inputList){
        int inputLength=inputList.size();

        if (inputLength<2){return;}
        int midIndex=inputLength/2;

        ArrayList<Integer> leftHalft= new ArrayList<>();
        ArrayList<Integer> rightHalft= new ArrayList<>();


        for (int i = 0; i < midIndex; i++) {
          leftHalft.add(i, inputList.get(i));
          }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalft.add(i-midIndex, inputList.get(i));
        }
        mergeSort(leftHalft);
        mergeSort(rightHalft);
        merge(inputList, leftHalft, rightHalft);
        }

    private static void merge (List<Integer>inputList, List<Integer>leftList, List<Integer>rightList){
        int leftSize=leftList.size();
        int rightSize=rightList.size();

        int i=0,j=0,k=0;

        while (i<leftSize && j<rightSize){
            if (leftList.get(i)<= rightList.get(j)){
                inputList.set(k, leftList.get(i));
                i++;
                }
            else {
                inputList.set(k, rightList.get(k));
                j++;
            }
            k++;
        }
        while (i <leftSize){
            inputList.set(k, leftList.get(i));
            i++;
            k++;
        }
        while (j <rightSize){
            inputList.set(k, leftList.get(j));
            j++;
            k++;
        }

    }*/

    }



