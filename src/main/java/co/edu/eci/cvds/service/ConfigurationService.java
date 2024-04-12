package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.Configuration;
import co.edu.eci.cvds.repository.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigurationService {
    private final ConfigurationRepository configurationRepository;

    @Autowired
    public ConfigurationService(ConfigurationRepository configurationRepository) {
        this.configurationRepository = configurationRepository;
    }

    public Configuration addConfiguration(Configuration configuration) {
        return configurationRepository.save(configuration);
    }

    public Configuration getConfiguration(String pregunta) {
        return configurationRepository.findByPregunta(pregunta).get(1);
    }

    public List<Configuration> getAllConfigurations() {
        return configurationRepository.findAll();
    }

    public Configuration updateConfiguration(Configuration configuration) {
        if (configurationRepository.findByPregunta(configuration.getPregunta()).size() == 0) {
            return configurationRepository.save(configuration);
        }

        return null;
    }

    public void deleteConfiguration(String pregunta) {
        configurationRepository.deleteById(pregunta);
    }

    public String getPremio() {
        return configurationRepository.findByPregunta("premio").get(0).getRespuesta();
    }
}