package com.dao;

import java.util.*;
import com.bean.Candidate_bean;

public class Candidate_dao {
	public static List<String> ls = new ArrayList<>();
	public static Map<String,Integer> mp=new HashMap<>();
	public static boolean save(Candidate_bean c)
	{
		boolean flag=false;
		//p1=new Pair<>(c.getCandidate_name(),0);
		try {
			try{
				ls.add(c.getCandidate_name());
				//mp.put(c.getCandidate_name(),0);
				flag=true;
			}
			catch(Exception ex)
			{ex.printStackTrace();}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	
	public static List<String> getAllCandidateList(){
		//List<Emp> list=new ArrayList<Emp>();
		return ls;
	}

}
