package mock;

import java.util.List;

import java.util.Objects;
import java.util.stream.Collectors;

public class Employeee {
	String name;
	static double salary;
	
	public Employeee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employeee [name=" + name + ", salary=" + salary + "]";
	}
	
	List<Employeee> processEmployees(List<Employeee> employees ){
		List<Employeee> employees1=employees.stream()
										   .distinct()
										   .sorted((ref2,ref1)->ref1.name.compareTo( ref2.name))
										   .collect(Collectors.toList());
		return employees1;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employeee other = (Employeee) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	

}