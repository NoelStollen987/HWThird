import java.util.Scanner;

public class LectureE {
    public static void main(String[] args){
        int sv = 5;
        int f = 1;
        while (sv > 1){
            f *= sv;
            sv--;
        }
        System.out.print(f);

        int i = 2;
        do {
            System.out.print(i );
            System.out.print(" * 2 = ");
            i *= 2;
            System.out.print(i + "; ");

        } while(i != 1024);

//        for(int i = 1; i < 100; i *= 2)
//            System.out.print(i);
//
//
//       --------------------------------
//
//        int i = 1;
//        while (i <= 1000){
//            System.out.print(i + "; ");
//            i *= 10;
//
//        }
//
//        for(int a = 2; a <= 2048; a *= 4)
//            System.out.print(a + "; ");
//
//
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n = s.nextInt();
//        int i = 1;
//        while (i <= n){
//            System.out.print(i + "; ");
//            i++;
//        }
//
//        int i = 1;
//        do {
//            System.out.print(i + "; ");
//            i++;
//        } while (i <= n);
//
//        for(int i = 1; i <= n; i++)
//            System.out.print(i + "; ");
//
//        int t = 0;
//        for(int i = 1; i != t; i++)
//            System.out.print(i);
//
//        int i = 1;
//        while(i <= n){
//            if (i % 2 == 0){
//                System.out.print(i + "; ");
//            }
//            i++;
//        }
//
//        int i = 1;
//        do {
//            if (i % 2 == 0){
//                System.out.print(i + "; ");
//            }
//            i++;
//        } while (i <= n);
//
//        for(int i = 1; i <= n; i++){
//            if (i % 2 == 0){
//                System.out.print(i + "; ");
//            }
//        }
//
//        int i = 1;
//        while(i <= n){
//            if (i % 2 != 0){
//                System.out.print(i + "; ");
//            }
//            i++;
//        }
//
//        int i = 1;
//        do {
//            if (i % 2 != 0){
//                System.out.print(i + "; ");
//            }
//            i++;
//        } while (i <= n);
//
//        for(int i = 1; i <= n; i++){
//            if (i % 2 != 0){
//                System.out.print(i + "; ");
//            }
//        }
//
//        for(int i = 1; i <= 20; i++){
//            if (i % 5 == 0 && i % 3 == 0)
//                System.out.println(i + " - FiZzBuZz");
//            else if (i % 5 == 0)
//                System.out.println(i + " - BuZz");
//            else if (i % 3 == 0)
//                System.out.println(i + " - FiZz");
//            else
//                System.out.println(i);
//        }
    }


}