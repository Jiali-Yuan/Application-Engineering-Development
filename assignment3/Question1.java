public class Question1 {
	public static void main(String[] args) {
		Course c = new Course("JAVA");
		Student s = new Student("Jiali", 1);
		System.out.println(c.registerStudent(s));		
	}
}

class Student {
	private String name;
	private int id;
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public int getID() {
		return this.id;
	}
}

class Course {
	private String courseName;
	int numberOfStudent = 0;
	Student[] registeredStu = new Student[10];
	
	Course (String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName() {
		return this.courseName;
	}
	
	public Student[] getStudents(){
		return registeredStu;
	}
	
	public boolean isFull(){
		if (numberOfStudent < 10) {
			return false;
		}else {
			return true;
		}
	}
	
	public String registerStudent(Student student){
		if (this.isFull()) {
			String notice = "This course is full, " + student.getName() + " failed to register!";
			return notice;
		}else {
			System.out.println("The course is avaliable!");
			registeredStu[numberOfStudent] = student;
			numberOfStudent++;
			String notice = "Student " + student.getName() + " has registered the course " + this.getCourseName() + ", the student id is " + student.getID() + "." + "\nThis course has been registered for " + numberOfStudent + " student(s)!";
			return notice;
		}
	}
}