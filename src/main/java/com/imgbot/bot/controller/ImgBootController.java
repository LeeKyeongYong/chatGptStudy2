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
    @PostMapping("/generateImage")
    public String generateImage(@RequestBody ImgDtoRq imgDtoRq){
        ImgDtoRp imgDtoRp = restTemplate.postForObject(open_url,imgDtoRq, ImgDtoRp.class);
        return imgDtoRp.getData().get(0).get("url").toString();
    }
}
