package com.example.productdemo.controller;
import com.example.productdemo.entity.AgentEntity;
import com.example.productdemo.service.AgentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/agent")
public class AgentController {
    private final AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @GetMapping
    public List<AgentEntity> findAllAgents(){
        return agentService.findAllAgents();
    }

    @GetMapping("/{id}")
    public Optional<AgentEntity> findById(@PathVariable("id") Long contact_details_id){
        return agentService.findById(contact_details_id);
    }

    @PostMapping
    public AgentEntity saveAgent(@RequestBody AgentEntity agentEntity){
        return agentService.saveAgent(agentEntity);
    }
    @PutMapping
    public AgentEntity updateAgent(@RequestBody AgentEntity agentEntity) {
        return agentService.updateAgent(agentEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteAgent(@PathVariable("id") Long id) {
        agentService.deleteAgent(id);
    }


}
