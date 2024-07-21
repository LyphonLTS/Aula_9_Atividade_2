package Controller;

import Controller.OldVehicleLibrary.OldVehicleStorage;
import Interface.IVehicleStorage;

public class VehicleStorageAdapter implements IVehicleStorage {
  OldVehicleStorage oldVehicleStorage;

  public VehicleStorageAdapter() {
    this.oldVehicleStorage = new OldVehicleStorage();
  }

  public void saveVehicleData(Vehicle vehicle) {
    oldVehicleStorage
        .storeVehicleData(vehicle.getId() + ", " + vehicle.getModel() + ", " + String.valueOf(vehicle.getYear()));

    System.out.println(oldVehicleStorage.getData());
  }
}
