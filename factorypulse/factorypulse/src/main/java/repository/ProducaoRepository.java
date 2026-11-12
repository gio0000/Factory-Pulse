package com.giordana.factorypulse.repository;

import com.giordana.factorypulse.model.Producao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducaoRepository extends JpaRepository<Producao, Long> {
}