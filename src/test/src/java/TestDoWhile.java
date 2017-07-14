import org.junit.Test;

/**
 * Created by ChenTao on 2017/7/12.
 * Junit测试类
 */
public class TestDoWhile {

    @Test
    public void testDoWhile(){
        int i =0;
        do {
           i++;
        }while (i!=10);
        System.out.println(i);
    }
}
