import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.transform.Transformer;

public class DateConverter extends Transformer<Date>{
	public Date transform(String int0) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date retorno = format.parse(int0);
		}catch (ParseException e) {
			e.printStackTrace();
			return null;
		}	
	}	
}
