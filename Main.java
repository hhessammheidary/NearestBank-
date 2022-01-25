import java.util.Locale;
import java.util.Scanner;

public class Main {
    static TrieTreeN trieNeighbourhood;
    static KDTreeBank kdTreeBank;
    public static void main(String[] args) {
        trieNeighbourhood = new TrieTreeN();
        kdTreeBank = new KDTreeBank();
        Scanner scanner = new Scanner(System.in);
        String command = "";
        String[] input;
        boolean flag =true;
        while (flag){
            switch (command){
                case "addN" :
                    input = scanner.nextLine().split(" ");
                    addN(Integer.parseInt(input[0]) , Integer.parseInt(input[1]) ,
                            Integer.parseInt(input[2]) , Integer.parseInt(input[3]) , input[4].toLowerCase());
                    break;
                case "addB" :
                    input = scanner.nextLine().split(" ");
                    addB(Integer.parseInt(input[0]) , Integer.parseInt(input[1]) , input[2].toLowerCase() , null );
                    break;
                case "addBr" :
                    input = scanner.nextLine().split(" ");
                    addBr(Integer.parseInt(input[0]) , Integer.parseInt(input[1]) , input[2].toLowerCase() , input[3].toLowerCase());
                    break;
                case "delBr" :
                    input = scanner.nextLine().split(" ");
                    delBr(Integer.parseInt(input[0]) , Integer.parseInt(input[1]));
                    break;
                case "listB" :
                    input = scanner.nextLine().split(" ");
                    listB(input[0].toLowerCase());
                    break;
                case "listBrs" :
                    input = scanner.nextLine().split(" ");
                    listBrs(input[0].toLowerCase());
                    break;
                case "nearB" :
                    input = scanner.nextLine().split(" ");
                    nearB(Integer.parseInt(input[0]) , Integer.parseInt(input[1]));
                    break;
                case "nearBr" :
                    input = scanner.nextLine().split(" ");
                    nearBr(Integer.parseInt(input[0]) , Integer.parseInt(input[1]) , input[2].toLowerCase());
                    break;
                case "availB" :
                    input = scanner.nextLine().split(" ");
                    availB(Integer.parseInt(input[0]) , Integer.parseInt(input[1]) , Integer.parseInt(input[2]));
                    break;
                case "end" :
                    flag = false;
                    break;
                default:
                    System.out.println("wrong command , try again");
            }
        }
    }
    public static void addN(int minX , int maxX , int minY , int maxY , String nName){
        Neighbourhood newNeighbourhood = new Neighbourhood(minX , maxX , minY , maxY , nName);
        trieNeighbourhood.insert(nName , newNeighbourhood);

    }

    public static void addB(int x , int y , String bName  , BankBrarnch[] branches){
        int[] cordin = {x , y};
        Bank newBank = new Bank(cordin , bName);
        kdTreeBank.insertNode(kdTreeBank.getRoot() , newBank);
    }

    public static void addBr(int x , int y , String bName , String bankBrName){

    }

    public static void delBr(int x , int y){
        if(true){
            System.out.println("wrong coordinates , try again");
        }
        else if(true){
            System.out.println("we cant delete bank , try again");
        }
        else {

        }
    }

    public static void listB(String nName){

    }

    public static void listBrs(String bName){

    }

    public static void nearB(int x , int y){

    }

    public static void nearBr(int x , int y , String bName){

    }

    public static void availB(int x , int y , int red){

    }
}
