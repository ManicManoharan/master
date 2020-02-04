package com.student.dto;

import java.sql.Date;

/**
 * Data transfer object to map values from request
 * 
 * @author Manickam
 *
 */
public class StudentDto {

	private long rollNo;
	private String firstName;
	private String lastName;
	private Date dob;
	private String gender;
	private String standard;
	private AddressDto address;
	private Integer phoneNo;

	public long getRollNo() {
		return rollNo;
	}

	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "StudentDto [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", standard=" + standard + ", address=" + address + ", phoneNo=" + phoneNo
				+ "]";
	}

}
