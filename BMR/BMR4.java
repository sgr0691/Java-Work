import java.util.Scanner;
public class BMR4 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    int option = 1;
    do {
      System.out.print("Enter weight in pounds:");
      int weight = input.nextInt();
      System.out.print("Enter height in inches:");
      double height = input.nextDouble();
      System.out.print("Enter age in years:");
      int age = input.nextInt();
      System.out.print("Enter 1 for Male : 2 for Female");
      int gender = input.nextInt();
      double bmr = 0;
      
      System.out.printf("Weight: %d pounds", weight);
      System.out.printf("\nHeight: %.1f inches", height);
      System.out.printf("\nAge: %d years", age);
      
      if(gender == 1) {
        bmr = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        System.out.printf("BMR of a man: %.1f", bmr);
      }
      else if(gender == 2) {
        bmr = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        System.out.printf("BMR of a woman: %.1f", bmr);
      }
      System.out.print("\nEnter 1 to Continue : 0 to Exit");
      option = input.nextInt();
      if(option == 1) {
        continue;
      }
      else {
        break;
      }
    } while(true);
  }
}







