import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.time.LocalDateTime;


public class CarOptions {

    private static final Scanner scanner = new Scanner(System.in);

    static String InputString() {
        return scanner.next();
    }

    static int InputInt() {
        return scanner.nextInt();
    }

    public static List<Car> showCarsByBrand(List<Car> cars) {
        System.out.println("Введите Бренд:");
        String findBrand = InputString();
        return cars.stream()
                .filter(car -> car.getCarBrand().equals(findBrand))
                .collect(Collectors.toList());

    }

    public static List<Car> showCarsByModelRideByYears(List<Car> cars) {
        System.out.println("Введите Модель:");
        String findModel = InputString();
        System.out.println("Введите сколько лет эксплуатируются:");
        int findYear = InputInt();
        return cars.stream()
                .filter(car -> car.getModel().equals(findModel))
                .filter(car -> (LocalDateTime.now().getYear() - car.getYear()) > findYear)
                .collect(Collectors.toList());
    }

    public static List<Car> showCarsByYearWithLargerPrice(List<Car> cars) {
        System.out.println("Введите Год:");
        int findYear = InputInt();
        System.out.println("Введите Price:");
        int findPrice = InputInt();
        return cars.stream()
                .filter(car -> car.getYear() == findYear)
                .filter(car -> car.getPrice() < findPrice)
                .collect(Collectors.toList());
    }

    /*
    public static List<Car> Narkoman(List<Car> cars){
        System.out.println("Введите Год:");
        int findYear = InputInt();
        System.out.println("Введите Price:");
        int findPrice = InputInt();

        List<Car> car1 = cars.stream()
                 .filter(car -> car.getYear()>=findYear)
                 .filter(car -> car.getPrice()<findPrice)
                 .collect(Collectors.toList());

        System.out.println(car1);

        System.out.println("Введите Brand:");
        String findBrand = InputString();
        return  car1.stream()
                .filter(car -> car.getCarBrand()==findBrand)
                .collect(Collectors.toList());
    }
    */
}