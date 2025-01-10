import java.util.Scanner;

class Uniter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program converts units");
        System.out.println("What do you wanna do? \n1)cm to m\n2)m to cm\n3)m to km\n4)km to m");
        float usersNumber = scanner.nextFloat();
        if (usersNumber == 1){
            System.out.println("Enter your number");
            usersNumber = scanner.nextFloat();
            System.out.println(usersNumber/100 +" m");
        }
        else if(usersNumber == 2){ 
            System.out.println("Enter your number"); 
            usersNumber = scanner.nextFloat();
            System.out.println(usersNumber*100 +" cm");
            }
        else if(usersNumber == 3){
            System.out.println("Enter your number"); 
            usersNumber = scanner.nextFloat();
            System.out.println(usersNumber/1000 +" km");
            }
        else{System.out.println("Enter your number");
            usersNumber = scanner.nextFloat();
            System.out.println(usersNumber*1000 + " m");          
            }
        }
    }