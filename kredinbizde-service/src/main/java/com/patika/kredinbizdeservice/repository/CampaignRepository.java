package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Campaign;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Repository
public class CampaignRepository implements ICampaignRepository{
    private List<Campaign>campaigns=new ArrayList<>();
    @Override
    public void save(Campaign campaign) {
        campaigns.add(campaign);
    }

    @Override
    public List<Campaign> getCampaignsDesendingByDate() {
        List<Campaign> sortedCampaigns = new ArrayList<>(campaigns);

        sortedCampaigns.sort(Comparator.comparing(Campaign::getCreateDate).reversed());
        return sortedCampaigns;
    }

    @Override
    public List<Campaign> getCampaignsAscendingByDate() {
        List<Campaign> sortedCampaigns = new ArrayList<>(campaigns);

        sortedCampaigns.sort(Comparator.comparing(Campaign::getCreateDate));
        return sortedCampaigns;
    }

}
