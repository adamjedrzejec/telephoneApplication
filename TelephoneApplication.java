import java.util.*;

public class TelephoneApplication{
  public static void main(String[] args) {

    List<TelephoneEntry> addressList = new ArrayList<TelephoneEntry>();



    addressList.add(new Person("Adam", "Jędrzejec", new Address("Rokiciny", "Południowa 8", new TelephoneNumber(48, 23456789))));
    addressList.add(new Person("Max", "Twardowski", new Address("Łódź", "Stefanowskiego 2", new TelephoneNumber(32, 12131415))));
    addressList.add(new Company("RandomCompany", new Address("Warszawa", "Emilii Plater 6", new TelephoneNumber(64, 94374712))));
    addressList.add(new Person("Krystian", "Piętrzyk", new Address("Opole", "Kamienna 2s", new TelephoneNumber(34, 99746523))));


    TreeMap<TelephoneNumber, TelephoneEntry> addressBook = new TreeMap<TelephoneNumber, TelephoneEntry>();

    Iterator<TelephoneEntry> addressListIterator = addressList.iterator();

    while (addressListIterator.hasNext()) {
        TelephoneEntry input = addressListIterator.next();
        addressBook.put(input.getAddress().getTeleNumber(), input);
    }

    for (Map.Entry<TelephoneNumber, TelephoneEntry> input : addressBook.entrySet()) {
        System.out.println("Description: " + input.getKey().countryCode + "-" + input.getKey().localNumber + "\t" + input.getValue().description());
    }
  }
}
