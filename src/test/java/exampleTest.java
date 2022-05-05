package com.springhow.example.helloworld;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

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
  public void main() {
    HelloWorldApplication.main(new String[] {});
    assertTrue(true);
  }
}
