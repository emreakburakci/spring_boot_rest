package com.example.demo.service;

import com.example.demo.model.State;
import com.example.demo.repository.StateRepository;
import org.springframework.stereotype.Service;

@Service
public class StateService
{
    private final StateRepository stateRepository;

    public StateService(StateRepository stateRepository){
        this.stateRepository = stateRepository;
    }

    public void createState(State state){

        stateRepository.save(state);

    }

    public State getStateById(Long id){
        return stateRepository.findById(id).get();
    }

    public void deleteStateById(Long id){
        stateRepository.deleteById(id);
    }


    public Iterable<State> getAllStates(){
        return stateRepository.findAll();
    }
}
