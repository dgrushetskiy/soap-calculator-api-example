package com.example.calculator.controller;

import com.example.calculator.model.AddRequest;
import com.example.calculator.model.AddResponse;
import com.example.calculator.model.SubtractRequest;
import com.example.calculator.model.SubtractResponse;
import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculatorEndpoint {

    private static final String NAMESPACE = "http://www.example.com/calculator";
    @Autowired
    private CalculatorService service;

    @PayloadRoot(namespace = NAMESPACE, localPart = "addRequest")
    @ResponsePayload
    public AddResponse addNumbers(@RequestPayload AddRequest request) {
        return service.add(request);
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = "subtractRequest")
    @ResponsePayload
    public SubtractResponse subtractNumbers(@RequestPayload SubtractRequest request) {
        return service.subtract(request);
    }
}
