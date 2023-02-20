package it.epicode.flaviocirillo.D1S7.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.epicode.flaviocirillo.D1S7.app.entity.Edificio;
import it.epicode.flaviocirillo.D1S7.app.entity.Postazione;
import it.epicode.flaviocirillo.D1S7.app.entity.Utente;
import it.epicode.flaviocirillo.D1S7.app.repository.UtenteRepository;

@Service
public class UtenteService {
	@Autowired
    private UtenteRepository utenteRepo;

    public void insertUtente(Utente u) {
        utenteRepo.save(u);
        System.out.println("Utente inserito correttamente!");
    }
    public Utente save(Utente u) {
    	return utenteRepo.save(u);
    }
    
    public Optional<Utente> getById(int id) {
		return utenteRepo.findById(id);
	}
    
    public List<Utente> getAll() {
		return utenteRepo.findAll();
	}
    
    public Page<Utente> getAll_page(Pageable pageable) {
		return utenteRepo.findAll(pageable);
	}
	
	public void delete(Utente u) {
		utenteRepo.delete(u);
	}
	
	public Optional<Utente> getUserByUsername(String username) {
		return utenteRepo.findByUsername(username);
	}

}
