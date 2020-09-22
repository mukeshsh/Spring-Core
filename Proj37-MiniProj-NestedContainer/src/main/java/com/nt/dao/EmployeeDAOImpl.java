package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public  class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_PROJ_DETAILS_BY_LOC="SELECT PROJID,COMPANY,COST,LOCATION,PROJNAME,TEAMSIZE FROM PROJECT WHERE LOCATION IN(?,?,?) ORDER BY LOCATION";

	private DataSource ds;

	public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public List<EmployeeBO> getAllEmpsByLoc(String loc1, String loc2, String loc3) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<EmployeeBO> listBO=null;
		EmployeeBO bo=null;
		try {
			//get pooled jdbc connection
			con=ds.getConnection();
			//create preparedStatement object
			ps=con.prepareStatement(GET_PROJ_DETAILS_BY_LOC);
			//Set values to queries param
			ps.setString(1, loc1);
			ps.setString(2, loc2);
			ps.setString(3, loc3);
			//execute the query
			rs=ps.executeQuery();
			//convert Result set object to listBO records
			listBO=new ArrayList();
			while(rs.next()) {
				//copy each records of resultset object to bo object
				bo=new EmployeeBO();
				bo.setProjId(rs.getInt(1));
				bo.setCompany(rs.getString(2));
				bo.setCost(rs.getFloat(3));
				bo.setLocation(rs.getString(4));
				bo.setProjName(rs.getString(5));
				bo.setTeamSize(rs.getInt(6));
				//add each obj of bo class to List Collection
				listBO.add(bo);
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}
		try {
			if(ps!=null)
				ps.close();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		try {
			if(con!=null)
				con.close();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		return listBO;

	}

}
