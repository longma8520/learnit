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
@RequestMapping("/v0.1/papers")
@Api(value = "PaperController", description = "文章接口")
public class PaperController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ApiOperation(value = "增加职业")
    public List<PaperVo> addPapers(@RequestBody List<PaperVo> paperVos) {
        return null;
    }

    @RequestMapping(value = "/{paper_id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "删除文章")
    public void deleteCareer(@ApiParam(value = "文章ID") @PathVariable(value = "paper_id") UUID paperId) {
    }

    @RequestMapping(value = "/{paper_id}", method = RequestMethod.PUT)
    @ApiOperation(value = "修改文章信息")
    public PaperVo updatePaper(@ApiParam(value = "文章ID") @PathVariable(value = "paper_id") UUID paperId,
                               @RequestBody PaperVo paperVo) {
        return null;
    }

}
