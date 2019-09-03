package com.test.service.impl;

import com.test.mapper.ProjectMapper;
import com.test.pojo.Project;
import com.test.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LQ on 2019/7/27 12:56
 */
@Service
public class ProjectServiceImpl implements IProjectService {
    @Autowired
    private ProjectMapper projectMapper;

    /*获取所有的项目信息*/
    @Override
    public List<Project> projectlist() {
        return projectMapper.selectByExample(null);
    }
}
