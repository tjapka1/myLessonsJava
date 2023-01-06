package deAit.controler;

import deAit.model.ArrT;
import deAit.model.Person;

public class Main {
    public static void main(String[] args) {


        Person p1 = new Person(36,"sdfg","cfb",3,false);

        //p1.displeyPerson();

        Person p2 = new Person(223355,"Vasilii","Petrov", 25, true);
        //p2.displeyPerson();
        p2.setAge(12);
        //p2.displeyPerson();


        int pensionAge = 100-p2.getAge();

        Person p3 = new Person(443322,"Eva","Polskay",33,false);
        //p3.displeyPerson();

        Person p4 = new Person(66555, "Petrovich");
        //p4.displeyPerson();
        p4.setAge(45);
        //p4.displeyPerson();
        Person tjapka=new Person(752,"tjapka", "gas", 34,true);
        //tjapka.displeyPerson();
        tjapka.setAge(38);
        //tjapka.displeyPerson();
        Person[] arreyPersons= new Person[6];
        arreyPersons[0]=p1;
        arreyPersons[1]=p2;
        arreyPersons[2]=p3;
        arreyPersons[3]=p4;
        arreyPersons[4]=tjapka;
        arreyPersons[5]=new Person(654,"All",  "cvg",26, true);
        ArrT.printArr(arreyPersons);

}}