/*
New Student constructor that takes name and SSN in the arguments
- Automatically create an email ID based on the name
- Set a private static ID
- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
- Use encapsulation to set variables (phone, city, state)
*/

package StudentDatabase;

public class Student {

	// properties of Student
	private static String name;
	private static String email;
	private static String ssn;
	private static String ID;
	private static String userId;
	private static double enrollFee;
	private static double payment;
	private static double balance;

	private String phone;
	private String city;
	private String state;

	// Constructor takes name and ssn as argument
	public Student(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		this.balance = balance;
		balance = enrollFee;
		System.out.println("Name: " + name);
		System.out.println("SSN: " + ssn);
		setEmail(name);
	}

	
	public void setId (String ID) {
		this.ID = ID;
	
	}
	
	public String getId() {
		return ID;
		
	}
	// create email address
	public void setEmail(String name) {
		// this.name = name;
		email = name + "@yahoo.com";
		System.out.println("Email: " + email);
	}

	// Generate a user ID that is combination of Static ID,
	// random 4-digit number between 1000 and 9000, and last 4 of SSN
	public void genUserId(String ID) {
		int random = (int) Math.random() * 9000 + 1000;
		userId = ID + random + ssn.substring(5, 9);
		System.out.println("UserId: " + userId);

	}

	public void enroll(double enrollFee) {
		this.enrollFee = enrollFee;
		System.out.println("Enrollment fee: " + enrollFee);

	}

	public void pay(double payment) {
		this.payment = payment;
		System.out.println("Payment made: " + payment);

	}

	public void checkBalance() {

		this.balance = balance;
		balance = enrollFee - payment;
		System.out.println("Current Balance: " + balance);

	}

	public void showCourses(String[] course) {
		System.out.println("Courses:");
		int i = 0;
		do {
			System.out.println(course[i]);
			i = i + 1;
		} while (i < course.length);

	}

	public void setPhone(String phone) {
		this.phone = phone;

	}

	public String getPhone() {
		return phone;

	}

	public void setCity(String city) {
		this.city = city;

	}

	public String getCity() {
		return city;

	}

	public void setState(String state) {
		this.state = state;

	}

	public String getState() {
		return state;

	}

	@Override
	public String toString() {
        System.out.println("Obtained by toString");
		return String.format("%s\n" + "%s%s\n%s%s\n%s%s\n" + "%s%s\n%s%s\n%s%s\n%s%s\n" + "%s%.2f\n%s%.2f\n%s%.2f\n",
				"***Student Database***","Name: ", name, "Email: ",email, "SSN: ",ssn, "UserId: ",userId, "Phone: ",phone, "City: ",city, "State: ",state,
				"Enrollment Fees: ",enrollFee, "Payment Made: ",payment, "Balance: ",balance);

	}

}
