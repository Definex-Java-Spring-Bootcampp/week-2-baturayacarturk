package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.enums.SortOrder;
import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.service.ICampaignService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/campaigns")
public class CampaignController {
    private ICampaignService campaignService;


    public CampaignController(ICampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Campaign create(@RequestBody Campaign campaign) {
        return campaignService.createCampaign(campaign);
    }
    @GetMapping("/get-campaigns/{order}")
    public List<Campaign> getCampaignsByOrder(@PathVariable SortOrder order) {
        return campaignService.getCampaignsByOrder(order);
    }
}
