package com.learnit.api;

import com.learnit.model.po.Career;
import com.learnit.model.po.Category;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v0.1/categories")
@Api(value = "CategoryController", description = "职业分类接口")
public class CategoryController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ApiOperation(value = "获取职业分类列表")
    public List<Category> getCategories() {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ApiOperation(value = "增加职业分类")
    public List<Category> addCategories(@RequestBody List<Category> categories) {
        return null;
    }

    @RequestMapping(value = "/{category_id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除职业分类")
    public void deleteCategory(@ApiParam(value = "分类ID") @PathVariable(value = "category_id") UUID categoryId) {
    }

    @RequestMapping(value = "/{category_id}", method = RequestMethod.PUT)
    @ApiOperation(value = "修改分类信息")
    public Category updateCategory(@ApiParam(value = "分类ID") @PathVariable(value = "category_id") UUID categoryId,
                                   @RequestBody Category category) {
        return null;
    }

    @RequestMapping(value = "/{category_id}/careers", method = RequestMethod.GET)
    @ApiOperation(value = "根据分类获取职业")
    public List<Career> getCareers(@ApiParam(value = "分类ID") @PathVariable(value = "category_id") UUID categoryId) {
        return null;
    }

}
