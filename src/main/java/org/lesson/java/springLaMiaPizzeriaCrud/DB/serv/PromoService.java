package org.lesson.java.springLaMiaPizzeriaCrud.DB.serv;

import java.util.List;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.Promo;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.repo.PromoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromoService {

    @Autowired
    private PromoRepo promoRepo;

    public void save(Promo promo) {
        promoRepo.save(promo);
    }

    public List<Promo> findAll(){
        return promoRepo.findAll();
    }

    public Promo findById(int id) {
        return promoRepo.findById(id).get();
    }

    public List<Promo> findByTitle(String title){
        return promoRepo.findByTitle(title);
    }

    public void deletePromo(Promo promo) {
        promoRepo.delete(promo);
    }
}