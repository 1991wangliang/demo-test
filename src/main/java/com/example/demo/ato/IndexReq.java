package com.example.demo.ato;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author lorne
 * @date 2018/9/13
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "请求数据")
public class IndexReq {

    @ApiModelProperty(value = "商户id",notes = "我是参数说明")
    private long id;

    @ApiModelProperty(value = "测试2",notes = "请求参数2")
    private IndexReq2 indexReq2;

    @ApiModelProperty(value = "str2",notes = "我是参数2")
    private String str2;

    @ApiModelProperty(value = "测试2array",notes = "请求参数2array")
    private List<IndexReq2> list;

}
