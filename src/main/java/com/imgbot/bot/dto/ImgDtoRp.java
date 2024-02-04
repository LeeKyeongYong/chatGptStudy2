package com.imgbot.bot.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ImgDtoRp {
        private Date created;
        private List<HashMap<String,String>> data;
}
