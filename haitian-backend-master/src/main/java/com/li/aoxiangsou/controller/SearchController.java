package com.li.aoxiangsou.controller;

import com.li.aoxiangsou.model.dto.search.SearchRequest;
import com.li.aoxiangsou.model.vo.SearchVO;
import com.li.aoxiangsou.common.BaseResponse;
import com.li.aoxiangsou.common.ResultUtils;
import com.li.aoxiangsou.manager.SearchFacade;
import com.li.aoxiangsou.service.PictureService;
import com.li.aoxiangsou.service.PostService;
import com.li.aoxiangsou.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片接口
 *

 */
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

    @Resource
    private UserService userService;

    @Resource
    private PostService postService;

    @Resource
    private PictureService pictureService;

    @Resource
    private SearchFacade searchFacade;

    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
        return ResultUtils.success(searchFacade.searchAll(searchRequest, request));
    }

}
