package com.spring.app.spring_boot_tomcat_rest_crud_layers_params.components;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

@Component
public class CacheMonitor {
    private final CacheManager cacheManager;

    public CacheMonitor(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public void displayCacheContents(String cacheName) {
    	System.out.println("Cache: ");
        Cache cache = cacheManager.getCache(cacheName);
        if (cache != null) {
            System.out.println("Cache: " + cache.getName());
//            for (Object key : cache.getNativeCache().keySet()) {
//                System.out.println("Key: " + key + ", Value: " + cache.get(key).get());
//            }
        } else {
            System.out.println("Cache '" + cacheName + "' not found.");
        }
        

    }
}

	