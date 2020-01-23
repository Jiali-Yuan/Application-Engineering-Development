1) Write a method to take a String and character as input and find how many characters are in the String
	Example #1
		Input : "North", 'r'
		Output : "North" has 1 'r'

ans: 
class CountChar {
	public static void main(String[] args) {
		String ex = "North";
		char c = 'r';
		System.out.println(ex + " has" + " " + countChar(ex, c) + " " + c);
	}
	
	public static int countChar(String str, char ch){
		int len = str.length();
		int count = 0;
		for (int i = 0; i < len; i++){
			if (str.charAt(i) == ch){
				count++;
			}
		}
		return count;
	}
}

2) Write a method to find the maximum and minimum number in an array of numbers
	Example:
		Input : [3, 5, 7, 1, 4, 32, 15]
		Output : Max is 32 and Min is 1
		
ans:
class MaxAndMinNum {
	public static void main(String[] args) {
		int[] num = {3, 5, 7, 1, 4, 32, 15};
		System.out.println("max is " + maxNum(num) + " and min is " + minNum(num));
	}
	
	public static int maxNum(int[] numbers) {
		int max = numbers[0];
		int len = numbers.length;
		for (int i = 0; i < len; i++) {
			if (numbers[i] > max){
				max = numbers[i];
			}
		}
		return max;
	}
		
	public static int minNum(int[] numbers) {
		int min = numbers[0];
		int len = numbers.length;
		for (int i = 0; i < len; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
}
		

3) Write a java function that adds all the digits of an integer until it is single digit.
		i. function takes an integer as input and returns its sum of digits.
		ii. for example input = 37, sum = 3+7 = 10, sum = 1+0 = 1. result = 1.

		Here is the prototype you can work with
	
		public int addDigits (int input) {
		}
		
ans:
class AddDigits {
	public static void main(String[] args) {
		int input = 37;
		System.out.println(addDigits(input));
	}
	
	public static int getDigits(int input) {
		int sum = 0;
		while (input > 0) {
			sum = sum + input % 10;
			input = input / 10;
		}
		return sum;
	}
	
	public static int addDigits(int num) {
		int sum = num;
		while (sum >= 10) {
			sum = getDigits(sum);
		}
		return sum;
	}
}		


4) Question

ans:
class Employee {
	String name;
	int age;
	Gender gender;
	double salary;
	
	public Employee(String name, int age, Gender gender, double salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
}

enum Gender {
	MALE, FEMALE, UNKNOWN;
}

public class Assignment2 {
	    // Assignment
	    /**
	     * Write a method to calculate the Social Security Tax of an employee and print it.
	     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
	     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
	     */
	    public static double socialSecurityTax(Employee employee) {
			double tax = 0;
			if (employee.salary <= 8900) {
				tax = 0.062 * employee.salary;
			}else {
				tax = 0.062 * 106800;
			}
			System.out.println("The Social Security Tax is " + tax);
			return tax;
		}
	
       /**
	     * Write a method to calculate an employee's contribution for insurance coverage and print it.
	     * Amount of deduction is computed as follows:
	     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
	     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
	     */
	    public static double insuranceCoverage(Employee employee) {
			double rate = 0;
			if (employee.age < 35) {
				rate = 0.03 * employee.salary;
			}else if (35 <= employee.age && employee.age <= 50) {
				rate = 0.04 * employee.salary;
			}else {
				rate = 0.06 * employee.salary;
			}
			System.out.println("The employee's insurance coverage is " + rate);
			return rate;
		}
	

	    /**
	     * Write a method to sort three employees' salary from low to high, and then print their name in order.
	     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
	     * John Alice Jenny
	     */
	    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
		Employee temp;
		if (e1.salary > e2.salary) {
			temp = e1;
			e1 = e2;
			e2 = temp;
		}
		if (e1.salary > e3.salary) {
			temp = e1;
			e1 = e3;
			e3 = temp;
		}
		if (e2.salary > e3.salary) {
			temp = e2;
			e2 = e3;
			e3 = temp;
		}
		System.out.println("The order of salary from low to high is: " + e1.name + " " + e2.name + " " + e3.name);
	 }

//Extra credit
	

	    /**
	     * I have written some code below. What I want is to swap two Employee objects.
	     * One is Jenny and one is John. But after running it, I got the result below:
	     * Before: a=Jenny
	     * Before: b=John
	     * After: a=Jenny
	     * After: b=John
	     * There is no change after swap()! Do you know the reason why my swap failed?
	     * Write your understanding of the reason and explain it.
	     */
	    /*
	     write your understanding here.
	     Your Answer:
	
	     Java is Pass by Value. The object is created and the variable contains the reference location of memory.  The swap() method in this case, looks like changed the values of a and b, but they copies of a and b memory locations. Therefore,the the values of a and b are not changed.  
	    */
	    public static void main(String[] args) {
	        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
	        Employee b = new Employee("John", 30, Gender.MALE, 2500);
	        System.out.println("Before: a=" + a.getName());
	        System.out.println("Before: b=" + b.getName());
	        swap(a, b);//
	        System.out.println("After: a=" + a.getName());
	        System.out.println("After: b=" + b.getName());
	    }
	

	    public static void swap(Employee x, Employee y) {
	        Employee temp = x;
	        x = y;
	        y = temp;
	    }
	}
