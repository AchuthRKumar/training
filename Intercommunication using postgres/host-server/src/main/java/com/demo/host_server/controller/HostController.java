package com.demo.host_server.controller;

import com.demo.host_server.entity.HostEntity;
import com.demo.host_server.entity.VmEntity;
import com.demo.host_server.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HostController {
    @Autowired
    HostService hs;

    @GetMapping("/hosts")
    public List<HostEntity> getAllHost(){
        return hs.getAllHost();
    }

    @PostMapping("/hosts")
    public HostEntity addHost(@RequestBody HostEntity he){
        return hs.addHost(he);
    }

    @GetMapping("/hosts/{hid}")
    public HostEntity getAllVmByHost(@PathVariable int hId){
        HostEntity host = hs.getHost(hId);
        List<VmEntity> vm = WebClient.builder().build()
                .get()

                .uri("http://localhost/api/vm/ " + hId);
    }
}
