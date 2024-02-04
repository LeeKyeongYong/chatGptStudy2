package com.imgbot.bot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ImgDtoRq {

    private String prompt;
    private Integer n;
    private String size;
}
