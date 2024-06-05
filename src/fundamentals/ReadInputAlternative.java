package fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputAlternative {

    /*
     * Alternative of read line - InputStreamReader + BufferedReader
     * This approach in terms of performance, it's a bit faster than scanner.
     * Normally, it's not quite used except competitive programming.
     * Anyway, The faster approach are existing but since contain too much word.
     * I want to introduce only InputStreamReader + BufferedReader
     * */
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        System.out.print("Please provide your input: ");
        String text = bufferedReader.readLine();
        System.out.println("This is what you have typed: " + text);
    }
}
