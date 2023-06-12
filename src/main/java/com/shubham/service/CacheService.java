package com.shubham.service;

public interface CacheService {

  boolean post(Object key, Object value);

  Object get(Object key);

  boolean update(Object key, Object value);

  boolean delete(Object key);
}
