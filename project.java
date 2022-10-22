import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = (int)(Math.random()*100);
        int userNumber =0;
        do {
            System.out.println("Guess the Number : ");
            userNumber = sc.nextInt();
            if (userNumber == Num) {
                System.out.println("WOW You got it Right...\n congratualtions"); 
                break;
            }
            else if (userNumber>Num){
                System.out.println("Guess Again smaller number: ");
            }
       
            else{
                System.out.println("oops... please guess larger number...");
            }
            }while (userNumber>=0);
                System.out.print("The number was : ");
                System.out.println(Num);
            }
        
    }
