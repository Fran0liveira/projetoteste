import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * @author BBIFOOD
 *
 */
public class Principal{
	
	public static void main(String... args) {
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println("Data atual = " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
		
		
		System.out.println("Dia da semana: " + localDate.getDayOfWeek());
		
		System.out.println("Dia do mes: " +localDate.getDayOfMonth());
		
		System.out.println("Dia do ano: " +localDate.getDayOfYear());
		
		System.out.println("Mes: " +localDate.getMonthValue());
		
		System.out.println("Nome do mes: " +localDate.getMonth());
	}
}