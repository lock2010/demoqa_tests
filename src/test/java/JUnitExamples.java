import org.junit.jupiter.api.*;

public class JUnitExamples {
    @BeforeAll
    static void beforeAll(){
        System.out.println("Here is beforeAll()");
    }

    @BeforeEach
     void beforeEach(){
        System.out.println("    Here is beforeEach()");
    }
    @Test
    void firstTest(){
        System.out.println("        Here is firstTest()");
    }
    @Test
    void secondTest(){
        System.out.println("        Here is firstTest()");
    }
    @AfterEach
     void afterEach(){
        System.out.println("            Here is fterEach()");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("                Here is fterAll()");
    }

}
