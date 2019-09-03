package com.test.service;

import com.test.pojo.Apply;
import com.test.pojo.EasyUIDataGrid;
import com.test.pojo.SportResult;


/**
 * Created by LQ on 2019/7/27 12:13
 */
public interface IApplyService {
    /**
     * 分页查询显示
     * @param apply
     * @param page
     * @param rows
     * @return
     */
    EasyUIDataGrid<Apply> list(Apply apply,int page, int rows);

    /*删除*/
    int delete(Integer aid);

    /*添加*/
    SportResult add(Apply apply);

    /*编辑前获取数据*/
    Apply get(Integer aid);

    /*更新*/
    int update(Apply apply);


}
