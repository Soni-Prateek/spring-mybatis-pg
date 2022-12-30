package com.prateek.mybatis.spring;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = PersistenceAutoConfig.class)
@Profile("test")
public class TestMapperBootUnitTest extends ArticleMapperCommonUnitTest {

}
