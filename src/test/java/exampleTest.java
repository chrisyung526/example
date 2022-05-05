package com.springhow.example.helloworld;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloWorldApplication.class)
public class exampleTest {
	
  @Test
  public void testMethod() {
    assertTrue(true);
  }
	
  @Test
  public void contextLoads() {
  }
}
