package com.toyota32bit.Inviso.Services;

import com.toyota32bit.Inviso.DataAccessObjects.ApplicationRepository;
import com.toyota32bit.Inviso.Entities.Application;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ApplicationService implements IApplicationService{
    Logger logger = LogManager.getLogger();
    private final ApplicationRepository applicationRepository;
    @Override
    public Application saveApplication(Application application) {
        logger.info("Saving new application {} to the database",application.getName());
        return applicationRepository.save(application);
    }

    @Override
    public void deleteApplication(Long appId) {
        logger.info("application is deleted which has id: {}", appId);
        applicationRepository.delete(applicationRepository.getById(appId));
    }
}
