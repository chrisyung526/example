package com.springhow.example.helloworld;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class exampleTest {
	
  @Test
  public void testMethod() {
    assertTrue(true);
  }
	
  @Test
  public void helloWorld() {
	HelloWorldApplication app = new HelloWorldApplication();
	assertTrue(app.helloWorld()=="Hello World! Updated by Chris Yung.");	  
  }
	
  @Test
  public void contextLoads() {
  }
}
