package com.learnit.api;

import com.learnit.model.po.Career;
import com.learnit.model.po.Category;
import com.learnit.model.vo.PaperVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v0.1/career")
@Api(value = "CareerController", description = "职业接口")
public class CareerController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ApiOperation(value = "增加职业")
    public List<Career> addCategories(@RequestBody List<Career> careers) {
        return null;
    }

    @RequestMapping(value = "/{career_id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除职业分类")
    public void deleteCareer(@ApiParam(value = "职业ID") @PathVariable(value = "career_id") UUID careerId) {
    }

    @RequestMapping(value = "/{career_id}", method = RequestMethod.PUT)
    @ApiOperation(value = "修改职业信息")
    public Category updateCategory(@ApiParam(value = "职业ID") @PathVariable(value = "career_id") UUID careerId,
                                   @RequestBody Career career) {
        return null;
    }

    @RequestMapping(value = "/{career_id}/papers", method = RequestMethod.GET)
    @ApiOperation(value = "获取职业下的文章列表")
    public List<PaperVo> getPapers(@ApiParam(value = "职业ID") @PathVariable(value = "career_id") UUID careerId) {
        return null;
    }

}
