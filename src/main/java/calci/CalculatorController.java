package calci;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CalculatorController {

	@GetMapping("/")
	
	public String loadCalci() {
		return "calci.jsp";
	}
	
	@GetMapping("/calculate")
	public String calculate(@RequestParam("num1") int x, @RequestParam("num2") int y, @RequestParam("operation") String  operation, ModelMap map ) {
		double result=0;
		
		switch (operation) {
		case "add":
			result=x+y;
			
			break;
		case "sub":
			result=x-y;
			
			break;
		case "mul":
			result=x*y;
			
			break;
		case "div":
			result=x 	/ (double)y;
			
			break;
 
		}
		map.put("x", x);
		map.put("y",y);
		map.put("answer", result);
		return "calci.jsp";
	}
}
