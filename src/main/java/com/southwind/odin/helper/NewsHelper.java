
/**
 * 包名：com.southwind.odin.helper
 * 文件名：NewsHelper.java
 * 版本信息：
 * 日期：2014年7月30日-下午5:30:59
 * 
 */
 
package com.southwind.odin.helper;


 /**
 * 
 * 类名称：NewsHelper
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年7月30日 下午5:30:59
 * 修改备注：
 * @version 1.0.0
 * 
 */

public class NewsHelper {

	/**
	 * 截取JSON字符串
	 * @param rjs
	 * @return
	 */
	public static String getJsonMsg(String rjs){
		int start = rjs.indexOf("(")+1;
		int end = rjs.length()-1;
		String ret = rjs.substring(start, end);
		return ret;
	}
	
	/**
	 * 构建请求链接
	 * @return
	 */
	public static String createUrlForToutiao() {
		// TODO Auto-generated method stub
		long curl = System.currentTimeMillis();
		String curt = ""+curl;
		long prel = curl-3600*1000;
		
		String jqseq = "1720"+SHAUtil.sha1(curt).substring(0, 16);
		StringBuffer urlstr = new StringBuffer("http://www.toutiao.com/api/article/recent/?");
		urlstr.append("callback=jQuery").append(jqseq).append("_").append(curt);
		urlstr.append("&category=__all__&count=20");
		urlstr.append("&max_behot_time=").append(prel/1000);
		urlstr.append("&offset=0&utm_source=toutiao");
		urlstr.append("&max_create_time=").append(prel/1000);
		urlstr.append("&&_=").append(curl);
		
		return urlstr.toString();
	}
	
	public static String genterRandomNum(){
		String ret = "1720";
	}
}
