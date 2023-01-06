public class Main {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(10, 11, 2000);
        Student st1=new Student(1, "jack", d1);
        //MyDate d2=new MyDate(2,4,2003);
        Student st2=new Student(2, "Nick", new MyDate(2,4,2003));

        d1.setDay(14);

        st2.getBirthday().setDay(12);

        Student [] students= {st1, st2,
        new Student(3, "Olga", new MyDate(12,06,1955))
        };

        for (int i = 0; i <students.length ; i++) {

            System.out.println(students[i]);
        }
        System.out.println("--------------");
        students[0].getBirthday().setDay(1);
        System.out.println(st1);
        students[2].getBirthday().setMonth(4);
        System.out.println(students[2]);
        students[2].setExamDate(new MyDate(25,2,2002));
        System.out.println(students[2]);
    }
}