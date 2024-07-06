package com.model3;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class Test {
	public static void main(String[] arsg)
	{
		Transaction tr=null;
		try(Session ses=HBUtil.getSessionFactory().openSession())
		{
			tr=ses.beginTransaction();
			Employee e=new Employee();
			e.setName("Dhinesh");
			e.setEmail("agdhinesh61@gmail.com");
			Address a=new Address("vsb","covai road", "karur", "tamilnadu",610001);
		    e.setAddr(a);
		    a.setEmp(e);
		    ses.persist(e);
		    tr.commit();
		    ses.close();
		    
		}
		catch(Exception e ) {e.printStackTrace();}

	}

}
