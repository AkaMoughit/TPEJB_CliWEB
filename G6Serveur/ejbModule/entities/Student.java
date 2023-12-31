package entities;

import java.io.Serializable;

import jakarta.persistence.Entity; 
import jakarta.persistence.ManyToOne;

@Entity
public class Student extends User implements Serializable{
	public Student(String login, String password) {
		super(login, password);
		// TODO Auto-generated constructor stub
	}
	private static final long serialVersionUID = -558553967080513790L;
	private String firstName;
    private String lastName;
    private String telephone;
    
    @ManyToOne
    private Filier filier;

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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Filier getFilier() {
		return filier;
	}

	public void setFilier(Filier filier) {
		this.filier = filier;
	}
    
}
