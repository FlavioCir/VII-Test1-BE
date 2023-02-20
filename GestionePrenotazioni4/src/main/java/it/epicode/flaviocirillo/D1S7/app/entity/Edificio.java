package it.epicode.flaviocirillo.D1S7.app.entity;

import java.util.Set;

import javax.persistence.Convert;
import javax.persistence.Converter;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import it.epicode.flaviocirillo.D1S7.app.config.StringAttibuteConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "edifici")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
@Builder
public class Edificio {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int edificio_id;
	private String nome;
	private String indirizzo;
	private String citta;
	
	@OneToMany(mappedBy = "edificio")
	@JsonIgnoreProperties("edificio")
	private Set<Postazione> postazioni;
	
	@Convert(converter = StringAttibuteConverter.class)
	private String codice;
}
