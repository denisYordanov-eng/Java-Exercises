import java.util.Scanner;

public class CheckingPrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int j = number; j>= 2; j--){
            if (isPrime(j)){
                System.out.print(j + " ");
            }

        }
    }
  public static boolean isPrime( int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
   }
}
