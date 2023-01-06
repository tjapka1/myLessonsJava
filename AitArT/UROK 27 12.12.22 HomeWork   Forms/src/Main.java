/*
Alexander geier         dj Tjapka
 */

public class Main {
    public static void main(String[] args) {
        Forms square1= new Square(8);
        Forms rectangle1=new Rectangle(8,2);
        Forms circle1= new Circle(5, 1);
        Forms triengle=new Triengle(4,6, 1);
        Forms rectangle2=new Rectangle(20, 50);
        Forms circle=new Circle(12.5, 2);


        Forms[] forms = {square1, rectangle1, circle, circle1, triengle, rectangle2, new Triengle(13, 14, 20, 2)};


        for (int i = 0; i < forms.length; i++) {
            System.out.println( i + " | "+forms[i]);

        }
        System.out.println("________________");

        System.out.println(forms[4].getRes());
        System.out.println(forms[4]);
        System.out.println("________________");
        Forms circl1 =new Circle(2,1);
        System.out.println(circl1);
        Forms circl= new Circle(5, 2);
        System.out.println(circl);
        System.out.println("________________");
        System.out.println(forms[forms.length-1]);

    }
}