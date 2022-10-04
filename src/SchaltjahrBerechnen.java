import java.util.Scanner;

public class SchaltjahrBerechnen {
    public static void main(String[] args) {
        System.out.println("Schaltjahrberechnung");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Jahreswert ein");
        int year = scanner.nextInt();
        System.out.println("Ihr Wert lautet: "+year);

        if (year%4==0 && year%400==0){
            System.out.println(year+"Es ist ein Schaltjahr");

        }
        else if (year%4==0 && year%100!=0){
            System.out.println(year+" ist ein Schaltjahr");
        }
        else {
            System.out.println(year+"Es ist kein Schaltjahr");
        }
        System.out.println(year+" is a leaf year"+ isLeafYear(year));




    }
    public static boolean isLeafYear(int year){
        if (year%4==0 && year%400==0){
            return true;
        }
        else if (year%4==0 && year%100!=0){
            return true;}
        else {
            return false;
        }


    }
}
