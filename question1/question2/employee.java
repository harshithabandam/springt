package ch22.harsh;

public class Employe {
	int id;
	String name;
	String dept;
	double salary;
	Employe()
	{
		
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	public Employe(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

}
