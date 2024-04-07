package com.example.demo.service;

import com.example.demo.model.Workcenter;
import com.example.demo.repository.WorkcenterRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkcenterService {

    private final WorkcenterRepository workcenterRepository;

    public WorkcenterService(WorkcenterRepository workcenterRepository){
        this.workcenterRepository = workcenterRepository;
    }

    public void createWorkcenter(Workcenter workcenter){

        workcenterRepository.save(workcenter);

    }

}
