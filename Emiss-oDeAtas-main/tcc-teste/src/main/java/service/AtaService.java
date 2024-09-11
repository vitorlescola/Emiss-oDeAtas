package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.tcc_teste.model.Ata;

import repository.AtaRepository;

import java.util.List;

@Service
public class AtaService {
    @Autowired
    private AtaRepository ataRepository;

    public Ata save(Ata ata) {
        return ataRepository.save(ata);
    }

    public List<Ata> findAll() {
        return ataRepository.findAll();
    }
}