package com.demo.vm_client.repo;

import com.demo.vm_client.entity.VmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VmRepo extends JpaRepository<VmEntity,Integer> {
}
