package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.Runtime;
import com.example.demo.repository.RuntimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuntimeService {

    RuntimeRepository runtimeRepository;

    public RuntimeService(RuntimeRepository runtimeRepository){
        this.runtimeRepository = runtimeRepository;
    }

    public void createRuntime(Runtime runtime){

        runtimeRepository.save(runtime);

    }

    public void deleteRuntime(Long id) {
        runtimeRepository.deleteById(id);

    }

    public void update(Runtime runtime) {
        runtimeRepository.save(runtime);
    }

    public Runtime getRuntime(Long id) {
        return runtimeRepository.findById(id).get();
    }



}
