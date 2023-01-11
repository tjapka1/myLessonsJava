import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
    /*
        Дан List строк. Написать метод, который возвращает строку,
         которая есть результат объединения всех строк исходного листа
          через пробел.
          Например: {“I”, “do”, “my”, ”homework”} -> “I do my homework”.
           Написать тесты.

2
Пусть дан список List объектов типа User{String fName, String lName, int age }.
Предположим, при чтение User-ов из базы данных случилась ошибка и у
всех пользователей из списка поменялись местами fName и lName.
Необходимо написать метод, который исправит данную ситуацию.
Написать тесты
     */


        List<String> strings=new ArrayList<>();
        strings.add("I");
        strings.add("do");
        strings.add(null);
        strings.add("homework");
        strings.add("  ");
        strings.add("work");

        System.out.println(strings);
        String finalString=mergeString(strings);
        System.out.println(finalString);

        List<User> users=new ArrayList<>();
        users.add(new User("Alex", "Muller", 33));
        users.add(new User("Wasja", "Durkov", 23));
        users.add(new User("Durkovf", "Walja", 23));
        System.out.println(users);
        chenchLsFsName(users, 3);
        System.out.println(users);

    }

    public static void chenchLsFsName(List<User>inputlist, int id){
        for (int i = 0; i < inputlist.size(); i++) {
           if (id==inputlist.get(i).getId()){
               String tempF = inputlist.get(i).getfName();
               inputlist.get(i).setfName(inputlist.get(i).getlName());
               inputlist.get(i).setlName(tempF);
           }
        }
    }


public static String mergeString(List<String>inputList){
        String outputSting="";
        for (int i =0 ; i<inputList.size();i++) {

                if (i == inputList.size() - 1) {
                    outputSting += inputList.get(i);
                }
                else if (inputList.get(i) == null || inputList.get(i).equals("") ) {
                    outputSting += "";
                }
                else if ( inputList.get(i).equals(" ") ||inputList.get(i).equals("  ") ||
                        inputList.get(i).equals("   ") || inputList.get(i).equals("    ")) {
                    outputSting += "";
                }
                else if (inputList.get(i) != " ") {
                    outputSting += inputList.get(i) + " ";
                }
            }

        return outputSting;
    }
}
