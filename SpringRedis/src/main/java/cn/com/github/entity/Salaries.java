package cn.com.github.entity;

public class Salaries {

	private int emp_no;
	private int salary;
	private String from_date;
	private String to_date;

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFrom_date() {
		return from_date;
	}

	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}

	public String getTo_date() {
		return to_date;
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	@Override
	public String toString() {
		return "Salaries [emp_no=" + emp_no + ", salary=" + salary + ", from_date=" + from_date + ", to_date=" + to_date
				+ "]";
	}

	public Salaries(int emp_no, int salary, String from_date, String to_date) {
		super();
		this.emp_no = emp_no;
		this.salary = salary;
		this.from_date = from_date;
		this.to_date = to_date;
	}

}
