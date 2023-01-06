public class People {
    Person[] persons;
    private int size;

    public People(int capacity) {
        persons = new Person[capacity];
        size = 0;
    }

    public void add(Person person){
        if (size < persons.length) {
            persons[size++] = person;
        }
    }
    public People selectPersonolderThan(int age){
        People res = new People(size);
        for (int i = 0; i < size; i++) {
            if (persons[i].getAge()>age){
                res.add(persons[i]);
            }
        }
        return res;
    }



    @Override
    public String toString() {
    String res="";
        for (int i = 0; i < size; i++) {
            res+=persons[i]+"\n";
        }
        return res;
    }
}
