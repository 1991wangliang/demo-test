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
@ApiModel(value = "请求数据2")
public class IndexReq2 {

    @ApiModelProperty(value = "data",notes = "数据集")
    private String data;




}
