package com.demo.host_server.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
public class HostEntity {
    @Id
    @Column(name = "hId")
    private int hId;
    private String hName;

    @OneToMany(mappedBy = "host", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<VmEntity> allVm;
}
