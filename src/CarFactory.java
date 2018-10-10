import java.util.Random;

/**
 * Created by Denis on 10.10.2018.
 */

public class CarFactory {

    private static String temp;
    private static Random random;


    private Car [] carPark (int a){
        Car cars [] = new Car[a];
        for (Car c: cars){
            c = new Car(randomDrand(),
                        randomModel(),
                        randomYear(),
                        randomColour(),
                        randomPrice(),
                        randomRegistrationNumber());
        }
        return cars;
    }

    private String randomDrand() {
        switch (random.nextInt(4)){
            case 0: {
                return temp = "AUDI";
            }
            case 1: {
                return temp = "BMW";
            }
            case 2: {
                return temp = "FORD";
            }
            case 3: {
                return temp = "OPEL";
            }
            default:{
                return temp ="AUDI";
            }
        }
    }

    private String randomModel(){
        switch (temp){
            case "AUDI":{
                return randomAudiModel();
            }
            case "BMW":{
                return randomBmwModel();
            }
            case "FORD":{
                return randomFordModel();
            }
            case "OPEL":{
                return randomOpelModel();

            }
        }
        return null;
    }

    private int randomYear(){
        return 2000 + random.nextInt(18);
    }

    private String randomColour(){
        switch (random.nextInt(4)){
            case 0: { return "Black";}
            case 1: { return "Yellow";}
            case 2:{ return "White";}
            case 3:{ return "Green";}
            default:{ return "GOLD";}
        }
    }

    private Double randomPrice() {
        return 15254.0 + random.nextDouble()*5000;
    }

    private String randomRegistrationNumber() {
        return temp = String.valueOf(Math.round(random.nextDouble()*10000));
    }

    private String randomAudiModel(){
        switch (random.nextInt(3)){
            case 0: { return "A1";}
            case 1: { return "A2";}
            case 2:{ return "A3";}
            default:{ return "A1";}
        }
    }

    private String randomBmwModel(){
        switch (random.nextInt(3)){
            case 0: { return "M2";}
            case 1: { return "M3";}
            case 2:{ return "M4";}
            default:{ return "M2";}
        }
    }

    private String randomFordModel(){
        switch (random.nextInt(3)){
            case 0: { return "FIESTA";}
            case 1: { return "MONDEO";}
            case 2:{ return "KUGA";}
            default:{ return "KUGA";}
        }
    }

    private String randomOpelModel(){
        switch (random.nextInt(3)){
            case 0: { return "ASTRA";}
            case 1: { return "GT";}
            case 2:{ return "OMEGA";}
            default:{ return "ASTRA";}
        }
    }

}
