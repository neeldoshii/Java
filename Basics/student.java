import java.util.Scanner;

public class student {

        public String name ;
        int roll = 10;
        int marks;
        int grade;
        int percentage;
        boolean pass;

        }
        class test extends student{
            public static void main(String[] args) {
                System.out.println(student.name);
            }
        }

        class marks extends student{
            public void getDetails(){
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
            public void grade(){
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
            public void showData(){
                System.out.println("Time to show all the data now :D ");
                System.out.println("YOur Name is " + name + " and your roll no is " + roll + "and your percentage is " + percentage);
                System.out.println("Data Function Ends ------------------------------------------------------------");
            }
        }


        class results extends data{
            public static void main(String[] args) {
                System.out.println("Results Declared !!!!!!!");
  
                marks s1 = new marks();
                s1.getDetails();
                s1.grade();
                s1.showData();
                System.out.println("Result Dekh liya abh F");


            }
        }
        





