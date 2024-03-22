package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.repository.IApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Scope("prototype")
public class ApplicationService implements IApplicationService{

    private final IApplicationRepository applicationRepository;
    private final IUserService userService;
    @Autowired
    public ApplicationService(IApplicationRepository applicationRepository, IUserService userService){
        this.applicationRepository = applicationRepository;
        this.userService = userService;
    }

    @Override
    public Application save(Application application) {
        applicationRepository.save(application);
        return application;
    }

    @Override
    public List<Application> getApplicationsByEmailAddress(String emailAddress) {
        var checkUserExists = userService.getByEmail(emailAddress);
        if(checkUserExists!=null){
            return applicationRepository.getAllByEmailAddress(emailAddress);
        }
        return null;
    }
}
