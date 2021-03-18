package com.ruoyi.project.door.config.util;


import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.project.door.domain.DoorOpenRecord;
import com.ruoyi.project.door.domain.UserInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class AddImg {

    /**
     * 记录人员录入的图片
     * @param user
     * @param file
     */
    public void AddUpdateImg(UserInfo user, MultipartFile file) {
        try {
            /**
             * 上传图片
             */
//            String filePath = "E:\\eCloud\\RuoYi-Vue-fast\\src\\main\\resources\\webapp\\images";
            String filePath = "C:\\Users\\yiyun\\Desktop\\yiyun_face_recognition\\face_dataset";
            File targetDir = new File(filePath);
            if (!targetDir.exists()) {
                targetDir.mkdirs();
            }
            String name = user.getName();
            System.out.println("=========================================="+name);
            //获取原始图片的拓展名 即原来的文件名在客户机的文件系统名称  就是你要上传的图片在电脑中的名字
            String originalFilename = file.getOriginalFilename();
            // 截取上传文件的后缀 表示从最后一个点之后截取
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
            String filename = name + suffix;
            System.out.println("filename=========================="+filename);
            System.out.println("originalFilename"+originalFilename);
            //新的文件名字  在你图片原始名字的前面添加随机数 不会出现名字重复的问题
//            String newFileName = UUID.randomUUID() + originalFilename;
            //封装上传文件位置的全路径  把你要保存的文件的路径和图片的新名字连到一起，得到这个文件位置的全路径
            File targetFile = new File(filePath,filename);
//            File targetFile = new File(filePath, newFileName);
            System.out.println("targetFile"+targetFile);//targetFileE:\eCloud\blog-test\test\src\main\webapp\images\71bbd566-1c64-45e0-8b6c-4929582ef47bQQ图片20200726223852.png
            //把本地文件  上传到 封装上传文件位置的全路径 主要把MultipartFile转换为File
            file.transferTo(targetFile);
            user.setOriginalPicture(filePath+"\\"+filename);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    /**
     * 进出记录的图片
     * @param doorOpenRecord
     * @param
     */
    public void AddRecordImg(DoorOpenRecord doorOpenRecord,MultipartFile newFile) {
        try {
            /**
             * 上传图片
             */

//            String newFilePath = "E:\\eCloud\\RuoYi-Vue-fast\\src\\main\\resources\\webapp\\newImages";
            String newFilePath = "C:\\Users\\yiyun\\Desktop\\yiyun_face_recognition\\log_picture";
            //要在指定路径下，创建当前时间的文件夹，然后把图片放到当前时间文件夹下
            Date date = new Date();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
            System.out.println(sf.format(date));
            String newFilePathDate = newFilePath+"/"+sf.format(date);
            //获取原始图片的拓展名 即原来的文件名在客户机的文件系统名称  就是你要上传的图片在电脑中的名字
            String newOriginalFilename = newFile.getOriginalFilename();
            System.out.println("originalFilename"+newOriginalFilename);
            File targetDir = new File(newFilePathDate);
            if (!targetDir.exists()) {
                targetDir.mkdirs();
            }
            //新的文件名字  在你图片原始名字的前面添加随机数 不会出现名字重复的问题
//            String newNewFileName = UUID.randomUUID() + newOriginalFilename;
            //封装上传文件位置的全路径  把你要保存的文件的路径和图片的新名字连到一起，得到这个文件位置的全路径
            File newTargetFile = new File(newFilePathDate, newOriginalFilename);
            System.out.println("newTargetFile"+newTargetFile);//targetFileE:\eCloud\blog-test\test\src\main\webapp\images\71bbd566-1c64-45e0-8b6c-4929582ef47bQQ图片20200726223852.png
            //把本地文件  上传到 封装上传文件位置的全路径 主要把MultipartFile转换为File
            newFile.transferTo(newTargetFile);
            doorOpenRecord.setContrastingPicture(newFilePathDate+"\\"+newOriginalFilename);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}

