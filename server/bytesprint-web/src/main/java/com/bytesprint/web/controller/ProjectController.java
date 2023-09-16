package com.bytesprint.web.controller;

import com.bytesprint.application.service.ProjectDetailService;
import com.bytesprint.application.service.ProjectListService;
import com.bytesprint.presentation.vo.project.detail.ProjectDetailResponseSchema;
import com.bytesprint.presentation.vo.project.list.ProjectListResponseSchema;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * Project Api
 *
 * @author Eason Liu
 * Create at: 2023/9/9
 */
@RestController
@RequestMapping(produces = "application/json;charset=UTF-8", path = "/project")
public class ProjectController {

    @Resource
    private ProjectListService projectListService;
    @Resource
    private ProjectDetailService projectDetailService;


    @PostMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * project list
     * categoryId = 0 / status = 0 , ignore
     *
     * @param categoryId
     * @param status
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ProjectListResponseSchema list(@RequestParam(name = "categoryId") int categoryId,
                                          @RequestParam(name = "status") int status) {
        return projectListService.process(categoryId, status);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public ProjectDetailResponseSchema detail(@RequestParam(name = "id") int id) {
        return projectDetailService.process(id);
    }


}
