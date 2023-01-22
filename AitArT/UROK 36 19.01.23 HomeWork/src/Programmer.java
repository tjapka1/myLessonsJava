public class Programmer extends Worker{


    public Programmer(String name) {
        super(name);

    }
/*
   1.      Допустим, у вас в программе есть класс Programmer. Кроме имени у
        нег есть поле String status; и этот статус может иметь значение «доступен» «занят» и «не доступен».
        Вам необходимо реализовать метод String doWork(String taskMsg) который в качестве результата,
        либо возвращает stringMsg большими буквами, либо ProgrammerBusyException,
        либо ProgrammerUnavailableNowException в зависимости от текущего состояния программера.
        В зависимости от результата, вызывающий main выводить результат работы или сообщение
        «Программист занят другой задачей» или «Программист не доступен».

 */



    @Override
    public String toString() {
        return "Programmer | " + super.toString();
    }

    @Override
    public void setAvailable() {

    }

    @Override
    public void setNotAvailable() {

    }

    @Override
    public void setBusy() {

    }
}
