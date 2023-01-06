import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(14);
        list.add(-32);
        list.add(45);
        list.add(16);
        list.add(17);
        list.add(23);
        list.add(-34);


        System.out.println(list);
        System.out.println("__________Max__________");
        System.out.println(findMaxValue(list));
        System.out.println("__________Min__________");
        System.out.println(findMinValue(list));

        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Vasya",  22));
        personList.add(new Person(  "Kolya",  45));
        personList.add(new Person(  "Masha", 22));
        personList.add(new Person(  "Sveta", 33));
        personList.add(new Person(  "Vasya", 22));
        //personList.add(new Person(null, 22));
        // personList.add(null);
        System.out.println("________findPersonByName________");
        System.out.println(findPersonByName(personList, "Vasya"));
        System.out.println("________howManyPersonsInList________");
        System.out.println(howManyPersonsInList(personList, new Person("Vasya", 22)));


    }
    public static int findMaxValue(List<Integer> list){

        int res =Integer.MIN_VALUE;
        for (Integer num:list){
            if (num!=null){
                if (num>res){
                    res=num;
                }
            }
        }
        return res;
    }
    public static int findMinValue(List<Integer> list){

        int res =Integer.MAX_VALUE;
        for (Integer num:list){
            if (num!=null){
                if (num<res){
                    res=num;
                }
            }
        }
        return res;
    }
   public static List<Person> findPersonByName(List<Person> list, String name) {
        List<Person> result = new ArrayList<>();
        for (Person p : list) {
            if (p != null && p.getName() != null && p.getName().equals(name)) {
                result.add(p);
            }
        }
        return result;
    }
    public static int howManyPersonsInList(List<Person> list, Person p){
        int result=0;
        for (int i = 0; i <list.size() ; i++) {
            if (p.equals(list.get(i))){
                result++;
            }
        }
        return result;
    }



}