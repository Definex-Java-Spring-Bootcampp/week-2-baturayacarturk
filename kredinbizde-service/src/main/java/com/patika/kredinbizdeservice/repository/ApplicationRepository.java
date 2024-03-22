package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Application;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class ApplicationRepository implements IApplicationRepository{
    private List<Application> applicationList = new ArrayList<>();

    public void save(Application application) {
        applicationList.add(application);
    }

    public List<Application> getAllByEmailAddress(String emailAddress) {
        return applicationList.stream()
                .filter(application -> application.getUser().getEmail().equals(emailAddress))
                .collect(Collectors.toList());
    }


}
