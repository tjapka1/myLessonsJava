package de.ait.controller;

import de.ait.Tools.ArrayTools;
import de.ait.Tools.StringTools;

public class main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        int[] array = new int[10];
        System.out.println("Fill Array");
        ArrayTools.fillArray(array, 0, 10);
        ArrayTools.printArray(array);
//        System.out.println("Selection");
//        ArrayTools.selectionSort1(array);
//        ArrayTools.printArray(array);
//        ArrayTools.binarySearch(array, 5);
//        System.out.println("Bubble");
//        ArrayTools.bubble(array);
//        ArrayTools.printArray(array);
//        System.out.println("Bubble1");
//        ArrayTools.bubbleSort1(array);
//        ArrayTools.printArray(array);

        System.out.println("Min Dig " + ArrayTools.minDigArray(array) + " Index is " + ArrayTools.minIndDigArray(array));

        System.out.println("Max Dig " + ArrayTools.maxDigArray(array) + " Index is " + ArrayTools.maxIndDigArray(array));
        int search = 5;
        System.out.println("Bin Index find Dig " + search + " in Zelle " + ArrayTools.binarySearch(array, search));
        System.out.println("Easy Index find Dig " + search + " in Zelle " + ArrayTools.search(array, search));
        ArrayTools.selectionSort1(array);
        ArrayTools.printArray(array);
        System.out.println("Min Dig " + ArrayTools.minDigArray(array) + " Index is " + ArrayTools.minIndDigArray(array));

        System.out.println("Max Dig " + ArrayTools.maxDigArray(array) + " Index is " + ArrayTools.maxIndDigArray(array));
String a1 ="tjapka";
String a2= StringTools.uperWord(a1);
        System.out.println(a1+" "+a2+" "+StringTools.subInUpper(a2, 3,5)+ " " +
                StringTools.lowerWord(a2).substring(2 ,5 ));
    }
}


