package com.nt.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import javax.sql.DataSource;
	import com.nt.bo.StudentBO;

    public class StudentDAOImpl implements StudentDAO {
	private static final String STUDENT_INSERT_QUERY="INSERT INTO LAYERED_STUDENT VALUES(?,?,?,?,?,?)";
	private DataSource ds;

	public StudentDAOImpl(DataSource ds) {
	System.out.println("StudentDAOImpl:1-param constructor");
	   this.ds = ds;
	}

	
	@Override
	public int insert(StudentBO bo) throws Exception {
     Connection con=null;
     PreparedStatement ps=null;
     int count=0;
		//get pooled connection
     con=ds.getConnection();
     //create preparedStatement Query
     ps=con.prepareStatement(STUDENT_INSERT_QUERY);
     //set param values
	     ps.setInt(1, bo.getSno());
	     ps.setString(2, bo.getSname());
	     ps.setString(3, bo.getSaddr());
	     ps.setInt(4, bo.getTotal());
	     ps.setFloat(5, bo.getAvg());
	     ps.setString(6, bo.getResult());
     //execute the query
     count=ps.executeUpdate();
     //close jdbc objects
     ps.close();
     con.close();
	 return count;
	}

}
