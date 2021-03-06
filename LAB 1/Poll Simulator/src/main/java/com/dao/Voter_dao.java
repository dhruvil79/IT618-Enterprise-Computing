package com.dao;
import java.util.*;
import java.util.stream.Collectors;

import com.bean.Voter_bean;

public class Voter_dao {
	static Set<Integer> si = new HashSet<>();
	static Map<String,Integer> hv;
	static Map<String,Integer> tm;
	public static boolean Voter_Id(Voter_bean v)
	{
		boolean flag=false;
		try {
			try{
				if(si.contains(v.getVoter_Number()))
				{
					return false;
				}
				else
				{
					si.add(v.getVoter_Number());
					flag=true;
				}
				
			}
			catch(Exception ex)
			{ex.printStackTrace();}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	 public static<K> void increment(Map<K, Integer> map, K key)
	    {
		 	
		   Integer count = map.get(key);
	        if (count == null) {
	            map.put(key, 1);
	        }
	        else {
	            map.put(key, count + 1);
	        } 
	    }
	 
	public static void Vote_Count(String name)
	{
        increment(Candidate_dao.mp, name);
	}
	
	
	public static <K, V> K getKeyFromValue(Map<K, V> map, Object value) 
    {
    
    //get all map keys using keySet method
    Set<K> keys = map.keySet();
    
    //iterate all keys
    for(K key : keys){
        
        //if maps value for the current key matches, return the key
        if( map.get(key).equals(value) ){
            return key;
        }            
    }
    
    //if no values matches, return null
    return null;        
}
	
	public static Map<String,Integer> High_Vote_Candidate()
	{
		hv = new HashMap<>();
		int value_ans=(Collections.max(Candidate_dao.mp.values()));
			String key_ans=getKeyFromValue(Candidate_dao.mp,value_ans);
		
		int maxValueInMap=(Collections.max(Candidate_dao.mp.values()));  // This will return max value in the HashMap
        int max2=0;
        for (Map.Entry<String, Integer> entry : Candidate_dao.mp.entrySet())
        {  
            if (entry.getValue()<maxValueInMap) {
                if(max2<entry.getValue())
                {
                    max2=entry.getValue();
                }     
            }
        }
        String ans=getKeyFromValue(Candidate_dao.mp,max2);
        hv.put(ans,Candidate_dao.mp.get(ans));
        hv.put(key_ans,value_ans);
        	
		return hv;
	}
}
