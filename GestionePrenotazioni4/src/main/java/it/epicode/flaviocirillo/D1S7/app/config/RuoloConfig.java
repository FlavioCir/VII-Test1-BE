package it.epicode.flaviocirillo.D1S7.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.epicode.flaviocirillo.D1S7.app.entity.Ruolo;

@Configuration
public class RuoloConfig {

	@Bean
    public Ruolo r() {
        Ruolo r = new Ruolo();
        return r;
    }
}
