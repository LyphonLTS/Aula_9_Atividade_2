package Controller;

public class Vehicle {
  private String id;
  private String model;
  private int year;

  public Vehicle(String id, String model, int year) {
    this.id = id;
    this.model = model;
    this.year = year;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "ID: " + this.id + "\nName: " + this.year + "\nModel: " + this.model;
  }
}
