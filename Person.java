public class Person extends TelephoneEntry {
  String name;
  String lastName;
  Address address;

  public Person(String name, String lastName, Address address){
    this.name = name;
    this.lastName = lastName;
    this.address = address;
  }

  public String description(){
    return (name + " " + lastName + " " + address.getCity() + " " + address.getStreet());
  }

  public Address getAddress() {
      return address;
  }
}
