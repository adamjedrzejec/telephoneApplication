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

      if (getCountryCode() > otherNumber.getCountryCode())
          return 1;
      else if (getCountryCode() < otherNumber.getCountryCode())
          return -1;
      else {
          if (getLocalNumber() > otherNumber.getLocalNumber())
              return 1;
          else if (getLocalNumber() < otherNumber.getLocalNumber())
              return -1;
          else
              return 0;
      }
  }
}
