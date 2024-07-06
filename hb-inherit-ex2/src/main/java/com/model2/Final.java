package com.model2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Final {
  public static void main(String[] args)
  {
	  try(Session ses=HBUtil.getSesFactory().openSession())
			  {
		           Transaction tr = null;
		           tr=ses.beginTransaction();
		           Employee e1=new Employee("Dhinesh");
		           RegEmp2 e2=new RegEmp2(5500,500,"ramesh");
		           Trainee2 e3=new Trainee2(200, "6 months", "DHINESH");
		           
		           ses.persist(e1);
		           ses.persist(e2);
		           ses.persist(e3);
		           tr.commit();
		           ses.close();
			  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  
}
