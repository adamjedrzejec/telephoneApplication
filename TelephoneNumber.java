public class TelephoneNumber implements Comparable<TelephoneNumber> {
  int countryCode;
  long localNumber;

  public TelephoneNumber(int countryCode, long localNumber){
    this.countryCode = countryCode;
    this.localNumber = localNumber;
  }

  public int getCountryCode() {
    return countryCode;
  }

  public long getLocalNumber() {
    return localNumber;
  }

  public int compareTo(TelephoneNumber otherNumber) {
    int compare = (Integer.toString(countryCode)).compareTo(Integer.toString(otherNumber.countryCode));

    if (compare == 0){
      return (String.valueOf(localNumber)).compareTo(String.valueOf(otherNumber.localNumber));
    }
    return compare;
  }
}
