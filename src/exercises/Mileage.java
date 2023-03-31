package exercises;
import java.util.Scanner;

public class Mileage {

    public static void main(String[] args) {
        Mileage mileage = new Mileage();
        mileage.calculateMileage();
    }

    public void calculateMileage() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many gallons of gas has your car used?");
        Double gallonsConsumed = scanner.nextDouble();

        System.out.println("How many miles have you driven?");
        Double milesDriven = scanner.nextDouble();

        Double mileage =  milesDriven / gallonsConsumed;
        System.out.println("Your miles per gallon is: " + mileage.toString());
    }
}
