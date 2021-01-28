package com.gao.service.solo;


import com.gao.entity.bo.ShopCategory;
import com.gao.entity.dto.Result;

import java.util.List;

/**
 * 增删改查
 *
 * @author lianggao
 */
public interface ShopCategoryService {
    Result<Boolean> addShopCategory(ShopCategory shopCategory);

    Result<Boolean> removeShopCategory(int shopCategoryId);

    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);

    Result<ShopCategory> queryShopCategoryById(int shopCategoryId);

    Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize);
}
