package com.gao.entity.dto;


import com.gao.entity.bo.HeadLine;
import com.gao.entity.bo.ShopCategory;
import lombok.Data;

import java.util.List;

@Data
public class MainPageInfoDTO {
    private List<HeadLine> headLineList;
    private List<ShopCategory> shopCategoryList;
}
