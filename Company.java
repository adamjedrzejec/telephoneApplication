public class Company extends TelephoneEntry {
  String name;
  Address address;

  public Company(String name, Address address){
    this.name = name;
    this.address = address;
  }


  public String description(){
    return (name + " " + address.getCity() + " " + address.getStreet());
  }

  public Address getAddress() {
      return address;
  }
}
