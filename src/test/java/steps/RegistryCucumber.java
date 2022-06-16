package steps;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import io.cucumber.core.api.TypeRegistry;

public class RegistryCucumber implements TypeRegistry {

	public void defineParameterType(TypeRegistry registry) {
		registry.defineParameterType(
				new ParameterType<>("data",".*", Date.class, (String s)->{
					Date transform(String int0) {
						DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
						try {
							Date retorno = format.parse(s);
						}catch (ParseException e) {
							e.printStackTrace();
							return null;
						}	
					}	
				})
				
				);

	}

}
