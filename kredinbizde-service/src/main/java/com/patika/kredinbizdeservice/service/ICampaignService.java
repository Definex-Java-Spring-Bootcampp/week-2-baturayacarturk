package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.enums.SortOrder;
import com.patika.kredinbizdeservice.model.Campaign;

import java.util.List;

public interface ICampaignService {

    Campaign createCampaign(Campaign campaign);
    List<Campaign> getCampaignsByOrder(SortOrder order);
}
