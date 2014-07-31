package com.southwind.odin.biz.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
//@Aspect注解表示:申明这是一个切面类
@Aspect  
public class ServiceAspect {  
	private static final Logger logger = LoggerFactory.getLogger(ServiceAspect.class);
	
    @Around("execution(* com.southwind.odin.biz.impl.*.*(..))")  
    public Object process(ProceedingJoinPoint jp) throws java.lang.Throwable {
    	Object rvt = null;
			long startTime = System.currentTimeMillis();
			String methodInfo = jp.getTarget().getClass().getSimpleName() + "."+ jp.getSignature().getName();
			String paramInfo = JSON.toJSONString(jp.getArgs());
			logger.info("调用方法：{}，入参：{}", methodInfo, paramInfo);
			rvt = jp.proceed();
			long endTime = System.currentTimeMillis();
			String returnInfo = JSON.toJSONString(rvt);
			long time = endTime - startTime;
			logger.info("调用方法：{}，返回值：{}，耗时：{}ms", methodInfo, returnInfo, time);
			logger.info("-----------------------------------------------------------------------------------------");
			return rvt;
    }
} 