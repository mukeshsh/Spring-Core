package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String INSERT_EMP_QUERY="INSERT INTO LAYERED-EMPLOYEE VALUES(EID_SEQ.NEXTVAL,?,?,?,?)";
	private DataSource ds;

	public EmployeeDAOImpl(DataSource ds) {
		System.out.println("EmployeeDAOImpl::1-param Constructor");
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get pooled connection
		con=ds.getConnection();
		//prepared Statement
		ps=con.prepareStatement(INSERT_EMP_QUERY);
		//set param values
		ps.setString(1, bo.getEname());
		ps.setString(2, bo.getEadd());
		ps.setFloat(3, bo.getSalary());
		ps.setFloat(4, bo.getGrossSalary());
		ps.setFloat(5, bo.getNetSalary());
		//execute the query
		count=ps.executeUpdate();
		//close jdbc conn
		ps.close();
		con.close();
		return count;
	}

}
