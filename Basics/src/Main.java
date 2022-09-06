import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner a = new Scanner(System.in);
        int count =2;
        ArrayList<String> username =new ArrayList<String>();
//        String[] username = new String[];
        ArrayList<Integer> roll = new ArrayList<Integer>();
        //int roll[] = new int[3];
        ArrayList<Integer> percentage = new ArrayList<Integer>();
//        int percentage[] = new int[3];
        for (int i = 0; i<2; i++){

            username.add(a.nextLine());
            roll.add(a.nextInt());
            percentage.add(a.nextInt());


            System.out.println(username.get(i) + " " + roll + " " + percentage);

        }

        }




}

