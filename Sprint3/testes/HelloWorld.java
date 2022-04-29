
import static spark.Spark.*;

public class HelloWorld {
public static void main(String[] arg){
//		port(1456);
		get("/hello", (request, response) -> "Teste funcinando");
	}
}
