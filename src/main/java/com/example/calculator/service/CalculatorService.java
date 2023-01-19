package com.example.calculator.service;

import com.example.calculator.model.AddRequest;
import com.example.calculator.model.AddResponse;
import com.example.calculator.model.SubtractRequest;
import com.example.calculator.model.SubtractResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public AddResponse add(AddRequest req){
        AddResponse res = new AddResponse();
        res.setResult( req.getX() + req.getY());
        return  res;
    }

    public SubtractResponse subtract(SubtractRequest req){
        SubtractResponse res = new SubtractResponse();
        res.setResult( req.getX() - req.getY());
        return  res;
    }
}
