import java.util.Scanner;

public class CalcFaculty {
    public static void main(String[] args) {
        System.out.println("Berechnung der Fakultät");
        System.out.println("Bitte Zahl eingeben: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number + "! = "+ calculateFactorialNumber(number));


    }
    public static long calculateFactorialNumber (int value){
        if (value<2){
            return 1;
        }
        long result=1;
        int number =1;
        while (number<value){

            number++;
            result=result*number;
            //System.out.println("result "+result);
        }
        //System.out.println("number= "+number);
        return result;
    }
}
