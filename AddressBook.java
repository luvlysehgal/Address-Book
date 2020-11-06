import java.util.ArrayList;
public class AddressBook {
	public static void main(String[] args){

		PersonInformation personInformation1 = new  PersonInformation("Lovely", "Sehgal",
							"Model Town", "Rohtak", "Haryana", 124001L, 8000004990L);
		PersonInformation personInformation2 = new  PersonInformation("Muskan", "Sharma",
                     "Bharat colony", "Gurgaon", "Haryana", 124001L, 8529010000L);
	   PersonInformation personInformation3 = new  PersonInformation("Harshita", "Kapoor",
                     "Shivaji colony", "Panipat", "Haryana", 124001L, 8000002990L);
		PersonInformation personInformation4 = new  PersonInformation("Prithvi", "Malhotra",
                     "Power House", "Rewari", "Haryana", 124001L, 8000006440L);
		ArrayList<PersonInformation> personalInfo = new ArrayList<PersonInformation>();
		personalInfo.add(personInformation1);
		personalInfo.add(personInformation2);
		personalInfo.add(personInformation3);
		personalInfo.add(personInformation4);
	}
}
