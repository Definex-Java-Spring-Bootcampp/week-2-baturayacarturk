package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Application;

import java.util.List;

public interface IApplicationRepository {
    void save(Application application);
    List<Application> getAllByEmailAddress(String emailAddress);


}
