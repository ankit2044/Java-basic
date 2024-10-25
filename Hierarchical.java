package oops;
class Appliance {
    String brand;
    int powerConsumption;
    boolean isOn;

    Appliance(String brand, int powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }
}

class Refrigerator extends Appliance {
    int capacity;
    int temperature;

    Refrigerator(String brand, int powerConsumption, int capacity) {
        super(brand, powerConsumption);
        this.capacity = capacity;
        this.temperature = 5;
    }
}

class Oven extends Appliance {
    int maxTemperature;
    int temperature;

    Oven(String brand, int powerConsumption, int maxTemperature) {
        super(brand, powerConsumption);
        this.maxTemperature = maxTemperature;
        this.temperature = 0;
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Refrigerator fridge = new Refrigerator("Samsung", 150, 350);

        System.out.println("Refrigerator Brand: " + fridge.brand);
        System.out.println("Power Consumption: " + fridge.powerConsumption + "W");
        System.out.println("Refrigerator is " + (fridge.isOn ? "ON" : "OFF"));
        System.out.println("Capacity: " + fridge.capacity + " liters");
        System.out.println("Temperature: " + fridge.temperature + "°C");

        fridge.isOn = true;
        System.out.println("\n" + fridge.brand + " is now ON");

        fridge.temperature = 4;
        System.out.println("Refrigerator temperature set to " + fridge.temperature + "°C");

    }
}
