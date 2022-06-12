package com.toyota32bit.Inviso.Services;

import com.toyota32bit.Inviso.Entities.Application;


public interface IApplicationService {
    Application saveApplication(Application application);
    void deleteApplication(Long appId);
}
