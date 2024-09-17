package com.atividadespringboot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividadespringboot.demo.Model.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long>{

   public Agent findByDisplayName(String DisplayName);

   public List<Agent> findByRole(String role);
   



}
