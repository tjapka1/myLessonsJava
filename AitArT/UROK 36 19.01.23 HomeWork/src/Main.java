public class Main {
    public static void main(String[] args) {

        /*
        1.      Допустим, у вас в программе есть класс Programmer. Кроме имени у
        нег есть поле String status; и этот статус может иметь значение «доступен» «занят» и «не доступен».
        Вам необходимо реализовать метод String doWork(String taskMsg) который в качестве результата,
        либо возвращает stringMsg большими буквами, либо ProgrammerBusyException,
        либо ProgrammerUnavailableNowException в зависимости от текущего состояния программера.
        В зависимости от результата, вызывающий main выводить результат работы или сообщение
        «Программист занят другой задачей» или «Программист не доступен».


    2.      * Давайте дополним задачу 1. Допустим, у вас в программе есть TeamLead, который  тоже может быть «доступен» и
    «не доступен», что определяется текущим значением поля status. Еще у него есть поле List<Programmer> team, которое
     содержит список. Реализовать метод String doTask(String taskMsg), который пытается «поручить» задачу первому
     доступному программисту ( вызвав у него doWork(String taskMsg) и вернут результат, либо возвращает
     TeamLeadUnavailableNowException либо AllProgrammersAreBusyNowException. В зависимости от результата, вызывающий
     main выводить результат работы или сообщение «Нам не хватает программистов!» или «Почему TeamLead не на месте».
    Подсказки на следующей странице:

         */
        WorkerList workerList=new WorkerList();
        workerList.add(new Programmer("Ахмед", "доступен"));
        workerList.add(new Programmer("Ваня", "не доступен"));
        workerList.add(new Programmer("Вася", "занят"));
        workerList.add(new TeamLead("Вика", "доступен"));
        workerList.add(new TeamLead("Андрей", "не доступен"));
        workerList.add(new TeamLead("Коля", "занят"));

        Tools.print(workerList);


    }
}