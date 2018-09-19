//package com.example.demo;
//
//import com.example.demo.service.DemoService;
//import com.example.demo.service.TestService;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.mockito.invocation.InvocationOnMock;
//import org.mockito.stubbing.Answer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class DemoApplicationTests {
//
//
//    @MockBean
//    private TestService testService;
//
//
//    @Autowired
//    private DemoService demoService;
//
//
//    @Before
//    public void mockTestService() {
//
//        Mockito.doAnswer(new Answer<Object>() {
//            @Override
//            public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
//                System.out.println("haha-haha");
//                return null;
//            }
//        }).when(testService).hello();
//
//        Mockito.when(testService.call(any(String.class))).thenReturn("aaa");
//
//    }
//
//
//    @Test
//    public void contextLoads() {
//        demoService.demo();
//        demoService.test();
//    }
//
//
//
//}
