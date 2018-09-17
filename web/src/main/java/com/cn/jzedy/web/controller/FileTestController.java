package com.cn.jzedy.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.cn.jzedy.core.controller.BaseController;
import org.apache.commons.fileupload.FileUploadException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * @author Jzedy
 * @date 2018/8/8
 */
@Controller
@RequestMapping(value = "/file")
public class FileTestController extends BaseController {

    @RequestMapping(value = "/receive")
    @ResponseBody
    public JSONObject fileTest(String plateformcode, String prejudicno, String MktProdType, String filename, @RequestBody() MultipartFile file, HttpServletRequest request) throws FileUploadException {
        try {
            InputStream in = file.getInputStream();
            FileOutputStream os = new FileOutputStream(new File("E://" + filename));
            byte[] bytes = new byte[1024];
            int n;
            while ((n= in.read(bytes)) != -1){
                os.write(bytes,0,n);
            }
            os.flush();
            os.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("platefo:"+plateformcode);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hash","00");
        jsonObject.put("bucket","成功");
        return jsonObject;
    }
}
