import java.util.Scanner;

public class student {

        String name;
        int roll;
        int marks;
        int grade;
        int percentage;
        boolean pass;

        }

        class marks extends student{
            void getDetails(){
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter your Name :");
                name = scan.nextLine();
                System.out.println("Enter your Roll No:");
                roll = scan.nextInt();
                System.out.println("Enter your Percentage");
                percentage = scan.nextInt();
                System.out.println("Tooked all the data :D");
                System.out.println("Get Detail Function Ends ------------------------------------------------------------");

            }

        }

        class gradefind extends marks{
            void grade(){
                if (percentage<=100 && percentage >=90){
                    System.out.println("Your Grade is A++_ ... PS your are still Noob");
                } else if (percentage>=90 && percentage <=70) {
                    System.out.println("Your Grade is A+_ ... PS your are still Good");
                } else if (percentage>=70 && percentage <=50) {
                    System.out.println("Your Grade is A_ ... PS your are still Super Good");
                } else if (percentage>=50 && percentage <=36) {
                    System.out.println("Your Grade is A_ ... PS your are still Super Duper Good");
                }
                else{
                    System.out.println("Your Grade is S+++++_ ... PS This proves how good your coding skills is :D");
                }

                System.out.println("Grade Find Function Ends ------------------------------------------------------------");
            }
        }

        class data extends gradefind{
            void showData(){
                System.out.println("Time to show all the data now :D ");
                System.out.println("YOur Name is " + name + " and your roll no is " + roll + "and your percentage is " + percentage);
                System.out.println("Data Function Ends ------------------------------------------------------------");
            }
        }


        class results extends data{
            public static void main(String[] args) {
                System.out.println("Results Declared !!!!!!!");
  
                marks m1 = new marks();
                m1.getDetails();
                gradefind gf1 = new gradefind();
                gf1.grade();
                data d1 = new data();
                d1.showData();
                System.out.println("Result Dekh liya abh F");


            }
        }
        





