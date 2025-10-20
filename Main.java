import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here

    // int count = 3;

    // while (count <= 25)
    // {
    //   System.out.println(count);
    //   count = count + 2;
    // }


    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter positive numbers to add. Enter -1 to stop.");
    // int sum = 0;
    // int userInput = 0;

    // while (userInput != -1)
    // {
    //   userInput = sc.nextInt();
    //   sum += userInput;
    // }
    // sum++; //Note: When the user enters -1, we add -1 to the sum
    //       // so we ++ to add back 1
    // System.out.println("The sum is " + sum);


    //Problem 2

    // int N;
    // System.out.println("How many numbers do you want to enter?");
    // N = sc.nextInt();
    // int max = Integer.MIN_VALUE; //int max = Integer.MIN_VALUE;

    // int counter = 0;
    // while (counter < N);
    // {
    //   userInput = sc.nextInt();
    //   if(userInput > max)
    //   {
    //      max = userInput;
    //   }
    //   counter ++;

    //   System.out.println("The max is " + max);

    // }

    String word = "calculator";
    int index = 0;
    int counter = 0;
    while (index < word.length()) //Get every letter loop
    {
      String currentLetter = word.substring(index, index+1); 
      if(counter % 3 != 0)
      {
        System.out.println(currentLetter);
      }
    }
     

    index++;
    counter++;
    // sc.close();

  }
}
