package it.epicode.flaviocirillo.D1S7.app;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class GestionePrenotazioniApplication4Tests {

	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate rt;
	
	@Test
	public void assertThatTest1MethodContainsWord() throws Exception {
		assertThat(this.rt.getForObject("http://localhost:" + port + "/istruzioni/it", String.class))
				.contains("prenotazione");
	}
	

}
