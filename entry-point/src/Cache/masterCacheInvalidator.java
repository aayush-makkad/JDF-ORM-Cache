package Cache;

public class masterCacheInvalidator {
	
	
	
	public static  boolean Invalidate(String key){
		
		
		
		cacheStore.evict(key);
		return true;
		
		
	}
	

}
