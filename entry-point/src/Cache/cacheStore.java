package Cache;

import java.util.concurrent.ConcurrentHashMap;

public class cacheStore {
	
	
	private static ConcurrentHashMap<String,Object> cache = new ConcurrentHashMap<String,Object>();
	
	
	public static Object getFromCache(String key){
		
		
		return cache.get(key);
		
		
	}
	
	public static boolean setCache(String key,Object obj){
		
		cache.put(key, obj);
		return true;
		
	}
	
	public static boolean evict(String key){
		
		cache.remove(key);
		return true;
		
	}
	
	
	
	
	
	
	
	

}
