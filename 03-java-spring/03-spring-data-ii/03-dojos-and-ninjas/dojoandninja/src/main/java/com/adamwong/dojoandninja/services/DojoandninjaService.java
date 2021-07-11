package com.adamwong.dojoandninja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adamwong.dojoandninja.models.Dojo;
import com.adamwong.dojoandninja.models.Ninja;
import com.adamwong.dojoandninja.repositories.DojoRepository;
import com.adamwong.dojoandninja.repositories.NinjaRepository;

@Service
public class DojoandninjaService {
	private final DojoRepository dojoRepo;
	private final NinjaRepository ninjaRepo;
//	why in the world do they do this?
	public DojoandninjaService(DojoRepository dRepository, NinjaRepository nRepository) {
		this.dojoRepo = dRepository;
		this.ninjaRepo = nRepository;
	}
	public Dojo createDojo (Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public Ninja createNinja (Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public List<Dojo> allDojos() {
		return dojoRepo.findAll();
	}
	public List<Ninja> allNinjas() {
		return ninjaRepo.findAll();
	}
	//This statement below is pretty clutch and keeps coming up again and again for finding something by an ID
	public Dojo findDojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
    public void destroyDojo(Long id) {
        this.dojoRepo.deleteById(id);
    }
    public void destroyNinja(Long id) {
        this.ninjaRepo.deleteById(id);
    }

}
