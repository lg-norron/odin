package com.southwind.common;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.net.util.Base64;

/**
 * 常用加密算法工具类
 * 
 * @author cq
 */
public class EncryptionUtil {

	/**
	 * 用MD5算法进行加密
	 * 
	 * @param str 需要加密的字符串
	 * @return MD5加密后的结果
	 */
	public static String encodeMD5String(String str) {
		return encode(str, "MD5");
	}

	/**
	 * 用SHA算法进行加密
	 * 
	 * @param str 需要加密的字符串
	 * @return SHA加密后的结果
	 */
	public static String encodeSHAString(String str) {
		return encode(str, "SHA");
	}

	/**
	 * 用base64算法进行加密
	 * 
	 * @param str 需要加密的字符串
	 * @return base64加密后的结果
	 */
	public static String encodeBase64String(String str) {
		String result = null;
		if(str!=null){
			result = Base64.encodeBase64String(str.getBytes());
		}
		return result;
	}

	/**
	 * 用base64算法进行解密
	 * 
	 * @param str 需要解密的字符串
	 * @return base64解密后的结果
	 * @throws IOException
	 */
	public static String getFromBase64(String s) {
		String result = null;
		if (s != null) {
			try {
				byte[] b = Base64.decodeBase64(s.getBytes());
				result = new String(b, "utf-8");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 选用指定的加密方法加密字符串
	 * 
	 * @param str 目标字符串
	 * @param method 加密方法名（MD2、MD5、SHA-1、 SHA-256、 SHA-384、 SHA-512）
	 * @return 返回加密后的数字字符串
	 * 
	 * @exception
	 * @since 1.0.0
	 */
	private static String encode(String str, String method) {
		MessageDigest md = null;
		String dstr = null;
		try {
			md = MessageDigest.getInstance(method);
			md.update(str.getBytes());
			dstr = new BigInteger(1, md.digest()).toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return dstr;
	}
	

}
