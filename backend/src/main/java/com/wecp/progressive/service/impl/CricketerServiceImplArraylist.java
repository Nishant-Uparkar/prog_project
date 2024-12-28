package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;

public class CricketerServiceImplArraylist implements CricketerService  {

    List<Cricketer> cricketers = new ArrayList<>();
    @Override
    public Integer addCricketer(Cricketer cricketer) {
        cricketers.add(cricketer);
        return (cricketers.size());
    }

    @Override
    public List<Cricketer> getAllCricketers() {
        return cricketers;
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        return Collections.sort(cricketers);
    }

    

}