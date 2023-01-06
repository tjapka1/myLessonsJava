public class Group {

    private int capacity=3;
    private Student [] students =new Student[capacity];
    private int size=0;

    public Group() {

         }

    public Student getStudents(int index) {
        if (index<size && index>=0){
            return students[index];
        }
        return null;
    }


    public void addStudent(Student student){
        if (size< students.length){
            students[size++]=student;
        }
            }
   public Group getStudentList(){
        Group resList=new Group();
       for (int i = 0; i < size; i++) {
        if (checkStudent(students[i])){
            resList.addStudent(students[i]);
        }

       }
       return resList;
            }
   private boolean checkStudent(Student student){

        boolean result=student.getMissedClasses()>3;
        return result ;
   }
   public void addNote( Student student, double notes){
        student.addNote(notes);
                           }

   public  Student getBestStudent(){
        Student best= students[0];
      for (int i = 0; i <size ; i++) {
          if (best.averageGrade()<students[i].averageGrade()){best=students[i];}
      }
    return best;
    }

    public int searchStudent(String searchStudent){
        int index=0;
        if (searchStudent!=null){
        for (int i = 0; i < size; i++) {
           if (this.students[i].getName().toLowerCase().equals(searchStudent)){
               index=i;
                }

        }}
        return index;
    }

    public Group getStudentByName2(String name){
        Group res=new Group();
        if (name!=null && !name.equals("")){
            for (int i = 0; i < size; i++) {
                if (students[i] !=null)
                if (name.equals(students[i].getName())){
                    res.addStudent(students[i]);
                }

            }
        }

        return res;
    }
    public Student getStudent(String searchStudent){
        Student res=null;
        if (searchStudent!=null){
            for (int i = 0; i < size; i++) {
                if (this.students[i].getName().toLowerCase().equals(searchStudent)){
                    res=students[i];
                }

            }}
        return res;
    }

    public String toString(){
        String res="";
        for (int i = 0; i < size; i++) {
           res+= students[i] + "\n";
           }
        return res;
    }
}
