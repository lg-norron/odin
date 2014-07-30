
/**
 * 包名：com.southwind.odin.task
 * 文件名：NewsQuartz.java
 * 版本信息：
 * 日期：2014年7月30日-下午5:11:23
 * 
 */
 
package com.southwind.odin.task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.southwind.common.HtmlUtil;
import com.southwind.odin.dal.mybatis.mapper.NewsMapper;
import com.southwind.odin.dal.mybatis.model.News;
import com.southwind.odin.helper.NewsHelper;
import com.southwind.odin.helper.model.ToutiaoMsg;
import com.southwind.odin.helper.model.ToutiaoNews;


 /**
 * 
 * 类名称：NewsQuartz
 * 类描述：
 * 创建人：liugang
 * 修改时间：2014年7月30日 下午5:11:23
 * 修改备注：
 * @version 1.0.0
 * 
 */
@Service
public class NewsQuartz {
	
	@Resource
	private NewsMapper newsMapper;
	
	@Scheduled(cron = "10 53/1 15 * * *")
	public void process(){
		System.out.println("task run");
		String urlstr = NewsHelper.createUrlForToutiao();
		System.out.println(urlstr);
		try {
			String docstr = HtmlUtil.getHtmlBodyStr(urlstr);
			String jsonstr = NewsHelper.getJsonMsg(docstr);
			System.out.println(jsonstr);
			ToutiaoMsg tm = JSON.parseObject(jsonstr, ToutiaoMsg.class);
			List<ToutiaoNews> tnlist = tm.getData();
			
			List<News> newsList = new ArrayList<News>();
			for(ToutiaoNews tn:tnlist){
				
				News record = new News();
				
				record.setTitle(tn.getTitle());
				record.setTag(tn.getTag());
				record.setUrl(tn.getUrl());
				record.setSource(tn.getSource());
				record.setPublishtime(Long.valueOf(tn.getPublish_time()));
				
				newsList.add(record);
				try {
					newsMapper.insert(record);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
//			try {
//				//批量入库
//				newsMapper.insertBatch(newsList);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("task end");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
