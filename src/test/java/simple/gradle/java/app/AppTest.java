/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package simple.gradle.java.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void getSum() {
       int result = App.getSum(10, 12);
       int expected = 22;
       assertEquals(expected,result);
    }

    @Test void main(){
        App.main(new String[]{});
    }
}
