package org.lesson.java.springLaMiaPizzeriaCrud.DB.repo;


import org.lesson.java.springLaMiaPizzeriaCrud.DB.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
    public User findByUsername(String name);
}