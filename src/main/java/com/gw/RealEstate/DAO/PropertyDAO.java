package com.gw.RealEstate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.gw.RealEstate.Entity.PersonalDetails;
import com.gw.RealEstate.Entity.PropertyDetails;
import com.gw.RealEstate.Entity.PropertyFeatures;
import com.gw.RealEstate.Util.hibernateUtil;

@Repository
public class PropertyDAO {

	public List<PersonalDetails> getdetail() {
		// TODO Auto-generated method stub
		Session sess=hibernateUtil.getSessionFactory().openSession();
		sess.beginTransaction();
		List<PersonalDetails> data=sess.createQuery("FROM PersonalDetails").list();
		sess.getTransaction().commit();
		sess.close();
		return data;
	}

	
	public void post(PersonalDetails pd) {
		// TODO Auto-generated method stub
		Session session=hibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		PersonalDetails pd1=new PersonalDetails();
		pd1.setFullname(pd.getFullname());
		pd1.setUsername(pd.getUsername());
		pd1.setEmail(pd.getEmail());
		pd1.setPassword(pd.getPassword());
		pd1.setPhone(pd.getPhone());
		pd1.setStat(pd.getStat());
		session.save(pd1);
		System.out.println("add personal detail successfully");
		session.getTransaction().commit();
		session.close();
	}

	public void update(int id, PersonalDetails personaldetail) {
		// TODO Auto-generated method stub
		Session session=hibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
//		 PersonalDetails personaldet=(PersonalDetails)session.get(PersonalDetails.class, id);
//	      pd.setFullname(pd2.getFullname());
//	      pd.setUsername(pd2.getUsername());
//	      pd.setEmail(pd2.getEmail());
//	      pd.setPassword(pd2.getPassword());
//	      pd.setPhone(pd2.getPhone());
//	      pd.setStat(pd2.getStat());
//	      pd.setPd(pd1);
	      System.out.println("Update Successfully");
	      session.save(personaldetail);
	 
	      session.close();     
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session=hibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		PersonalDetails pd=(PersonalDetails) session.load(PersonalDetails.class, id);
		session.delete(pd);
		System.out.println("Delete Successfully");
		session.getTransaction().commit();
		session.close();
	}


	public List<PropertyDetails> getdetail1() {
		// TODO Auto-generated method stub
		Session sess=hibernateUtil.getSessionFactory().openSession();
		sess.beginTransaction();
		List<PropertyDetails> data=sess.createQuery("FROM PropertyDetails").list();
		sess.getTransaction().commit();
		sess.close();
		return data;
	}
	
	public void post1(PropertyDetails pd1,int id) {
		// TODO Auto-generated method stub
		Session session=hibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		PersonalDetails pd=(PersonalDetails)session.get(PersonalDetails.class, id);
		List<PersonalDetails> listpd=session.createQuery("FROM PersonalDetails").list();
		for(int i=0;i<listpd.size();i++){
			PersonalDetails prop=listpd.get(i);
			if(prop==pd){
				pd1.setPd(pd);
			}
		}
		session.save(pd1);
		System.out.println("add property detail successfully");
		session.getTransaction().commit();
		session.close();
	}


	public void update1(int id, PropertyDetails pd1) {
		// TODO Auto-generated method stub
		Session session=hibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		 PersonalDetails pd=(PersonalDetails)session.get(PersonalDetails.class, id);
		 PropertyDetails pd2=(PropertyDetails)session.get(PropertyDetails.class, id);
//	      pd2=new PropertyDetails(pd1.getTitle(),pd1.getPropStatus(),pd1.getType(),pd1.getPrice(),pd1.getArea(),pd1.getRooms(),
//					pd1.getBathroom(),pd1.getAddress(),pd1.getPinCode(),pd1.getInfo(),pd1.getBuildingage(),pd1.getBedrooms(),pd1.getBathrooms(),
//					pd1.isParking(),pd1.isAc(),pd1.isSit(),pd1.isPool(),pd1.isLaundary(),pd1.isWindow(),pd1.isHeating(),pd1.isAlarm(),pd1.isGym(),
//					pd1.getName(),pd1.getEmail(),pd1.getPhone(),pd);
	      System.out.println("Update Successfully");
	      session.getTransaction().commit();
	      session.close();
	}


	public void delete1(int id) {
		// TODO Auto-generated method stub
		Session session=hibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		PersonalDetails pd=(PersonalDetails) session.load(PersonalDetails.class, id);
		session.delete(pd);
		System.out.println("Delete Successfully");
		session.getTransaction().commit();
		session.close();
	}


	public void addfeature(PropertyFeatures feature, int id) {
		// TODO Auto-generated method stub
		Session session=hibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		PropertyDetails propertydetail=(PropertyDetails)session.get(PropertyDetails.class, id);;
		
		List<PropertyDetails> listpd=session.createQuery("FROM PropertyDetails").list();
		for(int i=0;i<listpd.size();i++){
			PropertyDetails prop=listpd.get(i);
			if(prop==propertydetail){
				feature.setPropertydetails(propertydetail);
			}
		}
		session.save(feature);
		System.out.println("add feature detail successfully");
		session.getTransaction().commit();
		session.close();
	}


	}

