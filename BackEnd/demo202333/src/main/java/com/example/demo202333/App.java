package com.example.demo202333;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class App {

    private  DBDriver driver;
    private RepositoryService repository;


    public static void main(String[] args) {

    }

    public static String findDlinString(List<String> list){
        String res= list.stream().max(comparing(String::length)).toString();
        return res;
    }

    public Integer findMax(Integer i1, Integer i2){
        if (i1==null || i2==null){
            throw new IllegalArgumentException("Should be not null");}
        return Math.max(i1, i2);
    }

    Integer findMax(List<Integer> list){
        return list.stream()
                .mapToInt(i->i.intValue())
                .max()
                .getAsInt();
    }
    boolean isPalindrome(String str){
        if (str==null)return true;
        //StringBuilder sb = new StringBuilder(str);
        ///String string = sb.append("qwer").append(true).insert(2, "erty").toString();
        return new StringBuilder(str).reverse().toString().equals(str);
    }
    public String getLongestString(){
        List<String> all = repository.findAll();
        return all.stream()
                .max(comparing(String::length))
                .orElse(null);
    }

    public void saveString(String str){
        repository.save(str);


    }

    public List<String>  getAllString(){
        return  repository.findAll();
    }



}
