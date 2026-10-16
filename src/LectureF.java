import java.util.Scanner;

public class LectureF {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int code = 9586;
        for (int at = 3; at != 0; at--){
            System.out.print("Pls enter PIN: ");
            int pin = s.nextInt();
            if (pin == code){
                System.out.println("Access granted!");
            break;
            } else{
                System.out.println("Wrong PIN");
                if (at > 1)
                    System.out.println("Attempts left: " + (at - 1));
                else
                    System.out.println("Card blocked");

            }

        }

        int i = 5;
        int num = 55;
        while(i > 0){
            System.out.print("Enter your guess: ");
            int g = s.nextInt();
            if (g == num){
                System.out.println("Correct!");
                break;
            }
            else if (g > num){
                System.out.println("Too high!");
                i--;
            }
            else if (g < num){
                System.out.println("Too Low");
                i--;
            }
            if (i == 0)
                System.out.println("Game over! \n The secret number was " + num);


        }

        int a = 10;
        int b = 1;
        int pos = 0;
        int neg = 0;
        int zeros = 0;
        int even = 0;
        int odd = 0;
        while (a > 0){
            System.out.print("Enter number " + b + ": ");
            double stat = s.nextDouble();
            if (stat % 2 == 0)
                even++;
            else
                odd++;
            if (stat > 0)
                pos++;
            else if (stat < 0)
                neg++;
            else
                zeros++;
            a--;
            b++;
            }
            System.out.println("\n===== STATISTICS =====\n");
            System.out.println("Positive numbers: " + pos);
            System.out.println("Negative numbers: " + neg);
            System.out.println("Zeros: " + zeros);
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);



        }

    }


