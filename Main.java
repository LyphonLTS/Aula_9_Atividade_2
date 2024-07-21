import Controller.Vehicle;
import Controller.VehicleStorageAdapter;

class Main {
  public static void main(String[] args) {
    VehicleStorageAdapter vehicleStorageAdapter = new VehicleStorageAdapter();

    vehicleStorageAdapter.saveVehicleData(new Vehicle("1", "Fusion", 2019));
    vehicleStorageAdapter.saveVehicleData(new Vehicle("2", "Voyage", 2015));
  }
}