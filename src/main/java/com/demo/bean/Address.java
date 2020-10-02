	/**
	 * 
	 */
	package com.demo.bean;
	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	
	@Entity
	@Table(name = "address")
	public class Address {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "address_id")
		private Long addressId;
		
		
		@Column(name = "line1")
		private String line1;
		
		@Column(name = "street")
		private String street;
		
		@Column(name = "landmark")
		private String landmark;
		
		@Column(name = "area")
		private String area;
		
		@Column(name = "city")
		private String city;
		
		@Column(name = "state")
		private String state;
		
		@Column(name = "country")
		private String country;
		
		@Column(name = "postal_code")
		private String postalCode;
		
		@Column(name = "full_address")
		private String fullAddress;
		
		@Column(name = "latitudes")
		private double latitudes;
		
		@Column(name = "longitudes")
		private double longitudes ;
		
		
		@Column(name = "type" , nullable=true)
		private String type;


		public Long getAddressId() {
			return addressId;
		}


		public void setAddressId(Long addressId) {
			this.addressId = addressId;
		}


		public String getLine1() {
			return line1;
		}


		public void setLine1(String line1) {
			this.line1 = line1;
		}


		public String getStreet() {
			return street;
		}


		public void setStreet(String street) {
			this.street = street;
		}


		public String getLandmark() {
			return landmark;
		}


		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}


		public String getArea() {
			return area;
		}


		public void setArea(String area) {
			this.area = area;
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


		public String getFullAddress() {
			return fullAddress;
		}


		public void setFullAddress(String fullAddress) {
			this.fullAddress = fullAddress;
		}


		public double getLatitudes() {
			return latitudes;
		}


		public void setLatitudes(double latitudes) {
			this.latitudes = latitudes;
		}


		public double getLongitudes() {
			return longitudes;
		}


		public void setLongitudes(double longitudes) {
			this.longitudes = longitudes;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}
		
	
	}
