package com.imooc.service;

import com.imooc.pojo.Category;
import com.imooc.pojo.vo.CategoryVO;
import com.imooc.pojo.vo.NewItemsVO;
import java.util.List;

/**
 * @author zhijiaju
 * @version 1.0
 * @date 2020/10/30 17:30
 */
public interface CategoryService {

    List<Category> queryAllRootLevelCat();

    List<CategoryVO> getSubCatList(Integer rootCatId);

    List<NewItemsVO> getSixNewItemsLazy(Integer rootCatId);

}
