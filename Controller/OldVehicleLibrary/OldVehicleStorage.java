package Controller.OldVehicleLibrary;

import java.util.ArrayList;

public class OldVehicleStorage {
  private ArrayList<String> data;

  public OldVehicleStorage() {
    this.data = new ArrayList<>();
  }

  public ArrayList<String> getData() {
    return this.data;
  }

  public void storeVehicleData(String data) {
    this.data.add(data);
  }
}
