package it.epicode.flaviocirillo.D1S7.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.flaviocirillo.D1S7.app.entity.Ruolo;
import it.epicode.flaviocirillo.D1S7.app.repository.RuoloRepository;

@Service
public class RuoloService {

	@Autowired
	RuoloRepository rr;
	
	public Ruolo insertRuolo(Ruolo r) {
        return rr.save(r);
    }
	

}
