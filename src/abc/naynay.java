
import java.io.*;
import java.util.*;

class naynay {
    public static void main(String[] args)
    {

        try {
            String str = "GeeksForGeeks";

            // Create a Reader instance
            Reader reader
                    = new StringReader(str);

            reader.close();

            // Check if the Reader is
            // ready to be read using ready()
            System.out.println("Is Reader ready "
                    + "to be read: "
                    + reader.ready());

            // Get the character
            // to be read from the stream
            int ch;

            // Read the first character
            // to this reader using read() method
            // This will put the str in the stream
            // till it is read by the reader
            ch = reader.read();
            System.out.println("\nInteger value "
                    + "of character read: "
                    + ch);
            System.out.println("Actual "
                    + "character read: "
                    + (char)ch);

            reader.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
