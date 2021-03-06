package channel.client.function;

import java.util.HashMap;
import java.util.Map;

import channel.client.dao.ServerDao;
import channel.client.function.common.CommonUtils;
 
public class CustomThreadLocal {
 
    private static Map<Thread, Map<String, Object>> threadMap = new HashMap<Thread, Map<String, Object>>();
    private static ServerDao mServerDao;
    private static CommonUtils mCommonUtils;
 
    public static void add(String pKey, Object pObject) {
    	Map<String, Object> valueMap = threadMap.get(Thread.currentThread());
    	if(valueMap == null){
    		valueMap = new HashMap<String, Object>();
    	}
    	valueMap.put(pKey, pObject);
        threadMap.put(Thread.currentThread(), valueMap);
    }
 
    public static void remove() {
        threadMap.remove(Thread.currentThread());
    }
 
    public static Object get(String pKey) {
    	if(threadMap.get(Thread.currentThread()) != null){
    		return threadMap.get(Thread.currentThread()).get(pKey);
    	}
        
    	return null;
    }

	public static ServerDao getServerDao() {
		return mServerDao;
	}

	public static void setServerDao(ServerDao pServerDao) {
		mServerDao = pServerDao;
	}

	public static CommonUtils getCommonUtils() {
		return mCommonUtils;
	}

	public static void setCommonUtils(CommonUtils pCommonUtils) {
		mCommonUtils = pCommonUtils;
	}

}
