import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComparatorSelector {
    ProductCompararator[] compararators;
    public ComparatorSelector(ProductCompararator[] productCompararators) {
        this.compararators = productCompararators;
    }
    public ProductCompararator select(List<Product>inputList){
        System.out.println("Введите номмер сортировки");
        for (int i = 0; i < compararators.length; i++) {
            System.out.println(i+". " + compararators[i].name());
        }
        userInputSelect(inputList);
        return null;
    }
    private void userInputSelect(List<Product>inputList){
        Scanner userIn =new Scanner(System.in);
        byte userInput=userIn.nextByte();
        checkUserInput(inputList,  userInput);
    }

    private void checkUserInput(List<Product>inputList, byte userInput){
        boolean checkInput=true;
        byte count =5;
        if (compararators.length-1 <userInput){
            System.out.println("Не Правильный ВВод!!!");
           checkInput=false;
            System.out.println(count);
            select(inputList);
        }
        while (checkInput){
            for (int i = 0; i < compararators.length; i++) {
                if (i ==userInput){
                    selectSort(inputList, userInput);
                    break;
                }
                else if(userInput == -1){
                    System.out.println("Вы вышли");
                    break;
                }
               /* if (count==5){
                    System.out.println("EndMan");
                    break;
                }*/
            }

        break;
        }
    }
    private List<Product> selectSort(List<Product>inputList, byte comparatorNum){
        List<Product> outputList=new ArrayList<>();
        if (compararators!=null){
            System.out.println("--------- сортируем " + compararators[comparatorNum].name() + " ---------------");
            inputList.sort(compararators[comparatorNum]);
        }
        else {
            System.out.println("--------- сортируем по умолчанию ---------------");
            Collections.sort(inputList, compararators[3]);
        }
        for (int i = 0; i <inputList.size() ; i++) {
            outputList.add(inputList.get(i));
        }
        Tools.print(outputList);
        return outputList;
    }
}
