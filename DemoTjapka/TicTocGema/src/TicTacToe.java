import java.util.*;

public class TicTacToe {
static ArrayList<Integer> playerPosition= new ArrayList<Integer>();
    static ArrayList<Integer> cpuPosition= new ArrayList<Integer>();
    public static void main(String[] args) {



        char[][] gameBord ={{' ', '|', ' ','|', ' '},
                                          {'-', '+', '-','+', '-'},
                                          {' ', '|', ' ','|', ' '},
                                          {'-', '+', ' ','-', '+'},
                                          {' ', '|', ' ','|', ' '},};
        printGameBord(gameBord);


        while (true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your placement (1-9)");
            int playerPos = sc.nextInt();
            while (playerPosition.contains(playerPos) || cpuPosition.contains(playerPosition)){
                System.out.println("Position takee! Enter a correct Position");
                playerPos=sc.nextInt();}
            System.out.println(playerPos);
            placePiece(gameBord, playerPos, "player");
            String result=checkWinner();
            if (result.length()>0) {
                System.out.println(result);
                break;}

            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            while (playerPosition.contains(cpuPos) || cpuPosition.contains(cpuPos)){
                System.out.println("Position takee! Enter a correct Position");
                cpuPos = rand.nextInt(9) + 1;}
            placePiece(gameBord, cpuPos, "CPU");
            printGameBord(gameBord);

            result=checkWinner();
            if (result.length()>0) {
                System.out.println(result);
                break;
            }
        }
    }
    public static void printGameBord(char[][] gameBord){
        for (char [] row: gameBord) {
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void placePiece(char[][] gameBord, int pos, String user){
        char symbol =' ';
        if (user.equals("player")){symbol = 'X';playerPosition.add(pos);}
        else if (user.equals("CPU")){symbol='O';cpuPosition.add(pos);}



        switch (pos){
            case 7:
                gameBord[0][0]=symbol;
                break;
            case 8:
                gameBord[0][2]=symbol;
                break;
            case 9:
                gameBord[0][4]=symbol;
                break;
            case 4:
                gameBord[2][0]=symbol;
                break;
            case 5:
                gameBord[2][2]=symbol;
                break;
            case 6:
                gameBord[2][4]=symbol;
                break;
            case 1:
                gameBord[4][0]=symbol;
                break;
            case 2:
                gameBord[4][2]=symbol;
                break;
            case 3:
                gameBord[4][4]=symbol;
                break;
            default:
                break;

        }
    }
    public static String checkWinner(){

        List topRow= Arrays.asList(1,2,3);
        List midRow= Arrays.asList(4,5,6);
        List botRow= Arrays.asList(7,8,9);
        List leftCol= Arrays.asList(1,4,7);
        List midCol= Arrays.asList(2,5,8);
        List rightCol= Arrays.asList(3,6,9);
        List cross1= Arrays.asList(1,5,9);
        List cross2= Arrays.asList(3,5,7);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l: winning){
            if (playerPosition.containsAll(l)){
                return "Gratulation you won!!!!!";
            }
            else if (cpuPosition.containsAll(l)) {
                return "CPU Wins!!! Sorry my Frind!!!";
            } else if (playerPosition.size()+cpuPosition.size()==9) {
                return "Cat!!!!";
            }
        }
        return "";
    }

}