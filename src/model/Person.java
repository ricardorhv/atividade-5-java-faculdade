package model;

import java.util.ArrayList;

public class Person {
  private String name;
  private int age;
  private Address mainAddress;
  private ArrayList<Address> addressList;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.addressList = new ArrayList<Address>();
  }

  public Person(String name, int age, String city, String publicSpace, String neighborhood, int houseNumber,
      String CEP) {
    this.name = name;
    this.age = age;

    this.mainAddress = new Address("Principal", city, publicSpace, neighborhood, houseNumber, CEP);
    this.addressList = new ArrayList<Address>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Address getMainAddress() {
    return mainAddress;
  }

  public void setMainAddress(Address mainAddress) {
    this.mainAddress = mainAddress;
  }

  public ArrayList<Address> getAddressList() {
    return addressList;
  }

  public void setAddressList(ArrayList<Address> addressList) {
    this.addressList = addressList;
  }

  private boolean verifyIfHasAddressWithThisDescription(String description) {
    for (Address address : addressList) {
      if (address.getDescription().toLowerCase().equals(description.toLowerCase())) {
        return true;
      }
    }

    return false;
  }

  public void addNewAddressToTheList(String description, String city, String publicSpace, String neighborhood,
      int houseNumber, String CEP) {
    boolean hasAlreadyAddressWithThisDescription = verifyIfHasAddressWithThisDescription(description);

    if (hasAlreadyAddressWithThisDescription) {
      System.out.println("Você já possui um endereço com essa descrição!");
      return;
    }

    Address newAddress = new Address(description, city, publicSpace, neighborhood, houseNumber, CEP);

    this.addressList.add(newAddress);
    System.out.println("Endereço " + description + " foi adicionado com sucesso!");
  }

  public void removeAddressFromTheListByDescription(String description) {
    boolean hasAddressWithThisDescription = verifyIfHasAddressWithThisDescription(description);

    if (hasAddressWithThisDescription) {
      for (Address address : addressList) {
        if (address.getDescription().toLowerCase().equals(description.toLowerCase())) {
          addressList.remove(address);
          System.out.println("Endereço " + description + " foi removido com sucesso!");
          break;
        }
      }
    } else {
      System.out.println("Você não possui nenhum endereço com essa descrição!");
    }
  }

  public void addMainAddress(String city, String publicSpace, String neighborhood, int houseNumber, String CEP) {
    this.mainAddress = new Address("Principal", city, publicSpace, neighborhood, houseNumber, CEP);
    System.out.println("Novo endereço principal adicionado com sucesso!");
  }

  public void showData() {
    System.out.println("Nome: " + this.name);
    System.out.println("Idade: " + this.age);

    System.out.println("\n**Endereço Principal**");
    System.out.println("Cidade: " + this.mainAddress.getCity());
    System.out.println("Logradouro: " + this.mainAddress.getPublicSpace());
    System.out.println("Bairro: " + this.mainAddress.getNeighborhood());
    System.out.println("Número: " + this.mainAddress.getHouseNumber());
    System.out.println("CEP: " + this.mainAddress.getCEP());

    System.out.println("\n**Lista de Endereços**");
    for (Address address : this.addressList) {
      System.out.println("\nEndereço " + address.getDescription());
      System.out.println("Cidade: " + address.getCity());
      System.out.println("Logradouro: " + address.getPublicSpace());
      System.out.println("Bairro: " + address.getNeighborhood());
      System.out.println("Número: " + address.getHouseNumber());
      System.out.println("CEP: " + address.getCEP());
    }
  }
}
