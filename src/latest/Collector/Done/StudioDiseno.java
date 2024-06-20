package latest.Collector.Done;

/* 1. binary serach progra
* 2. exception output
*
* */
public class StudioDiseno {
    public static void main(String[] args) {
        System.out.println(exceptionTest());
    }

    static int exceptionTest() {
        int i = 6;
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            i = 10;
            return i;
        } finally {
            i = 20;
            return i;
            //System.out.println("In finally block");  //this will not print due to unreachabel statement
        }
    }
}
