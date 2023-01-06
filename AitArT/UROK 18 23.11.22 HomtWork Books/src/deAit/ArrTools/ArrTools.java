package deAit.ArrTools;

import deAit.Modes.Book;

public class ArrTools {
public static void printArray(Book[] arr){
    for (int i = 0; i < arr.length-1; i++) {
        System.out.println("Books Index is b" + i);
        arr[i].displayBooks();
        System.out.println("__________");
         }
}
}
