public class Main {
    public static void main(String[] args) {
        //   arrayMan();
        //   arrayMan2();
        arrayMan3();
    }

    public static void arrayMan() {
        int a = 5;
        int count = 0;
        int index = 0;
        for (int i = 0; i <= a; i++) {
            count++;
        }
        int[] mas = new int[count];
        for (int i = 0; i <= a; i++) {
            mas[index] = i;
            index++;
        }
        for (int i = 0; i < mas.length; i += 1) {
            System.out.println("Arr" + " [" + i + "] " + " = " + mas[i]);
        }
        System.out.println("Arr lenght " + mas.length);
    }

    public static void arrayMan2() {
        int a = 4;
        int count = 0;
        int index = 0;

        for (int i = 0; i <= a; i++) {
            count++;
        }
        int[] man = new int[count];
        for (int i = 0; i <= a; i++) {
            man[index] = i;
            index++;
        }

        for (int i = 0; i < man.length; i++) {
            System.out.println("Arr" + " [" + i + "] " + " = " + man[i]);
        }

    }

    public static void arrayMan3() {
        int a = 56;
        int count = 0;
        int index = 0;
        for (int i = 0; i <= a; i++) {
            count++;
        }
        int[] man = new int[count];
        for (int i = 0; i <= a; i++) {//тут не получаеться сделать i+=5
            man[index] = i;
            index++;
        }
        for (int i = 1; i < man.length; i++) {
            System.out.println("Arr1" + " [" + i + "] " + " = " + man[i]);
        }
        System.out.println("Arr1 lenght " + man.length);
        System.out.println("__________________");

        int bx = 9;
        int count2 = 0;
        int index2 = 0;
        for (int i2 = 1; i2 <= bx; i2++) {
            count2++;
        }
        int[] man2 = new int[count2];

        for (int i2 =0 ; i2 < bx; i2++) {
            man2[index2] = i2;
            index2++;
        }

       for (int i = 0; i < man2.length; i++) {
            System.out.println("Arr2" + " [" + i + "] " + " = " + man2[i]);
        }
       //А ТУТ НЕТ
        System.out.println("Arr2 lenght " + man2.length);
        System.out.println("__________________");


        double b = man[21];
        double c = man[3];
        double d = man[5];
        double e = man[30];
        double f = man2[3];
        double g = man2[4];
                                                                                                                                //И ТУТ НИЧЕГО НЕ ПАШИТ

        double res1 = b / c + e * d;
        System.out.println("Res1 " + res1);
        double res2 = f*g;
        System.out.println("Res1 " + res2);

        double result = res1*res2;
        System.out.println("My Result = " + result);

    }
}