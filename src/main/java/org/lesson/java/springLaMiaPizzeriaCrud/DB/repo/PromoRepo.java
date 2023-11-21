package org.lesson.java.springLaMiaPizzeriaCrud.DB.repo;

import java.util.List;

import org.lesson.java.springLaMiaPizzeriaCrud.DB.Promo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromoRepo extends JpaRepository<Promo, Integer> {
    public List<Promo> findByTitle(String title);
}