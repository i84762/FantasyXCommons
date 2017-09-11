package com.abc.beans.common;

import java.util.List;

/**
 * 
 * @author amrit
 * 
 */
public interface CoreDao<E extends CoreEntity>
{
	Class<E> getEntity();
	
 	E findByID(long id);	 
 	List<E> getALLEntities();
 	
	long save(E entity);
	void update(E entity);;
}
