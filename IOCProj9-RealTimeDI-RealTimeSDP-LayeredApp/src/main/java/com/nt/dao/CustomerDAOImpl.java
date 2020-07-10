package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO {
      private static final String INSERT_CUSTOMER_QUERY="INSERT INTO LAYERED_CUSTOMER VALUES(?,?,?,?,?)";
      private DataSource ds;
      
	public CustomerDAOImpl(DataSource ds) {
		System.out.println("CustomerDAOImpl::!-param Constructor");
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		System.out.println("CustomerDAOImpl.insert()");
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get jdbc connection pool obj
		con=ds.getConnection();
		//create Jdbc preparedStatement Query
		ps=con.prepareStatement(INSERT_CUSTOMER_QUERY);
		//set values to query param
		ps.setInt(1, bo.getCustNo());
		ps.setString(2, bo.getCustName());
		ps.setString(3, bo.getCustAddr());
		ps.setFloat(4, bo.getpAmt());
		ps.setFloat(5, bo.getIntrAmt());
		//execute sql query
		count=ps.executeUpdate();
		ps.close();
		con.close();
		return count;
		//close conn
	
		
	}
	
}
