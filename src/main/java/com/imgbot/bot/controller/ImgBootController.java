package com.imgbot.bot.controller;


import com.imgbot.bot.dto.ImgDtoRp;
import com.imgbot.bot.dto.ImgDtoRq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ImgBootController {
    @Autowired
    private RestTemplate restTemplate;
    private static final String open_url="https://api.openai.com/v1/images/generations";
    //@PostMapping()
    @RequestMapping(value="/generateImage", method = RequestMethod.POST)
    public String generateImage(@RequestBody ImgDtoRq imgDtoRq){
        imgDtoRq.setModel("dall-e-3");
        ImgDtoRp imgDtoRp = restTemplate.postForObject(open_url,imgDtoRq, ImgDtoRp.class);
        //setDoOutput
        return imgDtoRp.getData().get(0).get("url").toString();
    }
}
