
/**
 * 包名：com.southwind.common.poi.converts
 * 文件名：ExcelDataConvert.java
 * 版本信息：
 * 日期：2014年7月18日-下午3:16:14
 * 
 */
 
package com.southwind.common.poi.converts;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.southwind.common.DateUtil;
import com.southwind.common.poi.constraints.ExcelTypeCurrency;
import com.southwind.common.poi.constraints.ExcelTypeDateTime;
import com.southwind.common.poi.constraints.ExcelTypeNumber;
import com.southwind.common.poi.constraints.ExcelTypePercentage;


 /**
 * 
 * 类名称：ExcelDataConvert
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年7月18日 下午3:16:14
 * 修改备注：
 * @version 1.0.0
 * 
 */

public class ExcelDataConvert {

	/**
	 * 转化为boolean类型的数据
	 * 
	 * @param value
	 * @return 
	 * 
	 * @exception 
	 * @since  1.0.0
	 */
	public static boolean convertToBoolean(Object value){
		boolean ret = false;
		String setValue = String.valueOf(value);
		if("true".equals(setValue)||"1".equals(setValue)){
			ret = true;
		}
		return ret;
	}

	
	/**
	 * 转化为double类型的数据
	 * 
	 * @param value
	 * @return 
	 * 
	 * @exception 
	 * @since  1.0.0
	 */
	
	public static double convertToDouble(Object value) {
		// TODO Auto-generated method stub
		double ret = 0;
		try {
			String setValue = String.valueOf(value);
			ret = Double.parseDouble(setValue);
		} catch (NumberFormatException e) {
		}
		return ret;
	}


	
	/**
	 * 转化为自定义格式的字符串数据
	 * 
	 * @param setValue
	 * @param field 
	 * @return 
	 * @throws ParseException 
	 * 
	 * @exception 
	 * @since  1.0.0
	 */
	
	public static String convertToDefinedType(String setValue, Field field) throws ParseException {
		// TODO Auto-generated method stub
		ExcelTypeCurrency etc = field.getAnnotation(ExcelTypeCurrency.class);
		ExcelTypeDateTime etd = field.getAnnotation(ExcelTypeDateTime.class);
		ExcelTypeNumber etn = field.getAnnotation(ExcelTypeNumber.class);
		ExcelTypePercentage etp = field.getAnnotation(ExcelTypePercentage.class);
		
		if(null!=etn){
			//格式化数值
			int decimalDigits = etn.decimalDigits();
			boolean thousandSeparator = etn.thousandSeparator();
			BigDecimal bd = new BigDecimal(setValue);
			bd = bd.setScale(decimalDigits, BigDecimal.ROUND_HALF_UP);
			setValue = bd.toString();
			if(thousandSeparator){
				String[] setValues = setValue.split(".");
				char[] cs = setValues[0].toCharArray();
				int length = cs.length;
				
				String temp = "";
				for(int i=length-1,j=1;i>=0;i--,j++){
					temp = cs[i]+temp;
					if(j%3==0&&i!=0){
						temp = ","+temp;
					}
				}
				setValue = temp+"."+setValues[1];
			}
			System.out.println("ExcelTypeNumber:"+setValue);
		}
		
		if(null!=etp){
			//增加百分号
			setValue += "%"; 
			System.out.println("ExcelTypePercentage:"+setValue);
		}
		
		if(null!=etc){
			//增加货币符号
			String currencySymbol = etc.currencySymbol();
			setValue = currencySymbol+setValue;
			System.out.println("ExcelTypeCurrency:"+setValue);
		}
		
		if(null!=etd){
			//格式化时间
			String sourcePattern = etd.sourcePattern();
			String targetPattern = etd.targetPattern();
			if(StringUtils.isNotBlank(sourcePattern)&&StringUtils.isNotBlank(targetPattern)){
				Date date = DateUtil.format(setValue, sourcePattern);
				setValue = DateUtil.format(date, targetPattern);
			}
		}
		return setValue;
	}
}
