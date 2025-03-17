package com.learning.LearningHibernateWithSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyMessage implements CommandLineRunner
{
	@Autowired
	private JdbcTemplate jt;
	@Override
	public void run(String... args) throws Exception 
	{
		//		String sql="insert into student values(?,?,?)";
		//		int count=jt.update(sql,1001,"Mayank1","Patiala");
		//		System.out.println("row inserted" + count);

		//		String sql="update student set name=?,address=? where studid=?";
		//		int count=jt.update(sql,"Govind","Mumbai",11);
		//		System.out.println("row updated"+count);

		String sql="delete from student where studid=?";
		int count=jt.update(sql,11);
		System.out.println("row deleted"+count);

	}
}