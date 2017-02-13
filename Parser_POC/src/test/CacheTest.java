package test;

import cache.GlobalCacheManager;
import org.ehcache.Cache;
import org.ehcache.CacheManager;

/**
 * Created by vakamat on 2/9/2017.
 */
public class CacheTest {

    public static void main(String[] args){
        CacheManager _cacheManager = GlobalCacheManager.getCacheManager();
        _cacheManager.init();
        Cache cache = _cacheManager.getCache("modulo_cache", String.class, String.class);

        cache.put("k1","hello");
        cache.put("k2","hi");
        System.out.println(cache.get("k1"));
        _cacheManager.close();
    }
}
