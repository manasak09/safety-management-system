package com.DAO;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sample.safetymanagement.system.Requestaction;



@Repository
public interface DAO
 {
	public void logRequestaction(Requestaction action);
	public Requestaction addRequest(int id);
	public List<Requestaction> addAllRequest();
	public boolean reviewRequest(Requestaction action);
	public boolean accessRequest(Requestaction action);


}
	

