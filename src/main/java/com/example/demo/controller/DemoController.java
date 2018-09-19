package com.example.demo.controller;

import com.example.demo.ato.IndexReq;
import com.example.demo.ato.IndexRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lorne
 * @date 2018/4/27
 * @description
 */
@RestController
@RequestMapping("/demo")
@Api(value = "演示测试接口文档"
        ,description = "接口文档说明",tags = {"123","234"})
public class DemoController {


    @PostMapping("/index")
    @ApiOperation(value = "首页接口",notes = "我是接口说明")
    public IndexRes index(@RequestBody IndexReq indexReq){
        IndexRes indexRes = new IndexRes();
        indexRes.setRes("success->"+indexReq.getId());
        return indexRes;
    }


    @PostMapping("/index2")
    @ApiOperation(value = "首页接口2",notes = "我是接口说明2")
    public long index2(@RequestBody IndexReq indexReq){
        IndexRes indexRes = new IndexRes();
        indexRes.setRes("success->"+indexReq.getId());
        return indexReq.getId();
    }

    @PostMapping("/index3")
    @ApiOperation(value = "首页接口3",notes = "我是接口说明3")
    public List<IndexRes> index3(@RequestBody IndexReq indexReq){
        IndexRes indexRes = new IndexRes();
        indexRes.setRes("success->"+indexReq.getId());
        List<IndexRes> list = new ArrayList<>();
        list.add(indexRes);
        return list;
    }


    @GetMapping("/index3")
    @ApiOperation(value = "首页接口3xxx",notes = "我是接口说明3xxx")
    public List<IndexRes> index3get(@RequestBody IndexReq indexReq){
        IndexRes indexRes = new IndexRes();
        indexRes.setRes("success->"+indexReq.getId());
        List<IndexRes> list = new ArrayList<>();
        list.add(indexRes);
        return list;
    }


    @PostMapping("/index4")
    @ApiOperation(value = "首页接口4",notes = "我是接口说明4")
    public List<Integer> index4(@RequestBody List<IndexReq> indexReqs){
        List<Integer> list = new ArrayList<>();
        return list;
    }


    @PostMapping("/index5")
    @ApiOperation(value = "首页接口5",notes = "我是接口说明5")
    public List<Integer> index5(@RequestBody List<Integer> integers){
        List<Integer> list = new ArrayList<>();
        return list;
    }


    @PostMapping("/index6")
    @ApiOperation(value = "首页接口6",notes = "我是接口说明6")
    public List<IndexRes> index6(@RequestParam("name") String name){
        IndexRes indexRes = new IndexRes();
        indexRes.setRes("success->"+name);
        List<IndexRes> list = new ArrayList<>();
        list.add(indexRes);
        return list;
    }
}
