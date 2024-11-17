package com.demo.host_server.service;

import com.demo.host_server.entity.HostEntity;
import com.demo.host_server.repo.HostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostService {

    @Autowired
    HostRepo hr;

    public List<HostEntity> getAllHost(){
        List<HostEntity> allHost = hr.findAll();
        return allHost;
    }

    public HostEntity addHost(HostEntity he){
        return hr.save(he);
    }

    public List<HostEntity> getAllVmByHost(int hid){
        return hr.findVmByHostId();
    }
}
