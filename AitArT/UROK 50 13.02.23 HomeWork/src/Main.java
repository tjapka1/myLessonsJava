import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList=List.of(
                new Person("ge","Al", "sdv@sf.de", "254",
                        new Address("45711", "Datteln", "Bahnhofstr", "45")),
                new Person("re","Ol", "sdv@sf.de", "254",
                        new Address("45711", "Datteln", "Jahnstr", "35"))
        );

        System.out.println(funkSwitch(personList, 4));

    }
    public static List<String> funkSwitch(List<Person>inList, int choise){
        List<String>ouList =new ArrayList<>();
        switch (choise){
            case 1:
                ouList=selectionPersonData(inList, inPerson -> inPerson.getfName()+" "+inPerson.getlName());
                break;
            case 2:
                ouList=selectionPersonData(inList, inPerson -> inPerson.getEmail());
                break;
            case 3:
                ouList=selectionPersonData(inList, inPerson -> inPerson.getPhone());
                break;
            case 4:
                ouList=selectionPersonData(inList, inPerson -> inPerson.getAddress().getPostcode()+" " +
                                                                                        inPerson.getAddress().getCity()+" "+
                                                                                        inPerson.getAddress().getStreet()+" "+
                                                                                        inPerson.getAddress().getHouse());
                break;

        }
        return ouList;
    }
    public  static List <String> selectionPersonData(List<Person>inList, SelectionPersonData funk){
        List<String>ouList =new ArrayList<>();
        for (Person person:inList){
        ouList.add(funk.funk(person));
        }
        return ouList;
    }


}