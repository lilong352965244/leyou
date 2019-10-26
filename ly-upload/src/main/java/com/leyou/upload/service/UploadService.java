package com.leyou.upload.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author: lifalong
 * @create: 2019-10-25 19:00
 * @description:
 **/
public interface UploadService  {

    /**
     * 文件上传
     * @param file
     * @return
     */
    String upload(MultipartFile file);
}
