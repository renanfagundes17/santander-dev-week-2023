package com.renanfagundes.santanderdevweek.repository;

import com.renanfagundes.santanderdevweek.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
