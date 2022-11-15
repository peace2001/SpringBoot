package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public String upLoad(String nickname, MultipartFile avatar, HttpServletRequest request)throws IOException {
        //获取文件类型
        System.out.println(avatar.getContentType());
        //获取文件原始名称
        System.out.println(avatar.getOriginalFilename());
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(avatar,path);
        return "success";

    }
    public void saveFile(MultipartFile avatar,String path) throws IOException{
        //判断目录是否存在，不存在就创建
        File dir = new File(path);
        if (!dir.exists()){
            dir.mkdir();
        }
        File file = new File(path+avatar.getOriginalFilename());
        avatar.transferTo(file);
    }

}
