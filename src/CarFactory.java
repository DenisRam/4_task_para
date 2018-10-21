import java.util.ArrayList;
import java.util.Random;


public class CarFactory {

    private static int temp;
    private static Random random = new Random();


    public static ArrayList<Car> carPark(int numbersOfCars) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < numbersOfCars; i++) {
            cars.add(new Car(randomDrand(),
                    randomModel(),
                    randomYear(),
                    randomColour(),
                    randomPrice(),
                    randomRegistrationNumber()));
        }
        return cars;
    }

    private static String randomDrand() {

        switch (random.nextInt(5)) {
            case 0: {
                temp = 0;
                return "AUDI";
            }
            case 1: {
                temp = 1;
                return "BMW";
            }
            case 2: {
                temp = 2;
                return "FORD";
            }
            case 3: {
                temp = 3;
                return "OPEL";
            }
            default: {
                return "AUDI";
            }
        }
    }

    private static String randomModel() {
        switch (temp) {
            case 0: {
                return randomAudiModel();
            }
            case 1: {
                return randomBmwModel();
            }
            case 2: {
                return randomFordModel();
            }
            case 3: {
                return randomOpelModel();

            }
        }
        return null;
    }

    private static int randomYear() {
        return 2000 + random.nextInt(5);
    }

    private static String randomColour() {
        switch (random.nextInt(4)) {
            case 0: {
                return "Black";
            }
            case 1: {
                return "Yellow";
            }
            case 2: {
                return "White";
            }
            case 3: {
                return "Green";
            }
            default: {
                return "GOLD";
            }
        }
    }

    private static int randomPrice() {
        return (int) (15254.0 + random.nextDouble() * 5000);
    }

    private static int randomRegistrationNumber() {
        return (int) (Math.round(random.nextDouble() * 10000));
    }

    private static String randomAudiModel() {
        switch (random.nextInt(3)) {
            case 0: {
                return "A1";
            }
            case 1: {
                return "A2";
            }
            case 2: {
                return "A3";
            }
            default: {
                return "A1";
            }
        }
    }

    private static String randomBmwModel() {
        switch (random.nextInt(3)) {
            case 0: {
                return "M2";
            }
            case 1: {
                return "M3";
            }
            case 2: {
                return "M4";
            }
            default: {
                return "M2";
            }
        }
    }

    private static String randomFordModel() {
        switch (random.nextInt(3)) {
            case 0: {
                return "FIESTA";
            }
            case 1: {
                return "MONDEO";
            }
            case 2: {
                return "KUGA";
            }
            default: {
                return "KUGA";
            }
        }
    }

    private static String randomOpelModel() {
        switch (random.nextInt(3)) {
            case 0: {
                return "ASTRA";
            }
            case 1: {
                return "GT";
            }
            case 2: {
                return "OMEGA";
            }
            default: {
                return "ASTRA";
            }
        }
    }

}