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
  private HelloWorldApplication app;

  @BeforeClass
  public void setup() {
	app = new HelloWorldApplication();
  }
	
  @Test
  public void testMethod() {
    assertTrue(true);
  }
	
  @Test
  public void helloWorld() {
	String result = app.helloWorld();
	assertEquals("Hello World! Updated by Chris Yung.", result);
  }
	
  @Test
  public void contextLoads() {
  }
}
