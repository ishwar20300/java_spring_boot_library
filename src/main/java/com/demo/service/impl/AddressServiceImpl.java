package com.demo.service.impl;

import org.springframework.stereotype.Service;

import com.demo.bean.Address;
import com.demo.dao.AddressDao;
import com.demo.service.AddressService;
import com.demo.settingDao.RepositoryDao;

@Service
public class AddressServiceImpl implements AddressService{

	private final AddressDao addressDao;
	
	private final RepositoryDao repositoryDao;
	
	
	public AddressServiceImpl(AddressDao addressDao, RepositoryDao repositoryDao) {
		super();
		this.addressDao = addressDao;
		this.repositoryDao = repositoryDao;
	}

	@Override
	public void add(Address address) throws Exception {
		repositoryDao.addnew(address);
	}

	@Override
	public Address getDetail(Long id) throws Exception {
		return addressDao.getDetail(id);
	}
	

}
