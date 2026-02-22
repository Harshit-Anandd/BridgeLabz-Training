package com.reflections.customproxy;

import java.lang.reflect.*;

public class LoggingHandler implements InvocationHandler {
	private final Object target;

	public LoggingHandler(Object target) {
		this.target = target;
	}

	public static Object createProxy(Object target, Class<?> interfaceType) {
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				new Class<?>[]{interfaceType},
				new LoggingHandler(target)
				);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("[LOG] Executing method: " + method.getName());
		return method.invoke(target, args);
	}
}