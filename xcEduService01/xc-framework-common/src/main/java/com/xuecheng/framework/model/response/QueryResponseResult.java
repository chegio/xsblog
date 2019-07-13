package com.xuecheng.framework.model.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class QueryResponseResult extends ResponseResult {

    //存放数据
    QueryResult queryResult;

    public QueryResponseResult(ResultCode resultCode,QueryResult queryResult){
        super(resultCode);
       this.queryResult = queryResult;
    }

}
