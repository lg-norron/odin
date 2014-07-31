
/**
 * 包名：com.southwind.common
 * 文件名：HtmlUtil.java
 * 版本信息：
 * 日期：2014年7月30日-下午5:27:35
 * 
 */
 
package com.southwind.common;

import java.io.IOException;

import org.jsoup.Connection;
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
		Connection conn = Jsoup.connect(urlstr).timeout(5000).ignoreContentType(true);
		System.out.println(conn.toString());
		Document doc = conn.get();
		String docstr = doc.body().text();
		return docstr;
	}
	
	public static void main(String[] args) throws IOException {
		String url = "http://www.toutiao.com/api/article/recent/?callback=jQuery17206213512956619789_1406771470028&category=__all__&count=20&max_behot_time=1406767870&offset=0&utm_source=toutiao&max_create_time=1406767870&&_=1406771470028";
		System.out.println(getHtmlBodyStr(url));
	}
	
}
