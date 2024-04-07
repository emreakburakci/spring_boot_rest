package com.example.demo.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Runtime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long runtimeId;
    private Date stateBegin;
    private Date stateEnd;


    @OneToOne
    @JoinColumn(name = "stateId", referencedColumnName = "stateId")
    private State state;


    @OneToOne
    @JoinColumn(name = "orderId", referencedColumnName = "orderId")
    private Order order;


    @OneToOne
    @JoinColumn(name = "workcenterId", referencedColumnName = "workcenterId")
    private Workcenter workcenter;

    public Long getRuntimeId() {
        return runtimeId;
    }

    public void setRuntimeId(Long runtimeId) {
        this.runtimeId = runtimeId;
    }

    public Date getStateBegin() {
        return stateBegin;
    }

    public void setStateBegin(Date stateBegin) {
        this.stateBegin = stateBegin;
    }

    public Date getStateEnd() {
        return stateEnd;
    }

    public void setStateEnd(Date stateEnd) {
        this.stateEnd = stateEnd;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Workcenter getWorkcenter() {
        return workcenter;
    }

    public void setWorkcenter(Workcenter workcenter) {
        this.workcenter = workcenter;
    }
}
