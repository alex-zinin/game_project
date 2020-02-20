package Input_Handler;
import java.io.IOException;
import java.util.*;


public class Input_Handler {
    public char Read() throws IOException {
        Scanner in = new Scanner(System.in);
        return (char) System.in.read();
    }
}
