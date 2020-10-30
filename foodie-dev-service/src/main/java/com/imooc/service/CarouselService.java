package com.imooc.service;

import com.imooc.pojo.Carousel;

import java.util.List;

/**
 * @author zhijiaju
 * @version 1.0
 * @date 2020/10/30 14:49
 */
public interface CarouselService {
    List<Carousel> queryAll(Integer isShow);
}
