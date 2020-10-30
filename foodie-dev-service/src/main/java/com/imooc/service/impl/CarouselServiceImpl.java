package com.imooc.service.impl;

import com.imooc.mapper.CarouselMapper;
import com.imooc.pojo.Carousel;
import com.imooc.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author zhijiaju
 * @version 1.0
 * @date 2020/10/30 14:50
 */
@Service
public class CarouselServiceImpl implements CarouselService {

    @Autowired
    private CarouselMapper carouselMapper;

    @Override
    public List<Carousel> queryAll(Integer isShow) {
        Example exapmle = new Example(Carousel.class);
        exapmle.orderBy("sort").desc();
        Example.Criteria criteria = exapmle.createCriteria();
        criteria.andEqualTo("isShow", isShow);
        List<Carousel> result = carouselMapper.selectByExample(exapmle);
        return result;
    }
}
