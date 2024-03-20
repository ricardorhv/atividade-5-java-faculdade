package model;

public class Address {
  private String CEP;
  private String publicSpace;
  private String city;
  private String neighborhood;
  private int houseNumber;
  private String description;

  public Address(String description, String city, String publicSpace, String neighborhood, int houseNumber,
      String CEP) {
    this.CEP = CEP;
    this.publicSpace = publicSpace;
    this.city = city;
    this.neighborhood = neighborhood;
    this.houseNumber = houseNumber;
    this.description = description;
  }

  public String getCEP() {
    return CEP;
  }

  public void setCEP(String cEP) {
    CEP = cEP;
  }

  public String getPublicSpace() {
    return publicSpace;
  }

  public void setPublicSpace(String publicSpace) {
    this.publicSpace = publicSpace;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }

  public int getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(int houseNumber) {
    this.houseNumber = houseNumber;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
