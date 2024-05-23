package com.projetojpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpa.entities.Aluno;

public interface AlunoRepository extends JpaRepository <Aluno, Long>{
	List<Aluno> findByCidade(String cidade);
}