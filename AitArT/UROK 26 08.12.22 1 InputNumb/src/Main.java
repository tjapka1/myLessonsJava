public class Main {
    public static void main(String[] args) {

        /*
        Пользователь с клавиатуры вводит целые числа.

Максимально можно ввести 10 чисел.
0 - прекращаем ввод чисел.
Спрашиваем:
0 - завершаем программу совсем
1 - сумма всех чисел
2 - средднее значение
любое другое число - проверяем есть ли оно среди введенных.
         */
/*        NumberProcessing processing =new NumberProcessing();
             Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число  от 1 до 10 ");
        boolean checkWhile = true;

       while (checkWhile) {
            int userDig = sc.nextInt();
            if (userDig >= 1 && userDig <= 10) {
            processing.add(userDig);

                 }
            if (userDig <= 0) {
                System.out.println("_____________");
                System.out.println("You have enter 0, is not good ");
                checkWhile = false;
                System.out.println("Array "+processing);
                System.out.println("Array Sum "+processing.sum());
                System.out.println("Array AVG "+processing.avg());
                System.out.println("Array Find "+processing.find(3));


            }
            if (userDig > 10) {
                System.out.println("_____________");
                System.out.println("You have enter more as 9, is not good ");
                checkWhile = false;
                System.out.println("Array "+processing);
                System.out.println("Array Sum "+processing.sum());
                System.out.println("Array AVG "+processing.avg());
                System.out.println("Array Find "+processing.find(3));}

        }
*/

        InputNumbers inputNumbers=new InputNumbers();
        NumberProcessing processing=inputNumbers.getNumbers();
        App app=new App(processing);
        app.userAction();


    }

}