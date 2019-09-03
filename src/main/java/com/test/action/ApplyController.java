package com.test.action;

import com.test.pojo.Apply;
import com.test.pojo.EasyUIDataGrid;
import com.test.pojo.SportResult;
import com.test.service.IApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by LQ on 2019/7/27 12:09
 */
@RestController
@RequestMapping("/apply")
public class ApplyController {

    @Autowired
    private IApplyService applyService;

    /*显示 and 查询*/
    @RequestMapping("/search")
    public EasyUIDataGrid<Apply> list(Apply apply,@RequestParam(value = "page",defaultValue = "1") int page, @RequestParam(value = "rows",defaultValue = "10") int rows){
       EasyUIDataGrid<Apply> list = applyService.list(apply,page,rows);
       return list;
    }
    /*删除*/
    @RequestMapping("/delete")
    public SportResult delete(Integer aid){


        int rows =  applyService.delete(aid);

        if (rows>0){
            return SportResult.ok("删除成功");
        }else {
            return SportResult.notOk();
        }

    }

    /*增加*/
    @RequestMapping("/add")
    public SportResult add(Apply apply){
        return   applyService.add(apply);

    }

    /*编辑前获取信息*/
    @RequestMapping("/get")
    public Apply get(Integer aid){

        return applyService.get(aid);
    }

    /*更新*/
    @RequestMapping("/update")
    public SportResult update(Apply apply){


        int rows =  applyService.update(apply);

        if (rows>0){
            return SportResult.ok("修改成功");
        }else {
            return SportResult.notOk();
        }

    }
}
