package cn.qqcn.controller;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.qqcn.common.vo.Result;
import cn.qqcn.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/excel")
public class ExcelController {

    @PostMapping("/import")
    public Result<Object> fileUpload(@RequestParam("file") MultipartFile file) {
        try {
            //使用hutool工具类导入Excel文件
            ExcelReader reader = ExcelUtil.getReader(file.getInputStream());
            //读取excel中的数据，与User实体类一一对应
            List<User> listData = reader.readAll(User.class);
            //批量存入数据库中
            //userTaskService.saveImportTask(listData);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Result.success("上传成功");
    }

}
