package com.cg.onlinesweetmartapplication.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


@Entity
public class Customer {

	@Id
	private Integer userId;
	@Column(name="Name")
	@NotEmpty(message = "UserName cannot be empty")
	private String username;
	@Column(name="EmailId",unique = true)
	@Email(message = "Please check your EmailId")
	@NotEmpty(message="Email cannot be empty")
	private String email;
	@Column(name="Address")
	private String  address;
	//@OneToMany(mappedBy = "customer")
	//@ElementCollection(targetClass = SweetOrder.class)
	//private List<SweetOrder> sweetOrders;*/
	public Customer() {
	}
	public Customer(Integer userId, @NotEmpty(message = "UserName cannot be empty") String username,
			@Email(message = "Please check your EmailId") @NotEmpty(message = "Email cannot be empty") String email,
			@Valid String address) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.address = address;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	/*public List<SweetOrder> getSweetOrders() {
		return sweetOrders;
	}

	public void setSweetOrders(List<SweetOrder> sweetOrders) {
		this.sweetOrders = sweetOrders;
	}
*/
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", username=" + username + ", address=" + address + " ]";
	}


}
