package com.prateek.mybatis.spring;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceConfig.class)
@Profile("local")
public class TestMapperUnitTest extends ArticleMapperCommonUnitTest {

}