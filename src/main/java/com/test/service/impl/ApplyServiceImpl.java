package com.test.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.mapper.ApplyMapper;
import com.test.pojo.Apply;
import com.test.pojo.ApplyExample;
import com.test.pojo.EasyUIDataGrid;
import com.test.pojo.SportResult;
import com.test.service.IApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LQ on 2019/7/27 12:29
 */
@Service
public class ApplyServiceImpl implements IApplyService {
    @Autowired
    private ApplyMapper applyMapper;
    @Override
    public EasyUIDataGrid<Apply> list(Apply apply,int page,int rows) {
        PageHelper.startPage(page,rows);

        /*ApplyExample applyExample = new ApplyExample();
        if (apply!=null){
            ApplyExample.Criteria criteria = applyExample.createCriteria();
            if (apply.getSname()!=null &&apply.getSname().trim()!=""){
                criteria.andSnameEqualTo(apply.getSname());
            }
            if (apply.getEid()!=null){
                criteria.andEidEqualTo(apply.getEid());
            }
            if (apply.getPid()!=null){
                criteria.andPidEqualTo(apply.getPid());
            }
        }*/
        List<Apply> list = applyMapper.list(apply);
        PageInfo<Apply> pageInfo = new PageInfo<>(list);
        EasyUIDataGrid<Apply> dataGrid = new EasyUIDataGrid<>();
        dataGrid.setRows(list);
        dataGrid.setTotal((int) pageInfo.getTotal());
        return dataGrid;
    }

    @Override
    public int delete(Integer aid) {
        return applyMapper.deleteByPrimaryKey(aid);
    }

    @Override
    public SportResult add(Apply apply) {

        int count = applyMapper.selectcount(apply.getSid());
        System.out.println("count="+count);
        /*判断count值，大于2说明不能再添加了*/
        if (count<2){
            applyMapper.insertSelective(apply);
            return SportResult.ok("添加成功");
        }
        return SportResult.notOk("每个人只能报两项,该学生已经报了两个项目了,请勿多报");
    }

    @Override
    public Apply get(Integer aid) {
        return applyMapper.selectByPrimaryKey(aid);
    }

    @Override
    public int update(Apply apply) {
        return  applyMapper.updateByPrimaryKeySelective(apply);
    }


}
