import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /*
       Дан лист из Person (fName, lName, age). Необходимо получить лист из
       строк вида (Иванов И., 45) для всех людей, младше заданного возраста.
       В рамках данной задачи считаем, что исходный list не содержит
       значения null. Необходимо реализовать тесты.
        */


        List<Person> people=new ArrayList<>();
        people.add(new Person("Иван", "Иванов", 30));
        people.add(new Person("Вова", "Мухин"));
        people.add(new Person("Илья", "Муровец", 23));
        people.add(new Person("Катя", "Муровец"));
        people.add(new Person("Вася", "Петров", 52));
        people.add(new Person("Света", "Мурнина", 43));
        people.add(new Person("Света", "Мурнина", -43));

        printAgeNull(people);
        printAgeMin(people, 30);
        printAgeMax(people,30);

    }

    public static List<Person> printAgeNull(List<Person> inputList){
        List<Person> outputList= new ArrayList<>();
        if (inputList == null)return outputList;
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i).getAge() <= 0){
                outputList.add(inputList.get(i));
            }
        }
        System.out.print("Пожалуйста задайте правильный возраст!!!   |   ");
        System.out.print("False    |   ");
        bubleSort(outputList);
        System.out.println(outputList);
        return outputList;
    }
    public static List<Person> printAgeMin(List<Person> inputList, int setAge){
        List<Person> outputList= new ArrayList<>();
        if (inputList == null || setAge<=0)return outputList;
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i).getAge()<=setAge && inputList.get(i).getAge() >0){
                outputList.add(inputList.get(i));
            }
       }
        bubleSort(outputList);
        System.out.print("Min | ");
        System.out.println(outputList);
        return outputList;
    }
    public static List<Person> printAgeMax(List<Person> inputList, int setAge){
        List<Person> outputList= new ArrayList<>();
        if (inputList == null || setAge<=0)return outputList;
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i).getAge()>setAge){
                outputList.add(inputList.get(i));
            }
        }
        bubleSort(outputList);
        System.out.print("Max | ");
        System.out.print(outputList);
        return outputList;
    }
    public static void bubleSort (List<Person> inputList){

        for (int i = 0; i < inputList.size()-1; i++) {
            for (int j = 0; j < inputList.size()-1; j++) {
                if (inputList.get(j).getAge()>inputList.get(j+1).getAge()){
                    Person temp = inputList.get(j);
                    inputList.set(j, inputList.get(j+1));
                    inputList.set(j+1, temp);
                }

            }
        }
    }
}