package Cache;

public class updateDaemon extends Thread {
	
	private String CacheKey = null;
	
	updateDaemon(String key){
		
		setDaemon(true);
		this.CacheKey = key;
		
		
	}
	
	public void run(){
		
		masterCacheInvalidator.Invalidate(CacheKey);
		
		
	}
	

}
