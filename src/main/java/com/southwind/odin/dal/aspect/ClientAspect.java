package com.southwind.odin.dal.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

@Aspect  
public class ClientAspect {  
	private static final Logger logger = LoggerFactory.getLogger(ClientAspect.class);
	
    @Around("execution(* com.lencee.albatross.dal.soap.client.impl..*.*(..)) || execution(* com.lencee.albatross.dal.impl..*.*(..))")  
    public Object process(ProceedingJoinPoint jp) throws java.lang.Throwable {
    	long startTime = System.currentTimeMillis();
    	String methodInfo = jp.getTarget().getClass().getSimpleName() + "." + jp.getSignature().getName();
    	String paramInfo = JSON.toJSONString(jp.getArgs());
    	logger.info( "调用方法：{}，入参：{}", methodInfo, paramInfo) ;
        Object rvt = jp.proceed();  
        long endTime = System.currentTimeMillis();
        String returnInfo = JSON.toJSONString(rvt);
        long time = endTime - startTime;
        logger.info("调用方法：{}，返回值：{}，耗时：{}ms", methodInfo, returnInfo, time);  
        return rvt;  
    }  
} 