
/**
 * 包名：com.southwind.common
 * 文件名：HtmlUtil.java
 * 版本信息：
 * 日期：2014年7月30日-下午5:27:35
 * 
 */
 
package com.southwind.common;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


 /**
 * 
 * 类名称：HtmlUtil
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年7月30日 下午5:27:35
 * 修改备注：
 * @version 1.0.0
 * 
 */

public class HtmlUtil {

	/**
	 * 获取请求页面BODY内容
	 * @param urlstr
	 * @return
	 * @throws IOException
	 */
	public static String getHtmlBodyStr(String urlstr) throws IOException{
		Document doc = Jsoup.connect(urlstr).ignoreContentType(true).get();
		String docstr = doc.body().text();
		return docstr;
	}
	
}
