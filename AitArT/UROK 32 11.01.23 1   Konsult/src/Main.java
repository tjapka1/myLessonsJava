import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


    }
    public static ArrayList<Person> listNamesToListPerson(ArrayList<String> inputName){
        ArrayList<Person> outputName=new ArrayList<>();
        for (String name:inputName){
            if (name.length()<4) {
                outputName.add(new Person(name));
            }
        }
        return outputName;
    }
}