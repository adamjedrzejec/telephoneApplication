public class Address{
  String city;
  String street;
  TelephoneNumber teleNumber;


  public Address(String city, String street, TelephoneNumber teleNumber) {
    this.city = city;
    this.street = street;
    this.teleNumber = teleNumber;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  public TelephoneNumber getTeleNumber() {
    return teleNumber;
  }

}
