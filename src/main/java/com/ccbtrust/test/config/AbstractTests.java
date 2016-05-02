package com.ccbtrust.test.config;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ApplicationTestConfig.class})
@WebAppConfiguration
public class AbstractTests {
	protected final Logger logger = LoggerFactory.getLogger(getClass());
}
