package cloud.apps.com.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("/")
	public String index() {
		return "Hello From GCP";
	}

}