package customExceptions;

import java.util.Scanner;

public class Main {

    static void checkAge(int age) throws AgeException{
            if(age<18){
                throw new AgeException("\n You must be 18 or older to sign up");
            }else{
                System.out.println("You are signed up2");
            }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        try{

            checkAge(age);
        }

        catch(Exception e){
            System.out.println("A problem occured:"+e);
        }
    }
    
}
