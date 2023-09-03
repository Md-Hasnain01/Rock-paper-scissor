import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
public class Rockpaperscissor {
    public static void main(String[] args) {
        //       generate random number from computer
        Random rm = new Random();
        int x = rm.nextInt(1,4);


//        assign Rock Paper Scissor as number
        System.out.println("1---->Rock\n" + "2---->Paper\n" + "3---->Scissor");
//        enter the choice from user
        System.out.println("your choice:");
        Scanner sr = new Scanner(System.in);
        int y = sr.nextInt();


//        inform that what you choose and you  get
        if (y ==1){
            System.out.println("you choose Rock");
        }
        else if (y == 2) {
            System.out.println("you choose Paper");
        }
        else if (y == 3) {
            System.out.println("you choose Scissor");
        }


//        inform that what computer generate and what computer get
       if (x ==1){
           System.out.println("computer choose Rock");
       }
       else if (x == 2) {
           System.out.println("computer choose Paper");
       }
       else if (x == 3) {
           System.out.println("computer choose Scissor");
       }


//       give instruction what to do ,if you choose Rock and Scissor
       if (x==1 && y==3){
           System.out.println("computer win");
       }
       else if (x==3 && y==1) {
           System.out.println("You win");
       }
       else if (x==1 && y==1) {
           System.out.println("both tied");
       }
       else if (x==3 && y==3) {
           System.out.println("both tied");
       }


//       give instruction what to do , if you choose Rock and Paper
        if (x==1 && y==2){
            System.out.println("you win");
        }
        else if (x==2 && y==1) {
            System.out.println("computer win");
        }
        else if (x==2 && y==2) {
            System.out.println("both tied");
        }



//        give instruction what to do , if you choose Paper and Scissor
        if (x == 2 && y == 3){
            System.out.println("you win");
        }
        else if (x == 3 && y == 2) {
            System.out.println("computer win");
        }



    }
}
