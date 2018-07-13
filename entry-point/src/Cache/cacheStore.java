package Cache;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class cacheStore {
	
	/*
	 * Master cache map
	 */
	public static ConcurrentHashMap<String,ArrayList<Object>> cache = new ConcurrentHashMap<String,ArrayList<Object>>();
	
	
	public static ArrayList<Object> getFromCache(String key){
		
		
		return cache.get(key);
		
		
	}
	
	public static boolean setCache(String key,ArrayList<Object> obj){
		
		cache.put(key,obj);
		return true;
		
	}
	
	public static boolean evict(String key){
		
		cache.remove(key);
		return true;
		
	}
	
	
	
	
	
	
	
	

}
