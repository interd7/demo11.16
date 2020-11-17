package com.gengdan.demo.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * @author ShiJiaWei
 * @version 1.0
 * @date 2020/11/17 09:49
 */
@Configuration
@EnableCaching
public class RedisCacheConfig extends CachingConfigurerSupport {
}
