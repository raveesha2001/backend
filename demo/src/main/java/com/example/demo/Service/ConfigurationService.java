package com.example.demo.Service;

import com.example.demo.Model.ConfigurationEntity;
import com.example.demo.Repo.ConfigurationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationService {
    private ConfigurationRepo configurationRepo;

    @Autowired
    public ConfigurationService(ConfigurationRepo configurationRepo) {
        this.configurationRepo = configurationRepo;
    }

    public ConfigurationEntity create(ConfigurationEntity configurationEntity) {
        return configurationRepo.save(configurationEntity);
    }
}
