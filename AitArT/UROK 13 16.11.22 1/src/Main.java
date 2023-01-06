public class Main {
        public static void main(String[] args) {

                // String - строка

                int a=12;

                String str1 = "Hello";
                String str2 = "world";

                System.out.println(str1 +" " + str2);

                String str3 = 1 + "1" + 2 + (2+3);
                System.out.println(str3);

                String name1= "Denis";
                String name2= "Fridrich";
                String name3= "Vasya";
                //greatings(name1);
                //greatings(name2);
                //greatings(name3);
                // type    name
                String [] names = {name1, name2, name3, "Varvara", "Petrovich"};

                greetArray(names);
                calculator(23,35, "+-");

                int x=5;
                int y=5;
                boolean r= x==y; // true or false
                System.out.println(r);

                String str4= "VaSya";
                String str5= new String("vasya");
                boolean r2= str4 == str5;
                System.out.println(r2);

                boolean r3 = str4.equals(str5);
                System.out.println("r3 " + r3);
                System.out.println(str5.equals(str4));

                // UpperCase LowerCase
                String str6 = str4.toLowerCase();
                System.out.println(str6);
                String str7 = str6.toUpperCase();
                System.out.println(str7);





        }
        public static void calculator(double a, double b, String operation){
                switch (operation){
                        case "+":
                                System.out.println("Result is "+ (a+b));
                                break;
                        case "-":
                                System.out.println("Result is "+ (a-b));
                                break;
                        case "*":
                                System.out.println("Result is "+ (a*b));
                                break;
                        case "/":
                                System.out.println("Result is "+ (a/b));
                                break;
                        case "+-":
                                System.out.println("Result is " + (a-b)+(a+b));
                                break;
                        default:
                                System.out.println("Error: 123");
                }
        }

        public static void greetArray(String [] names21){
                for(int i=0; i<names21.length; i++){
                        System.out.println("Hello dear " + names21[i]);
                }
        }

        public static void greatings(String name){
                System.out.println("Hello dear " + name);
        }

}