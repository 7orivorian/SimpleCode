/**
 * @author <a href="https://github.com/7orivorian">7orivorian</a>
 * @since 1.0.0
 */
public class TestMain {

    public static void main(String[] args) {
        byte[] b1 = new byte[]{72, 101, 108, 108, 111, 32};
        byte[] b2 = new byte[]{119, 111, 114, 108, 100, 33};

        System.out.println(new String(b1) + new String(b2));
    }
}