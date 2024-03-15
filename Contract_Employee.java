package TableperhierchyInheritence;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contractemployee")

public class Contract_Employee extends Employee {
@Column(name="pay_per_hour")
 private float pay_perHR;
@Column(name="contract_duration")
 private float contractDuration;
public float getPay_perHR() {
	return pay_perHR;
}
public void setPay_perHR(float pay_perHR) {
	this.pay_perHR = pay_perHR;
}
public float getContractDuration() {
	return contractDuration;
}
public void setContractDuration(float contractDuration) {
	this.contractDuration = contractDuration;
}
public Contract_Employee(float pay_perHR, float contractDuration) {
	super();
	this.pay_perHR = pay_perHR;
	this.contractDuration = contractDuration;
}
public Contract_Employee() {
	super();
}
@Override
public String toString() {
	return "Contract_Employee [pay_perHR=" + pay_perHR + ", contractDuration=" + contractDuration + "]";
}
 
}
