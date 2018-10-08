package me.salisuwy;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.mysql.fabric.xmlrpc.base.Data;

@Entity
public class Employee1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
@NotBlank
    private String firstName;
    public Employee1() {
		
	}



	public Employee1(int id, String firstName, String lastName, Data dayOfBirth, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dayOfBirth = dayOfBirth;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Data getDayOfBirth() {
		return dayOfBirth;
	}



	public void setDayOfBirth(Data dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}


	@NotBlank
	private String lastName;
	@NotBlank
    private Data dayOfBirth;
	@NotBlank
    private double salary;
    

  

    
    
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                  ", Date of Birth='" + dayOfBirth + '\'' +
                    ", salary='" + salary + '\'' +
                '}';
    }
}
