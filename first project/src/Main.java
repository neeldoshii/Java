import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        student s = new student();
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name :");
        s.setName(scan.nextLine());
        System.out.println("What's your Roll no :");
        s.setRoll(scan.nextInt());
        System.out.println("What's your percentage :");
        s.setPercentage(scan.nextInt());
        System.out.println("Your name is " + s.getName());
        System.out.println("Your roll no is " + s.getRoll());
        System.out.println("Your percentage is " + s.getPercentage());
        s.passfail();


    }
}