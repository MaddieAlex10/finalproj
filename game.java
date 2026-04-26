import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class game {
    public static void main(String[] args) throws IOException {
        // Read all lines into memory
        List<String> lines = Files.readAllLines(Paths.get("words.txt"));
        
        // Pick a random index
        Random random = new Random();
        String randomLine = lines.get(random.nextInt(lines.size()));
        
        System.out.println(randomLine);
    }
}

