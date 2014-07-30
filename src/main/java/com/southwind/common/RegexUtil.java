/**
 * 包名：com.southwind.common
 * 文件名：RegexUtil.java
 * 版本信息：
 * 日期：2014年7月14日-下午2:53:04
 * 
 */

package com.southwind.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 类名称：RegexUtil
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年7月14日 下午2:53:04
 * 修改备注：
 * 
 * @version 1.0.0
 * 
 */

public class RegexUtil {
	/**
	 * 时间验证：格式HH:mm:ss
	 */
	public static final String TIME_FORMAT_PATTERN = "^(?:0?[0-9]|1[0-9]|2[0-3])(:?)(?:0?[0-9]|[1-5][0-9])(:?)(?:0?[0-9]|[1-5][0-9])$";
	/**
	 * 日期验证：
	 * 年份0001-9999，格式yyyy-MM-dd或yyyy-M-d，连字符可以没有或是“-”、“/”、“.”之一
	 */
	public static final String DATE_FORMAT_PATTERN = "^(?:(?!0000)[0-9]{4}([-/.]?)(?:(?:0?[1-9]|1[0-2])([-/.]?)(?:0?[1-9]|1[0-9]|2[0-8])|(?:0?[13-9]|1[0-2])([-/.]?)(?:29|30)|(?:0?[13578]|1[02])([-/.]?)31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)([-/.]?)0?2([-/.]?)29)$";

	/**
	 * 日期时间验证：
	 * 格式yyyy-MM-dd HH:mm:ss 或yyyy-M-d HH:mm:ss，连字符可以没有或是“-”、“/”、“.”之一
	 */
	public static final String DTAETIME_FORMAT_PATTERN = "^(?:(?!0000)[0-9]{4}([-/.]?)(?:(?:0?[1-9]|1[0-2])([-/.]?)(?:0?[1-9]|1[0-9]|2[0-8])|(?:0?[13-9]|1[0-2])([-/.]?)(?:29|30)|(?:0?[13578]|1[02])([-/.]?)31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)([-/.]?)0?2([-/.]?)29)(\\s*)(?:0?[0-9]|1[0-9]|2[0-3])(:?)(?:0?[0-9]|[1-5][0-9])(:?)(?:0?[0-9]|[1-5][0-9])$";

	/**
	 * 日期模式验证：格式yyyy-MM-dd 连字符可以没有或是“-”、“/”、“.”之一
	 */
	public static final String DATE_FORMAT_MODE = "^(?:y{4}([-/.]?)M{2}([-/.]?)d{2})$";

	/**
	 * 时间模式验证：格式HH:mm:ss连字符可以没有或是“-”、“/”、“.”之一
	 */
	public static final String TIME_FORMAT_MODE = "^(?:(h{2}|H{2})(:?)m{2}(:?)s{2})$";

	/**
	 * 日期时间模式验证：格式yyyy-MM-dd HH:mm:ss连字符可以没有或是“-”、“/”、“.”之一
	 */
	public static final String DATETIME_FORMAT_MODE = "^(?:y{4}([-/.]?)M{2}([-/.]?)d{2})(\\s*)(?:(h{2}|H{2})(:?)m{2}(:?)s{2})$";
	
//======================================测试区================================================================
	
	public static final String TEST = TIME_FORMAT_PATTERN;

	public static void main(String[] args) {

		String testMatcheStr = "112453";
		String patternStr = TEST;
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(testMatcheStr);
		System.out.println(matcher.matches());
		// System.out.println(testMatcheStr.matches(DATE_FORMAT_PATTERN));
	}
}
