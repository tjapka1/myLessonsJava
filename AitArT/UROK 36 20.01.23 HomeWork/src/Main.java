public class Main {
    public static void main(String[] args) {

        User user1=new User("John", "Lennon", 40,"Lennon@mailcom" );






        UserList userList=new UserList();
        userList.add(user1);
        Tools.print(userList);

    }
}