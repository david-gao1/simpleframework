package com.gao.service.solo;


import com.gao.entity.bo.HeadLine;
import com.gao.entity.dto.Result;

import java.util.List;

/**
 * 增删改查
 *
 * @author lianggao
 */
public interface HeadLineService {
    Result<Boolean> addHeadLine(HeadLine headLine);

    Result<Boolean> removeHeadLine(int headLineId);

    Result<Boolean> modifyHeadLine(HeadLine headLine);

    Result<HeadLine> queryHeadLineById(int headLineId);

    Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition, int pageIndex, int pageSize);
}
