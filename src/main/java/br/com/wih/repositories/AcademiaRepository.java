package br.com.wih.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wih.entities.Academia;

public interface AcademiaRepository extends JpaRepository<Academia, String> {

}
