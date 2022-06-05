package com.toyota32bit.Inviso.Services;

import org.springframework.security.access.prepost.PreAuthorize;

public interface IHomePageService {
    @PreAuthorize("hasAnyRole('ADMIN','SUPERVISOR')")
    int getNumberOfUsers();
    @PreAuthorize("hasAnyRole('ADMIN','SUPERVISOR')")
    int getNumberOfRoles();
}
