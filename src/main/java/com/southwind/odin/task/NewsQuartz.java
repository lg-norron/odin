
/**
 * 包名：com.southwind.odin.task
 * 文件名：NewsQuartz.java
 * 版本信息：
 * 日期：2014年7月30日-下午5:11:23
 * 
 */
 
package com.southwind.odin.task;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.southwind.common.HtmlUtil;
import com.southwind.odin.dal.mybatis.mapper.NewsMapper;
import com.southwind.odin.dal.mybatis.model.News;
import com.southwind.odin.dal.mybatis.model.NewsExample;
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
	private static final Logger logger = LoggerFactory
			.getLogger(NewsQuartz.class);
	@Resource
	private NewsMapper newsMapper;
	

	@Scheduled(cron = "10 */30 * * * *")
	public void process(){
		logger.info("task run");
		try{
		String urlstr = NewsHelper.createUrlForToutiao();
		System.out.println(urlstr);
			String docstr = null;
				docstr = HtmlUtil.getHtmlBodyStr(urlstr);
			if(StringUtils.isBlank(docstr)){
				logger.error("连接异常");
				return;
			}
			
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
					NewsExample example = new NewsExample();
					example.createCriteria().andTitleEqualTo(tn.getTitle());
					List<News> list = newsMapper.selectByExample(example);
					if(list.size()==0){
						newsMapper.insert(record);
					}
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
			logger.info("task end");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
