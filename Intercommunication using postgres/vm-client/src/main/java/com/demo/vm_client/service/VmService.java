package com.demo.vm_client.service;

import com.demo.vm_client.entity.VmEntity;
import com.demo.vm_client.repo.VmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VmService {
    @Autowired
    VmRepo vmRepo;

    public List<VmEntity> getAllVm(){
        return vmRepo.findAll();
    }

}
