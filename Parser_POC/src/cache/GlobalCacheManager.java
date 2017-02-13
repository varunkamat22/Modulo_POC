package cache;

import org.ehcache.CacheManager;
import org.ehcache.config.Configuration;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.xml.XmlConfiguration;

import java.net.URL;

/**
 * Created by vakamat on 2/9/2017.
 */
public class GlobalCacheManager {

    private static CacheManager cacheManager;

    public static CacheManager getCacheManager(){
        if(cacheManager == null){
            final URL myUrl = GlobalCacheManager.class.getResource("cache-config.xml");
            Configuration xmlConfig = new XmlConfiguration(myUrl);
            cacheManager = CacheManagerBuilder.newCacheManager(xmlConfig);
        }
        return cacheManager;
    }
}
