package ren.draven.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/**
 * 切面
 * @author dravenxiaokai
 *
 */
@Aspect
public class MyInterceptor {
	@Pointcut("execution(* ren.draven.service.impl.PersonServiceBean.*(..))")
	private void anyMethod() {}// 声明一个切入点
	
	@Before("anyMethod()")
	public void doAccessCheck() {
		System.out.println("前置通知");
	}
}