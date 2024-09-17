package com.atividadespringboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividadespringboot.demo.Model.Agent;
import com.atividadespringboot.demo.repository.AgentRepository;

@Service
public class AgentService {
    
    @Autowired
    private AgentRepository agentRepository;

    public Agent getByDisplayName(){
        return agentRepository.findByDisplayName(null);
        
    }
}
