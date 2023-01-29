import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main3Test {
    @Test
    @DisplayName("sd")
    public void getPersonAccount(){

        List<Accaunt> testList = new ArrayList<>();
        testList.add(new Accaunt("DE01", new Person("Jack Sparrow")));
        testList.add(new Accaunt("DE02", new Person("Black Widow")));
        testList.add(new Accaunt("DE03", new Person("Hulk")));
        testList.add(new Accaunt("DE03", new Person("Hulk")));
        testList.add(new Accaunt("DE04", new Person("Hans Zimmer")));


        HashMap<Person, String> testMap=new HashMap<>();
        testMap.put(new Person("Alex"), "DE33");
        testMap.put(new Person("Katja"), "DE34");
        testMap.put(new Person("Walja"), "DE34");
        testMap.put(new Person("Wova"), "DE35");

        HashMap<Person, String> actualResult = Main3.getPersonAccounts(testList);
        Assertions.assertEquals(actualResult, testMap);
    }
    @Test
    @DisplayName("sdfgh")
    public void ifExceptionTrowsTest(){
        boolean flag=false;
        List<Accaunt> testList = new ArrayList<>();
        testList.add(new Accaunt("DE01", new Person("Jack Sparrow")));
        testList.add(new Accaunt("DE02", new Person("Black Widow")));
        testList.add(new Accaunt("DE03", new Person("Hulk")));
        testList.add(new Accaunt("DE03", new Person("Hulk")));
        testList.add(new Accaunt("DE04", new Person("Hans Zimmer")));

        try {
            HashMap<Person, String> actualResult = Main3.getPersonAccounts(testList);
        }catch (MoschenikEsception e){
            flag=true;
        }
        Assertions.assertTrue(flag);
    }
}
