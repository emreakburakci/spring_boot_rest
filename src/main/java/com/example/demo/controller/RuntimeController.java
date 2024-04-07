package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.model.Runtime;
import com.example.demo.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Date;

@Controller
public class RuntimeController {

    private RuntimeService runtimeService;
    private OrderService orderService;

    private ProductService productService;

    private WorkcenterService workcenterService;

    private StateService stateService;



    public RuntimeController(RuntimeService runtimeService, OrderService orderService, ProductService productService, WorkcenterService workcenterService, StateService stateService){
        this.runtimeService = runtimeService;
        this.orderService = orderService;
        this.productService = productService;
        this.workcenterService = workcenterService;
        this.stateService = stateService;

    }

    @GetMapping("/createRuntime")
    @ResponseBody
    public ResponseEntity<Runtime> createRuntime(){
        Runtime rt = new Runtime();
        rt.setStateBegin(new Date());
        rt.setStateEnd(new Date());

        Product product = new Product();
        product.setProductName("Product 1");
        product.setProductNo(123456L);
        productService.createProduct(product);


        Order order = new Order();
        order.setOrderName("Order 1");
        order.setProduct(product);
        orderService.createOrder(order);

        Workcenter wc = new Workcenter();

        wc.setWorkcenterName("Workcenter 1");
        wc.setWorkcenterNo(123456L);
        workcenterService.createWorkcenter(wc);

        State state = new State();
        state.setStateName("State 1");
        stateService.createState(state);

        rt.setState(state);
        rt.setOrder(order);
        rt.setWorkcenter(wc);

        runtimeService.createRuntime(rt);

        return ResponseEntity.ok(rt);







    }

}
