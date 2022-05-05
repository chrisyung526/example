package com.springhow.example.helloworld;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HelloWorldApplication.class)
public class exampleTest {
  private HelloWorldApplication app;

  @Before
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
