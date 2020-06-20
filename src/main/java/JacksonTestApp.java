import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JacksonTestApp {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting Test App");
        ObjectMapper mapper = new ObjectMapper();
        byte[] bytes = Files.readAllBytes(Paths.get("src/main/resources/company.json"));
        Company c = mapper.readValue(bytes, Company.class);
        System.out.println("All ok");
    }
}
