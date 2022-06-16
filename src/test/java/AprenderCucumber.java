
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AprenderCucumber {
	@Given("que criei o arquivo corretamente")
	public void que_criei_o_arquivo_corretamente() throws Throwable{
		System.out.println("passou");
	}

	@When("executar")
	public void executar() throws Throwable{
	    
	}

	@Then("a especificacao deve finalizar com sucesso")
	public void a_especificacao_deve_finalizar_com_sucesso() throws Throwable{
	   
	}

	//Contador:
	private int contador=0;
	
	@Given("valor do contador {int}")
	public void valor_do_contador(Integer int1) throws Throwable {
		contador =int1;
	}	
	
	@When("quando eu incrementar em {int}")
	public void quando_eu_incrementar_em(Integer int1) throws Throwable {
	    contador=contador+int1;
	}
	
	@Then("o valor vai ser {int}")
	public void o_valor_vai_ser(Integer int1) throws Throwable {
	    /*System.out.println(int1);
	    System.out.println(contador);
	    System.out.println(int1 == contador);
	    Assert.assertTrue(int1 == contador);
	    Assert.assertEquals(int1, contador);*/
		Assert.assertTrue(int1 == contador);
	}
	
	//Entrega
	
	Date entrega = new Date();
		
	@Given("que a entrega e dia {int}\\/{int}\\/{int}")
	public void que_a_entrega_e_dia(Integer dia, Integer mes, Integer ano) throws Throwable {
	    Calendar cal= Calendar.getInstance();
	    cal.set(Calendar.DAY_OF_MONTH, dia);
	    cal.set(Calendar.MONTH, mes-1);
	    cal.set(Calendar.YEAR, ano);
	    entrega = cal.getTime();
	}

	@When("a entrega pode atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void a_entrega_pode_atrasar_em_dias(Integer int1, String tempo) {
	    Calendar cal =Calendar.getInstance();
	    cal.setTime(entrega);
	    if(tempo.equals("dias")) {
	    	cal.add(Calendar.DAY_OF_MONTH, int1);
	    }
	    if(tempo.equals("meses")) {
	    	cal.add(Calendar.MONTH, int1);
	    }
	    entrega = cal.getTime();
	}

	@Then("a entrega var ser efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void a_entrega_var_ser_efetuada_em(String data) {
	    DateFormat format = new SimpleDateFormat ("dd/MM/yyyy");
	    String dataFormatada =format.format(entrega);
		Assert.assertEquals(data,dataFormatada);
	}
	
	//Carros:
	
	@Given("que o ticket( especial)? e ..(\\d+)$")
	public void que_o_ticket_e(String tipo, Integer int1) {
	    
	}

	@Given("que o valor da passagem e {double},{int}")
	public void que_o_valor_da_passagem_e(Double double1, Integer int1) {
	    
	}


	@Given("que o nome do passageiro e \"([^\"]*)\"$")
	public void que_o_nome_do_passageiro_e(String int1) {
	    
	}

	@Given("que o telefone do passageiro e (\\d+)-(\\d+)$")
	public void que_o_telefone_do_passageiro_e(Integer int1, Integer int2) {
	    
	}
	
	@When("criar os steps")
	public void criar_os_steps() {
	    
	    
	}

	@Then("o teste vai funcionar")
	public void o_teste_vai_funcionar() {
	    
	}

	
}
