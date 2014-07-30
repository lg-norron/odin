/**   
 * @Title: HttpClientUtil.java 
 * @Package com.southwind.sso.utils 
 * @Description: 
 * @author liugang   
 * @date 2014-6-23 下午3:18:38   
 */
package com.southwind.common;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Set;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.util.URIUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName: HttpClientUtil
 * @Description:
 * @author liugang
 * @date 2014-6-23 下午3:18:38
 */
public class HttpClientUtil {


	/**
	 * 使用POST方式调用HTTP请求
	 * @param <T>
	 * 
	 * @param url 请求地址的URL
	 * @param paramMap 请求的参数列表，必须转化为字符串的键值对
	 * @return 返回响应的结果字符串
	 * 
	 * @exception
	 * @since 1.0.0
	 */
	public static String post(String url, Map<String, String> paramMap) {
		String ret = null;
		HttpClient httpclient = new HttpClient();
		PostMethod postMethod = null;
		try {
			// 创建post方法
			postMethod = new PostMethod(url);

			// 封装请求参数
			Set<String> keys = paramMap.keySet();
			for (String key : keys) {
				String value = paramMap.get(key);
				postMethod.setParameter(key, value);
			}

			int statusCode = httpclient.executeMethod(postMethod);
			if (statusCode != HttpStatus.SC_OK) {
				System.err.println("Method failed: "
						+ postMethod.getStatusLine());
			}
			byte[] resp = postMethod.getResponseBody();
			ret = new String(resp, "UTF-8");
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			postMethod.releaseConnection();
		}
		return ret;
	}

	/**
	 * 使用Get方式调用HTTP请求
	 * @param <T>
	 * 
	 * @param url 请求地址的URL
	 * @param paramMap 请求的参数列表，必须转化为字符串的键值对
	 * @return 返回响应的结果字符串
	 * 
	 * @exception
	 * @since 1.0.0
	 */
	public static String get(String url, Map<String, String> paramMap) {
		String ret = null;
		HttpClient httpclient = new HttpClient();
		GetMethod getMethod = null;
		try {
			getMethod = new GetMethod(url);
			// 封装请求参数
			String queryString = "";
			Set<String> keys = paramMap.keySet();
			for (String key : keys) {
				String value = paramMap.get(key);
				queryString += "&"+key+"="+value;
			}
			if(StringUtils.isNotBlank(queryString)){
				queryString = queryString.substring(1);
				getMethod.setQueryString(URIUtil.encodeQuery(queryString));
			}
			int statusCode = httpclient.executeMethod(getMethod);
			if (statusCode != HttpStatus.SC_OK) {
				System.err.println("Method failed: "
						+ getMethod.getStatusLine());
			}
			byte[] resp = getMethod.getResponseBody();
			ret = new String(resp, "UTF-8");
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;

	}

}
