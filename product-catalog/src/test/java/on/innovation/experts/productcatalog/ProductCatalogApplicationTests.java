package on.innovation.experts.productcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@EnableConfigServer
public class ProductCatalogApplicationTests {

	public static void main(String [] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
