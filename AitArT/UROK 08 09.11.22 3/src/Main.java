public class Main {
    public static void main(String[] args) {
        int a = 12;
        System.out.println("_______");
        // мы бы хотели повторить три раза
        int i = 0;
        while (i < 10) { // если условие истинно - выполняй код ниже
            System.out.println(a);
            i++;
            // сюда мы пишем то, что хотим повторить
        }
        int j = 1; // пять раз вывел в консоль "Hi"
        while (j < 6) {

            System.out.println("Hi " + j);
            j++;
        }
        int z = 10;
        while (z >= 0) {
            System.out.println("Z " + z);
            z--;
            if (z == 3) {
                System.out.println("Get Ready");
            }
            if (z == 0) {
                System.out.println("Boom");
            }

        }
    }
}
        /*
        синтаксический сахар
        a = a + 1  --> a += 1
        a = a + 2  --> a += 2
        a = a - 1  --> a -= 1
        a = a * 2  --> a *= 2
        a = a / 2  --> a /= 2
        b = b + "hehe" --> b +="hehe"
         */
