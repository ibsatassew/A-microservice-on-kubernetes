import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

@RestController
class MicroserviceController {

    @GetMapping("/config")
    public String getConfig() {
        // Return JSON array of environment variables
        return "{\"environment\": \"variables\"}";
    }

    @GetMapping("/fib")
    public String generateFibonacci(@RequestParam("length") int length) {
        // Generate Fibonacci sequence and return as JSON array
        int[] fibonacci = new int[length];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            result.append(fibonacci[i]);
            if (i < length - 1) {
                result.append(",");
            }
        }
        result.append("]");
        return result.toString();
    }
}
