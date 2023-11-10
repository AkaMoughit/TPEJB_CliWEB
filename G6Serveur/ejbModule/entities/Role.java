package entities;

import java.io.Serializable;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Role implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -558553967080513790L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
	@ManyToMany(mappedBy = "role")
    private List<User> user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return user;
	}

	public void setUsers(List<User> users) {
		this.user = users;
	}
    
}
