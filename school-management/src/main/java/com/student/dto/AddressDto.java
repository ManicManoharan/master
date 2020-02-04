package com.student.dto;

/**
 * Data transfer object to map values from request
 * @author Manickam
 *
 */
public class AddressDto {

    private long id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	@Override
	public String toString() {
		return "AddressDto [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", country="
				+ country + ", postalCode=" + postalCode + "]";
	}


    

	

}
