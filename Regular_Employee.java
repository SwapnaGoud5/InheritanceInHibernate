package TableperhierchyInheritence;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.Table;

@Entity
//@Table(name="RegEmp_Table")
@DiscriminatorValue("regularemployee")
public class Regular_Employee extends Employee {
@Column(name="salary")
 private String salary;
@Column(name="bonus")
 private String Bonus;
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getBonus() {
	return Bonus;
}
public void setBonus(String bonus) {
	Bonus = bonus;
}
public Regular_Employee(String salary, String bonus) {
	super();
	this.salary = salary;
	Bonus = bonus;
}
public Regular_Employee() {
	super();
}
@Override
public String toString() {
	return "Regular_Employee [salary=" + salary + ", Bonus=" + Bonus + "]";
}
 
}
