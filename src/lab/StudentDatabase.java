package lab;

public class StudentDatabase {

	private String name;
	private String ssn;
	private String emailId;
	private static int Id = 100;
	private String phone;
	private String city;
	private String state;
	private String userId;
	private String[] courses;
	private double balance;
	

// Constructor
public StudentDatabase (String name , String ssn){
	this.name = name;
	this.ssn = ssn;
	Id++;
	setUserId();
	setEmailId(name);
}





//Setters and Getters 
public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getSsn() {
	return ssn;
}



public void setSsn(String ssn) {
	this.ssn = ssn;
}



public String getEmailId() {
	return emailId;
}



private void setEmailId(String name) {
	double emailCode = 001;
	this.emailId = name.substring(0, 1) + emailCode;
	emailCode++;
}



public String getPhone() {
	return phone;
}



public void setPhone(String phone) {
	this.phone = phone;
}



public String getCity() {
	return city;
}



public void setCity(String city) {
	this.city = city;
}



public String getState() {
	return state;
}



public void setState(String state) {
	this.state = state;
}



public String getUserId() {
	return userId;
}



private void setUserId() {
	int random = (int)(Math.random()*(9000-1000) + 1) + 1000;
	this.userId = Id + "" + random + "" +  ssn.substring(5);
} 


public double getBalance() {
	return balance;
}
	
	


//Methods

public void enroll(){
	
}

public void checkBalance(){
	System.out.println("Your Balance is: " + balance);
}

public void showCourses(){
	for(int i = 0; i < courses.length; i++){
		System.out.println(courses[i]);
	}
}

@Override
public String toString(){
	return "[Name: "+ name + ", USERID: "+ userId + ", EMAILID: "+emailId + ", Phone: "+ phone +
			", CITY: "+ city +", STATE: "+ state + ", Courses: " + courses + ", Balanace: $" + balance +
			"]";
			
}










	
}
