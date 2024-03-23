package tests;

import org.junit.jupiter.api.*;

public class JUnit5Examples {

    @BeforeAll
    static void beforeAll(){
        System.out.println("+++++++ Started beforeAll");
    }

    @AfterAll
    static void AfterAll() {
        System.out.println("+++++++ Started AfterAll");
    }

    @BeforeEach
    void beforeEach () {
        System.out.println("-------- Started beforeEach");
    }

    @AfterEach
    void afterEach(){
        System.out.println("-------- Started afterEach");
    }

    @Test
    void firstTest(){
        System.out.println("======== Started firstTest");
    }

    @Test
    void secondTest(){
        System.out.println("======== Started secondTest");
    }
}
