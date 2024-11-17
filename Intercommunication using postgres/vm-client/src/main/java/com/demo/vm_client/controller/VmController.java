package com.demo.vm_client.controller;

import com.demo.vm_client.entity.VmEntity;
import com.demo.vm_client.service.VmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VmController {
    @Autowired
    VmService vmService;

    @GetMapping("/vm")
    public List<VmEntity> getAllVm(){
        return vmService.getAllVm();
    }


}
