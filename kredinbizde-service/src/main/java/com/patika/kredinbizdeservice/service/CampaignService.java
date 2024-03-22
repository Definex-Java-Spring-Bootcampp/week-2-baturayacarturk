package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.enums.SortOrder;
import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.repository.ICampaignRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class CampaignService implements ICampaignService{

    private ICampaignRepository campaignRepository;

    public CampaignService(ICampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }


    @Override
    public Campaign createCampaign(Campaign campaign) {
        campaignRepository.save(campaign);
        return campaign;
    }

    @Override
    public List<Campaign> getCampaignsByOrder(SortOrder order) {
        if(order==null){
            return null;
        }
        if(SortOrder.ASCENDING.equals(order)){
            return campaignRepository.getCampaignsAscendingByDate();
        }
        return campaignRepository.getCampaignsDesendingByDate();
    }
}
