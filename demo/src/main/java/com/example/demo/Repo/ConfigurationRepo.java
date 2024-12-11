package com.example.demo.Repo;

import com.example.demo.Model.ConfigurationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.module.Configuration;

public interface ConfigurationRepo extends JpaRepository<ConfigurationEntity, Long> {
}
