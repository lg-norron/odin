
/**
 * 包名：com.southwind.odin.api.controller
 * 文件名：NewsController.java
 * 版本信息：
 * 日期：2014年7月31日-下午2:25:24
 * 
 */
 
package com.southwind.odin.api.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.southwind.odin.biz.service.NewsService;
import com.southwind.odin.dal.mybatis.model.News;


 /**
 * 
 * 类名称：NewsController
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年7月31日 下午2:25:24
 * 修改备注：
 * @version 1.0.0
 * 
 */
@Controller
public class NewsController {
	@Resource
	private NewsService newsService;
	
	@RequestMapping("/getlist")
	public @ResponseBody List<News> getNewsList(String mac){
		List<News> list = newsService.getNewsListForClient(mac);
		return list;
	}
}
