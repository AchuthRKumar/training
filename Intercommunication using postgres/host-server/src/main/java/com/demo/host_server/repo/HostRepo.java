package com.demo.host_server.repo;

import com.demo.host_server.entity.HostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HostRepo extends JpaRepository<HostEntity, Integer> {
}
