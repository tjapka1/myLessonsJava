/*
Дана Map<String, String>, если в ней есть ключ "a" и "b", то нужно создать
новый ключ "ab" с суммой значений от ключей a и b.

Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":"There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
 */

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,  String> hashMap=new HashMap<>();
            hashMap.put("a", "fd");
            hashMap.put("b", "cf");

            contactKeys(hashMap);
        System.out.println(hashMap);


    }
    public static void contactKeys(HashMap<String, String> inMap){
               try {
                if (inMap.containsKey("a")&& inMap.containsKey("b")){
                    inMap.put("ab", inMap.get("a")+inMap.get("b"));
                }
               }catch (NullPointerException e){

               }

    }
}