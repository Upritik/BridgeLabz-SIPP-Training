package Inheritance.HybridInheritance;

interface Refuelable {
    void refuel();
}

class VehicleSystem {
    String model;
    int maxSpeed;

    VehicleSystem(String model, int speed) {
        this.model = model;
        this.maxSpeed = speed;
    }
}

class ElectricVehicle extends VehicleSystem {
    ElectricVehicle(String model, int speed) {
        super(model, speed);
    }

    void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends VehicleSystem implements Refuelable {
    PetrolVehicle(String model, int speed) {
        super(model, speed);
    }

    public void refuel() {
        System.out.println(model + " is refueling.");
    }

    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Suzuki Swift", 160);

        ev.charge();
        pv.refuel();
    }
}
