package org.lesson.java.springLaMiaPizzeriaCrud.DB.repo;


import org.lesson.java.springLaMiaPizzeriaCrud.DB.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {

}