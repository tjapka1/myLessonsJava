import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main3 {
    /*

    Дан лист Account {String iban, Person owner}.
    Необходимо вернуть Map<Person,String>, где ключ,
    это Person а его значение это строка, изображение сччета
    В рамках данной задачи считаем, что у Person-a есть
    только один счет, если несколько -> MoshennikException
     */
    public static void main(String[] args) {

        List<Accaunt> list = new ArrayList<>();
        list.add(new Accaunt("DE01", new Person("Jack Sparrow")));
        list.add(new Accaunt("DE02", new Person("Black Widow")));
        list.add(new Accaunt("DE03", new Person("Hulk")));
        list.add(new Accaunt("DE03", new Person("Hulk")));
        list.add(new Accaunt("DE04", new Person("Hans Zimmer")));

        System.out.println(getPersonAccounts(list));
    }

    public static HashMap<Person, String> getPersonAccounts(List<Accaunt> list)throws MoschenikEsception{
        HashMap<Person, String> res = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if(res.containsKey(list.get(i).getOwner())){
                throw new MoschenikEsception("Мошенники!!!");
            }else{
                res.put(list.get(i).getOwner(),list.get(i).getIban());
            }
        }
        return res;
    }



}