package com.gengdan.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author ShiJiaWei
 * @version 1.0
 * @date 2020/9/29 09:01
 */
@Controller
@RequestMapping("file")
public class FileUploadController {

    @GetMapping("/showFileUploadForm")
    public String showFileUploadForm(){
        return "/file";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file){
        if(file.isEmpty()){
            return "/uploadERROR";
        }
        String fileName=file.getOriginalFilename();
        String filePath="/Users/fushengyuanwuhui/Downloads/upload/";
        File dest=new File(filePath+fileName);
        try{
            file.transferTo(dest);
            return "/uploadSuccess";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "/uploadERROR";
    }

    @GetMapping("showSomeFilesUploadForm")
    public String showSomeFilesUploadForm(){
        return "someFiles";
    }

    @PostMapping("uploadSomeFiles")
    public String uploadSomeFiles(@RequestParam("files") MultipartFile[] files){
        for(int i=0;i<files.length;i++){
            String filePath="/Users/fushengyuanwuhui/Downloads/upload1/";
            if(!files[i].isEmpty()){
                String fileName=files[i].getOriginalFilename();
                File dest=new File(filePath+fileName);
                try{
                    files[i].transferTo(dest);
                } catch (IOException e) {
                    e.printStackTrace();
                    return "uploadERROR";
                }
            }
        }
        return "/uploadSuccess"; }

}
