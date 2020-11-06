public class PersonInformation {

	private final String firstName;
   private final String lastName;
   private String address, city, state;
	private long zip, phoneNumber;

	public PersonInformation(String firstName, String lastName, String address,
                           String city, String state, long zip, long phoneNumber) {

      this.firstName = firstName;
      this.lastName = lastName;
      this.address = address;
      this.state = state;
      this.city = city;
      this.zip = zip;
      this.phoneNumber = phoneNumber;
   }
}
