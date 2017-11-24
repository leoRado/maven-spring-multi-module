import config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author LEO
 * @since 23.11.17.
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = { WebConfig.class })
public class Main {

    public static void main (String[] args) {

        SpringApplication.run(new Class[]{Main.class}, args);


        System.out.println(
                        "______ _____  ___ ________   __\n" +
                        "| ___ \\  ___|/ _ \\|  _  \\ \\ / /\n" +
                        "| |_/ / |__ / /_\\ \\ | | |\\ V /\n" +
                        "|    /|  __||  _  | | | | \\ /\n" +
                        "| |\\ \\| |___| | | | |/ /  | |\n" +
                        "\\_| \\_\\____/\\_| |_/___/   \\_/\n");
    }
}