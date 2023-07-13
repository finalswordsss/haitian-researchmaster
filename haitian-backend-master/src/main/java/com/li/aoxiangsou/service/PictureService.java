package com.li.aoxiangsou.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.li.aoxiangsou.model.entity.Picture;

/**
 * 图片服务
 *

 */
public interface PictureService {

    Page<Picture> searchPicture(String searchText, long pageNum, long pageSize);
}
