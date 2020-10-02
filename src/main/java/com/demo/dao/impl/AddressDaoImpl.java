package com.demo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.demo.bean.Address;
import com.demo.dao.AddressDao;
import com.demo.settingDao.RepositoryDao;

@Repository(value = "AddressDao")
@Transactional
public class AddressDaoImpl extends RepositoryDao implements AddressDao {

	@Override
	public Address getDetail(Long id) throws Exception {
		Address address = null;
		Connection conn = null;
		try {
			conn = getDataSource().getConnection();
			String sql = "SELECT * FROM address where address_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				address = new Address();
				address.setAddressId(rs.getLong("address_id"));
				address.setArea(rs.getString("area"));
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			throw e;
		} finally {
			if (null != conn) {
				conn.close();
			}
		}
		return address;
	}

}
