public class Student {
    int id;
    private String name;
    MyDate birthday;
    private MyDate examDate;

    public Student(int id, String name, MyDate birthday){
        this(id,name, birthday, null);

    }
    public Student(int id, String name, MyDate birthday, MyDate examDate ){
        this.id=id;
        this.name=name;
        this.birthday=birthday;
        this.examDate=examDate;}

public String toString(){
        return id + " "+name+ " (" + birthday +") " +  examDate;
}
public MyDate getBirthday(){
        return birthday;
}
public void changeDayInbirthday(int dat){
        birthday.setDay(dat);
}
public void setExamDate(MyDate examDate){
        this.examDate=examDate;
}
/*public String examDayToString(String day){
        return day.equals(null)?examDate:"" ;
}*/

}
