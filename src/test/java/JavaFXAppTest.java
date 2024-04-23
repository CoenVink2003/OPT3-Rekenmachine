import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void computeMultiplyTest(){
        assertEquals(2 , new JavaFXApp().computeMultiply(1,2));
    }
}