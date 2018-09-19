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
@ApiModel(value = "响应结果数据")
public class IndexRes {

    @ApiModelProperty(value = "响应结果")
    private String res;

    @ApiModelProperty(value = "data1")
    private String data;

    @ApiModelProperty(value = "indexRes2")
    private IndexRes2 indexRes2;

    @ApiModelProperty(value = "list")
    private List<IndexRes2> list;

}
