package com.example.DecolaAPI.Domain.Repository;

import com.example.DecolaAPI.Domain.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccount_Number(String accountNumber);

}
