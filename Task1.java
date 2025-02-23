//1.Generate a random number within a specified range, such as 1 to 100.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Random r=new Random(1000); //don't mention size 
        int z=r.nextInt(100);
        System.out.println(z); //if the size(sane ir different) is mention in both int and random then it not generates random number
    }
}



//2. Prompt the user to enter their guess for the generated number.


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number(0-100): ");
        int n=sc.nextInt();
        Random r=new Random(100); 
        int z=r.nextInt(100);
        // System.out.println(z);
    //   boolean b=n==z;
    //   System.out.println(b);
           //or
       // System.out.println(n==z?"True":"False");
          //or
        if(n==z)
        System.out.println("True");
        else
        System.out.println("False");
    }
}



//3.Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number(0-100): ");
        int n=sc.nextInt();
        System.out.println("Entered value: "+n);
        Random r=new Random(); 
        int z=r.nextInt(100);
        System.out.println("Random value: "+z);
        
     String s=n>z?"high":"low";
  if(z==n)
  System.out.println("Correct");
     System.out.println(n+" is "+ s +" than "+z);
     
 
    }
}


//4.Repeat steps 2 and 3 until the user guesses the correct number.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        Random r=new Random(); 
        int z=r.nextInt(100);
        System.out.println("Random value: "+z);
       do
       {
           System.out.print("Enter number(0-100): ");
        int n=sc.nextInt();
        System.out.println("Entered value: "+n);
        if(n==z){
        System.out.println("Correct!");
        break;
        }
        else
        System.out.println("Try Again!");
       }
 while(true);
    }
}




//5.Limit the number of attempts the user has to guess the number.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        Random r=new Random(); 
        int z=r.nextInt(100);
        System.out.println("Random value: "+z);
        int count=0;
     
       do
       {
           System.out.print("Enter number(0-100): ");
        int n=sc.nextInt();
        System.out.println("Entered value: "+n);
        if(n==z){
        System.out.println("Correct!");
        break;
        }
        else
        System.out.println("Try Again!");
        count++;
       }
 while(count<5);
        
    }
}


//6.Add the option for multiple rounds, allowing the user to play again.



import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        String playAgain;
        do {
           int z=r.nextInt(100);
            System.out.println("Random value  " + z);

            int count = 0;
            boolean correct = false;

            System.out.println("Guess the number between 0 and 100:");
            do {
                System.out.print("Enter number(0-100):");
               int n=sc.nextInt();
                System.out.println("Entered value: " + n);
                if (n==z) {
                    System.out.println("Correct!");
                    correct=true;
                } else {
                    System.out.println("Try Again!");
                }
                count++;
            } while(!correct);

            System.out.print("Do you want to play again? (yes/no): ");
        playAgain=sc.next();

        } while(playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing!");
    }
}



//7. Display the user's score, which can be based on the number of attempts taken or rounds won.


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
       int z=r.nextInt(100);
       System.out.print("Random value: "+z);
       System.out.println();
       int count=0;
       do
       {
       System.out.println("Enter value: ");
       int n=sc.nextInt();
       if(z==n)
       {
           System.out.println("Correct! ");
           System.out.println("Count is: "+count);
           break;
       }
       else
       System.out.println("Try again");
       count++;
       }
       while(true);
    }
}






