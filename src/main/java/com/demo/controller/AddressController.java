package com.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Address;
import com.demo.response.Response;
import com.demo.service.AddressService;

@RestController
@RequestMapping(value = "/v1/address")
public class AddressController {

	private final AddressService addressService;

	public AddressController(AddressService addressService) {
		super();
		this.addressService = addressService;
	}

	@CrossOrigin
	@PostMapping("/add")
	public Response addDishToCart(@RequestBody Address address) {
		Response response = new Response();
		try {
			addressService.add(address);
			response.setStatus(200);
			response.setMessage("Success");
			return response;
		} catch (Exception e) {
			response.setStatus(500);
			response.setMessage("Internal Error");
			return response;
		}
	}

	@CrossOrigin
	@GetMapping("/{addressId}")
	public Response addDishToCart(@PathVariable("addressId") Long addressId) {
		Response response = new Response();
		try {
			response.setResult(addressService.getDetail(addressId));
			response.setStatus(200);
			response.setMessage("Success");
			return response;
		} catch (Exception e) {
			response.setStatus(500);
			response.setMessage("Internal Error");
			return response;
		}
	}
	
	@CrossOrigin
	@DeleteMapping("/{addressId}")
	public Response deleteObject(@PathVariable("addressId") Long addressId) {
		Response response = new Response();
		try {
			addressService.delete(addressId);
			response.setStatus(200);
			response.setMessage("Success");
			return response;
		} catch (Exception e) {
			response.setStatus(500);
			response.setMessage("Internal Error");
			return response;
		}
	}

}
