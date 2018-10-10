import java.util.ArrayList;
import java.util.Scanner;


public class MainCars {
    public static void main(String[] args) {
        System.out.println("Введите количество машин");
        Scanner sc = new Scanner(System.in);


        ArrayList <Car> cars  = CarFactory.carPark(sc.nextInt());

        System.out.println(cars);

}
}
