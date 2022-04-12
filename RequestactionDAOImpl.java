package dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Requestaction;

@Component
public class RequestactionDAOImpl implements  RequestactionDAOImpl{

		SessionFactory sessionFactory;

		public void logRequest(Requestaction action) {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
			
			session.getTransaction().begin();
			session.save(action);
			session.flush();
			session.getTransaction().commit();
			session.close();
			
		}

		@Override
		public Requestaction addRequest(int id) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.openSession();
			Requestaction action=session.get(Requestaction.class, id);
			return action;
			
		}

		@Override
		public List<Requestaction> addAllRequest() {
			// TODO Auto-generated method stub
			Session session=sessionFactory.openSession();
			List<Requestaction> personlist=session.createQuery("select i from Requestaction i").list();
			return personlist;
		}

		@Override
		public boolean reviewRequest(Requestaction action) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.openSession();
			session.getTransaction().begin();
			session.update(session);
			session.flush();
			session.getTransaction().commit();
			session.close();
			return true;
		}

		@Override
		public boolean accessRequest(Requestaction action) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.openSession();
			session.getTransaction().begin();
			session.update(session);
			session.flush();
			session.getTransaction().commit();
			session.close();
			return true;
		}

	}
	

}
