package com.example.productdemo.service.impl;

import com.example.productdemo.entity.AgentEntity;
import com.example.productdemo.repository.AgentRepository;
import com.example.productdemo.service.AgentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentServiceImpl implements AgentService {

    private final AgentRepository agentRepository;

    public AgentServiceImpl(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    @Override
    public List<AgentEntity> findAllAgents() {
        return agentRepository.findAll();
    }

    @Override
    public Optional<AgentEntity> findById(Long agent_id) {
        return agentRepository.findById(agent_id);
    }

    @Override
    public AgentEntity saveAgent(AgentEntity agentEntity) {
        return agentRepository.save(agentEntity);
    }

    @Override
    public AgentEntity updateAgent(AgentEntity agentEntity) {
        return agentRepository.save(agentEntity);
    }

    @Override
    public void deleteAgent(Long product_id) {

    }
}
