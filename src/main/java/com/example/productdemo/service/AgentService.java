package com.example.productdemo.service;
import com.example.productdemo.entity.AgentEntity;
import java.util.List;
import java.util.Optional;

public interface AgentService {
    List<AgentEntity> findAllAgents();
    Optional<AgentEntity> findById(Long agent_id);
    AgentEntity saveAgent(AgentEntity agentEntity);
    AgentEntity updateAgent(AgentEntity agentEntity);
    void deleteAgent(Long product_id);
}
