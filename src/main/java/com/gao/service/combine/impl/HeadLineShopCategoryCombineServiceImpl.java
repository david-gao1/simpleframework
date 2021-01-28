package com.gao.service.combine.impl;


import com.gao.entity.bo.HeadLine;
import com.gao.entity.bo.ShopCategory;
import com.gao.entity.dto.MainPageInfoDTO;
import com.gao.entity.dto.Result;
import com.gao.service.combine.HeadLineShopCategoryCombineService;
import com.gao.service.solo.HeadLineService;
import com.gao.service.solo.ShopCategoryService;

import java.util.List;


public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {

    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;

    @Override
    public Result<MainPageInfoDTO> getMainPageInfo() {
        //1.获取头条列表
        HeadLine headLineCondition = new HeadLine();
        headLineCondition.setEnableStatus(1);//可用
        Result<List<HeadLine>> headLineResult = headLineService.queryHeadLine(headLineCondition, 1, 4);
        //2.获取店铺类别列表
        ShopCategory shopCategoryCondition = new ShopCategory();
        Result<List<ShopCategory>> shopCategoryResult = shopCategoryService.queryShopCategory(shopCategoryCondition, 1, 100);
        //3.合并两者并返回
        Result<MainPageInfoDTO> result = mergeMainPageInfoResult(headLineResult, shopCategoryResult);
        return result;
    }

    private Result<MainPageInfoDTO> mergeMainPageInfoResult(Result<List<HeadLine>> headLineResult, Result<List<ShopCategory>> shopCategoryResult) {
        return null;
    }
}
