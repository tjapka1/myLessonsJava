import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>>inter=new ArrayList<>();
        inter.add(List.of(1,2,3));
        inter.add(List.of(5,6,4));
        inter.add(List.of(7,8,9,10,12,11));
        inter.add(List.of(7,8,65, 10,12,11));

        List<Integer>res=merge(inter);
        System.out.println(inter);
        System.out.println(res);
        List<Integer>dubl=sortAbDubl(res);
        System.out.println(dubl);

    }
    public static List<Integer>merge(List<List<Integer>>inList){
        List<Integer>ouList=new ArrayList<>();
        List<Integer>t;
        for (List<Integer> list:inList){
            t=list;
            for (Integer n:t){
                    if (n !=null){
                        ouList.add(n);
                    }
                  }
        }
        Collections.sort(ouList);
        return ouList;
    }

    public static List<Integer> marge3(List<List<Integer>> listsOfNumbers) {
        List<Integer> resultList = new ArrayList<>();
        int totalSize = getResultSize(listsOfNumbers);
        int[] indexesOfLists = new int[listsOfNumbers.size()];
        int actualIndex;
        while (resultList.size() < totalSize) {
            Integer minValue = Integer.MAX_VALUE;
            int listWithMinValue = 0;
            int listNumber = 0;
            for (List<Integer> list : listsOfNumbers) {
                actualIndex = indexesOfLists[listNumber];
                if (actualIndex == list.size()) {
                    listNumber++;
                    continue;
                }
                Integer actualValue = list.get(actualIndex);
                if (actualValue < minValue) {
                    minValue = actualValue;
                    listWithMinValue = listNumber;
                }
                listNumber++;
            }
            actualIndex = indexesOfLists[listWithMinValue];
            indexesOfLists[listWithMinValue] = actualIndex + 1;
            resultList.add(minValue);
        }
        return resultList;
    }
    private static int getResultSize(List<List<Integer>> listsOfNumbers) {
        int totalSize = 0;
        for (List<Integer> list : listsOfNumbers) {
            totalSize += list.size();
        }
        return totalSize;
    }

    public static List<Integer> marge4(List<List<Integer>> listsOfNumbers) {
        int resultSize = getResultSize(listsOfNumbers);
        List<Integer> resultList = new ArrayList<>(resultSize);

        int[] indexesOfLists = new int[listsOfNumbers.size()];
        for (int i = 0; i < indexesOfLists.length ; i++) {
            indexesOfLists[i]=0;
        }

        while (resultList.size() < resultSize) {
            int actualListIndex
                    = getIndexOfListWithCurrentlyMinValue(listsOfNumbers,indexesOfLists);

            List<Integer> actualList = listsOfNumbers.get(actualListIndex);

            Integer actualElement = actualList.get(indexesOfLists[actualListIndex]++);

            resultList.add(actualElement);
        }
        return resultList;
    }

    private static int getIndexOfListWithCurrentlyMinValue(
            List<List<Integer>> listsOfNumbers,
            int[] indexesOfLists
    ){
        int minValue=Integer.MAX_VALUE;
        int listOfMinValue =0;
        for (int i = 0; i < indexesOfLists.length ; i++) {
            List<Integer> currentList=listsOfNumbers.get(i);
            if (indexesOfLists[i]< currentList.size()){
                int currentValue= currentList.get(indexesOfLists[i]);
                if(currentValue<minValue){
                    minValue=currentValue;
                    listOfMinValue=i;
                }
            }
        }
        return listOfMinValue;
    }

    public static List<Integer>sortAbDubl(List<Integer>inList){
        Set<Integer>ouSet=new HashSet<>(inList);
        List<Integer>ouList=new ArrayList<>(ouSet);
        Collections.sort(ouList);
        return ouList;
    }
}