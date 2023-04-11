
/*   1.) Used Annotation.
 *            i.)   @BeforeAll
 *            ii.)  @BeforeEach.
 *            iii.) @Test.
 *            iv.)  @AfterEach.
 *            v.)   @AfterAll.
 *            vi.)  @Disabled.
 *            vii.) 
 * 
 * 
 * 
 * */
package com.testing;
import org.junit.jupiter.api.*;
public class AppTest {
	Calculator con=new Calculator();

	@BeforeAll
	static void setup(){
		System.out.println("@BeforeAll executed");
	}

	@BeforeEach
	void setupThis(){
		System.out.println("@BeforeEach executed");
	}

	// USed Disable Annotation.
	@Disabled
	@Test
    void testCalcOne()
	{
		System.out.println("======TEST ONE EXECUTED=======");
		Assertions.assertEquals(4 , con.add(2, 2));
    }

    @Test
    void testCalcTwo()
   {
		System.out.println("======TEST TWO EXECUTED=======");
		Assertions.assertEquals( 6 , con.add(2, 4));
    }

	@AfterEach
	void tearThis(){
		System.out.println("@AfterEach executed");
	}

	@AfterAll
	static void tear(){
		System.out.println("@AfterAll executed");
	}
}
