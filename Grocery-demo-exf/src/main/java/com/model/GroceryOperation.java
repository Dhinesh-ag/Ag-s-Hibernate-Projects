package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class GroceryOperation {
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		SessionFactory sessionFactory=HbUtil.getSesFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Grocery.class);
		List<Grocery>empList=criteria.list();
		for(Grocery emp:empList)
		{
			System.out.println("SNO="+emp.getSno()+emp.getPname()+emp.getQuantity());
		}
		criteria=session.createCriteria(Grocery.class).add(Restrictions.eq("id", new Integer(2)));
		Grocery emp=(Grocery) criteria.uniqueResult();
		System.out.println("Name="+emp.getPname() );
		empList=session.createCriteria(Grocery.class)
				.addOrder(Order.desc("sno"))
				.setFirstResult(0)
				.setMaxResults(2)
				.list();
		
		for(Grocery emp4: empList)
		{
			System.out.println("Paginated Employees"+emp4.getSno()+ emp4.getPname());
		}
		empList=session.createCriteria(Grocery.class)
				.add(Restrictions.like("name","%m%"))
				.list();
		for(Grocery emp4:empList)
		{
			System.out.println("Employee having 'm' in name::"+emp4.getPname());
		}
		Criteria c=session.createCriteria(Grocery.class);
		c.setProjection(Projections.rowCount());
		empList=c.add(Restrictions.like("name","%m%")).list();
		System.out.println("Number of Employees wiht m in name="+empList.getFirst());
		Criteria d=session.createCriteria(Grocery.class);
		empList=d.setProjection(Projections.sum("salary")).list();
		System.out.println("Sum fo Salaries="+empList.getFirst());
		tx.commit();
		sessionFactory.close();
		}
   }

		
		
		
		
		
	