package com.twb.oauth;

import com.twb.oauth.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OauthApplicationTests {

	@Autowired
	ArticleService articleService;

	@Test
	public void contextLoads() {

	}

	@Test
	public void  assetService(){
			articleService.selectByPrimaryKey(108);
	}

}
