public class Main {
    public static void main(String[] args) {
/*
        1
        Реализовать класс Student с полями имя, количество пропущенных
        занятий. Создать класс Group, который «управляет» массивом
        студентов. В классе Group реализовать методы:  добавить студента в
        группу, получить список студентов в виде нового объекта Group.

        2*
       Добавить в класс Student поле-массив с оценками (double[] rate).
       Реализовать в программе возможность получить имя самого успевающего
       (по среднему балу) студента.
 */
        Group gr1 = new Group();

        gr1.addStudent(new Student("Alex", 15, 5));
        gr1.addStudent(new Student("dfg", 0, 4));
        gr1.addStudent(new Student("dfg", 2, 4));
        gr1.getStudents(1).addNote(5);
        gr1.getStudents(1).addNote(5);
        gr1.getStudents(0).addNote(5);
        System.out.println(gr1);
        System.out.println("---");
        Group gr2 = gr1.getStudentList();

        System.out.println(gr2);
        System.out.println("____________");
        gr1.getStudents(gr1.searchStudent("aLex")).addNote(1);
        System.out.println(gr1);

        System.out.println(gr1.getStudentByName2("dfg"));

       System.out.println(gr1.searchStudent("dfg"));

    }

}