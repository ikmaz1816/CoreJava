package oops;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection {
	/*
	 	Reflection is used to break private constructor make it able to create copy of it
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor[] co=PrivateConstructor.class.getDeclaredConstructors();
		
		Constructor construct=co[0];
		construct.canAccess(true);
		
		PrivateConstructor ps1=(PrivateConstructor)construct.newInstance();
		System.out.println(ps1.hashCode());
		//In this way we can create many instances
	}
}
