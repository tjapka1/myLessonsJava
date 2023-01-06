/*
Задача 2. (тренируем switch - case)
Вы гуляете со своим животным и оно проголодалось. У вас с собой есть 99 долларов.
Вы хотите его накормить и видите рядом автомат с кормом для 4 разных животных (кот, собака, мышь, хрюшка) а
также универсальный корм для других животных.
Стоимость кормов (за 1 упаковку):
1) для кота - 14 долларов
2) для собаки - 23 доллара
3) для мыши - 6 долларов
4) для хрюшки - 132 доллара
default) универсальный корм - 20 долларов

Задача - при выборе типа животного, рассчитать сколько упаковок корма Вы сможете купить на 99 долларов и сколько денег у
Вас останется после покупки.
Примечание: вывести в консоль в виде текста:
- тип выбранного животного,
- стоимость корма для него за 1 упаковку,
- количество купленных упаковок,
- оставшуюся сумму денег.

Если кто-то хочет усложнить эту задачу, то попробуйте решить её со стоимостью корма для кота 14.35 $ (т.е дробным, а не целым числом)
Удачи!😉
*/

public class Main {

    public static void main(String[] args) {

    double budgets = 99;
    System.out.println("I have " + budgets);

    anim(1);

    }

    static int anim(int eatany) {
        double budgets = 99;
        double cats = 14;
        double dogs = 23;
        double mouss = 6;
        double pigs = 132;
        double alls = 20;
        double vol = 6;
        switch (eatany) {
            case 1://cat
                double mcat =cats;
                System.out.println("it is for cat ");
                System.out.println("price ist " + cats + " dollar");
                System.out.println("You by "  + vol + " Packet");
                double Fullpc = mcat*vol;
                System.out.println("its Price for All  " + Fullpc);
                double batgc =  budgets - Fullpc;
                System.out.println("rest " + batgc);
                break;
            case 2://dog
                double mdog = dogs;
                System.out.println("it is for dog ");
                System.out.println("price ist " + dogs + " dollar");
                System.out.println("You by "  + vol + " " + "Packet");
                double Fullpd = mdog*vol;
                System.out.println("its Price for All  " + Fullpd);
                double batgd =  budgets - Fullpd;
                System.out.println("rest " + batgd);
                break;
            case 3: //mous
                double mmous = mouss;
                System.out.println("it is for mous ");
                System.out.println("price ist " + mouss + " dollar");
                System.out.println("You by "  + vol + " Packet");
                double Fullpm = mmous*vol;
                System.out.println("its Price for All  " + Fullpm + " dollar");
                double batgm =  budgets - Fullpm;
                System.out.println("rest " + batgm);
                break;
            case 4://pig
                double mpig = pigs;
                System.out.println("it is for pig ");
                System.out.println("price ist " + pigs + " dollar");
                System.out.println("You by "  + vol + " Packet");
                double Fullps = mpig*vol;
                System.out.println("its Price for All  " + Fullps + " dollar");
                double batgs =  budgets - Fullps;
                System.out.println("rest " + batgs);
                break;
            default:
                double malls = alls;
                System.out.println("error 6525665 man");
                System.out.println("You perets its not of the List ");
                System.out.println("buy Eat Universel for all for" + " " + alls + " dollar");
                System.out.println("You by "  + vol + " " + "Packet");
                double Fullpa = alls*vol;
                System.out.println("its Price for All  " + Fullpa);
                double batga =  budgets - Fullpa;
                System.out.println("rest " + batga);
                break;

        }
        return 0;
    }
}

