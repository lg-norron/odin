/**
 * 包名：com.southwind.odin.biz.service
 * 文件名：NewsService.java
 * 版本信息：
 * 日期：2014年7月31日-下午2:26:24
 * 
 */

package com.southwind.odin.biz.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.southwind.odin.dal.mybatis.mapper.NewsMapper;
import com.southwind.odin.dal.mybatis.mapper.NewspulllogMapper;
import com.southwind.odin.dal.mybatis.model.News;
import com.southwind.odin.dal.mybatis.model.Newspulllog;

/**
 * 
 * 类名称：NewsService 类描述： 创建人：liugang 修改时间：2014年7月31日 下午2:26:24 修改备注：
 * 
 * @version 1.0.0
 * 
 */
@Service
public class NewsService {
	private static final Logger logger = LoggerFactory.getLogger(NewsService.class);
	@Resource
	private NewsMapper newsMapper;
	@Resource
	private NewspulllogMapper newspulllogMapper;

	/**
	 * getNewsListForClient(这里用一句话描述这个方法的作用)
	 * 
	 * @param mac
	 * @return
	 * @return List<News>
	 * @exception
	 * @since 1.0.0
	 */

	public List<News> getNewsListForClient(String mac) {
		// TODO Auto-generated method stub
		int size = 10;
		List<News> list = newsMapper.selectUnreadNewsList(mac, size);
		logger.info("{}获取到新闻数据",mac);
		if (list.size() > 0 && StringUtils.isNotBlank(mac)) {
			List<Newspulllog> logList = new ArrayList<Newspulllog>();
			for (News news : list) {
				Newspulllog newspulllog = new Newspulllog();
				newspulllog.setMac(mac);
				newspulllog.setNewsid(news.getId());
				newspulllog.setPulltime(System.currentTimeMillis() / 1000);
				logList.add(newspulllog);
			}
			newspulllogMapper.insertBatch(logList);
		}
		return list;
	}

}
