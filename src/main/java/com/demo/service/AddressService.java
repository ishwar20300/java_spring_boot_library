package com.demo.service;

import com.demo.bean.Address;

public interface AddressService {

	
	public void add(Address address)throws Exception;
	
	public Address getDetail(Long id)throws Exception;
	
	public void delete(Long id) throws Exception;
	
}
