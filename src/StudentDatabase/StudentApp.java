package StudentDatabase;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] course = { "Course A", "Course B", "Course C", "Course D" };
		
		Student stu = new Student("John.Brown", "123456789");
		stu.genUserId("10");
		stu.setPhone("7705556666");
		System.out.println("Phone: " + stu.getPhone());
		stu.setCity("Atlanta");
		System.out.println("City: " + stu.getCity());
		stu.setState("Georgia");
		System.out.println("State: " + stu.getState());
		stu.showCourses(course);
		stu.enroll(5000.00);
		stu.pay(2000.00);
		stu.checkBalance();
		System.out.println(stu.toString());
		
		
		

	}

}
