import java.util.ArrayList;
import java.util.List;

public class MemoryExample {
    public static void main(String[] args) {
        try {
            List byteArrays = new ArrayList();
            while (true) {
                byte[] bigArray = new byte[1024 * 1024];
                byteArrays.add(bigArray);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError ! , Lekin system unstable hai.");
        }
        System.out.println("program not run continue");
    }
}