package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Campaign;

import java.util.List;


public interface ICampaignRepository {
    void save(Campaign campaign);
    List<Campaign> getCampaignsDesendingByDate();
    List<Campaign> getCampaignsAscendingByDate();


}
