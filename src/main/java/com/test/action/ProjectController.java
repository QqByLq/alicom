package com.test.action;

import com.test.pojo.Project;
import com.test.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by LQ on 2019/7/27 12:58
 */
@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private IProjectService projectService;
    @RequestMapping("search")
    public List<Project> list(){
        return projectService.projectlist();
    }
}
