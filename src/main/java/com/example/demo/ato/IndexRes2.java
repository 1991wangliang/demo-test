package com.example.demo.ato;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lorne
 * @date 2018/9/13
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "响应结果数据2")
public class IndexRes2 {

    @ApiModelProperty(value = "响应结果2")
    private String res;



    @ApiModelProperty(value = "data12")
    private String data;



}
