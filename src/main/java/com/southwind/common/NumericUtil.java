
/**
 * 包名：com.southwind.common
 * 文件名：NumericUtil.java
 * 版本信息：
 * 日期：2014年7月25日-下午2:03:06
 * 
 */
 
package com.southwind.common;

import java.math.BigDecimal;


 /**
 * 
 * 类名称：NumericUtil
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年7月25日 下午2:03:06
 * 修改备注：
 * @version 1.0.0
 * 
 */

public class NumericUtil {
	/**
	 * 比较两个浮点数
	 * compareTo(这里用一句话描述这个方法的作用)
	 * @param a
	 * @param b
	 * @return 
	 * 					<li>-1 : a<b </li>
	 * 					<li>0 :  a=b</li>
	 * 					<li>1 :  a>b</li>
	 * 
	 * @exception 
	 * @since  1.0.0
	 */
	public static int compareTo(double a,double b){
		BigDecimal bigForA = new BigDecimal(a);
		BigDecimal bigForB = new BigDecimal(b);
		int ret = bigForA.compareTo(bigForB);
		return ret ;
	}
	/**
	 * 比较两个浮点数字符串
	 * compareTo(这里用一句话描述这个方法的作用)
	 * @param a
	 * @param b
	 * @return 
	 * 					<li>-1 : a<b </li>
	 * 					<li>0 :  a=b</li>
	 * 					<li>1 :  a>b</li>
	 * 
	 * @exception 
	 * @since  1.0.0
	 */
	public static int compareTo(String a,String b){
		BigDecimal bigForA = new BigDecimal(a);
		BigDecimal bigForB = new BigDecimal(b);
		int ret = bigForA.compareTo(bigForB);
		return ret ;
	}
	
	/**
	 * a+b+...
	 * 
	 * @param values 进行累加的动态数组
	 * @return 
	 * @exception 
	 * @since  1.0.0
	 */
	public static double add(double...values){
		BigDecimal bigForRet = new BigDecimal(0);
		for(double value:values){
			BigDecimal bigValue = new BigDecimal(value);
			bigForRet.add(bigValue);
		}
		return bigForRet.doubleValue();
	}
	
	/**
	 * a-b
	 * 
	 * @param a
	 * @param b
	 * @return 
	 * @exception 
	 * @since  1.0.0
	 */
	public static double sub(double a,double b){
		BigDecimal bigForA = new BigDecimal(a);
		BigDecimal bigForB = new BigDecimal(b);
		BigDecimal bigForRet = bigForA.subtract(bigForB);
		return bigForRet.doubleValue();
	}
	
	/**
	 * a*b*...
	 * 
	 * @param values 进行累乘的动态数组
	 * @return 
	 * @exception 
	 * @since  1.0.0
	 */
	public static double multip(double...values){
		BigDecimal bigForRet = new BigDecimal(0);
		for(double value:values){
			BigDecimal bigValue = new BigDecimal(value);
			bigForRet.multiply(bigValue);
		}
		return bigForRet.doubleValue();
	}
	
	/**
	 * a/b
	 * 
	 * @param a
	 * @param b
	 * @return 
	 * @exception 
	 * @since  1.0.0
	 */
	public static double division(double a,double b){
		BigDecimal bigForA = new BigDecimal(a);
		BigDecimal bigForB = new BigDecimal(b);
		BigDecimal bigForRet = bigForA.divide(bigForB);
		return bigForRet.doubleValue();
	}
	
	/**
	 * 将a的小数点左移n位
	 * 
	 * @param a
	 * @param n
	 * @return 
	 * @exception 
	 * @since  1.0.0
	 */
	public static double movePointLeft(double a,int n){
		BigDecimal bigForA = new BigDecimal(a);
		bigForA = bigForA.movePointLeft(n);
		return bigForA.doubleValue();
	}
	
	/**
	 * 将a的小数点右移n位
	 * 
	 * @param a
	 * @param n
	 * @return 
	 * @exception 
	 * @since  1.0.0
	 */
	public static double movePointRight(double a,int n){
		BigDecimal bigForA = new BigDecimal(a);
		bigForA = bigForA.movePointRight(n);
		return bigForA.doubleValue();
	}
	
}
