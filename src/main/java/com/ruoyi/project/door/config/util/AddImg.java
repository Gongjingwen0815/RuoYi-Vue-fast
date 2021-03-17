package com.ruoyi.project.door.config.util;


import com.ruoyi.project.door.domain.DoorOpenRecord;
import com.ruoyi.project.door.domain.UserInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
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
            String filePath = "E:\\eCloud\\RuoYi-Vue-fast\\src\\main\\resources\\webapp\\images";
            //获取原始图片的拓展名 即原来的文件名在客户机的文件系统名称  就是你要上传的图片在电脑中的名字
            String originalFilename = file.getOriginalFilename();
            System.out.println("originalFilename"+originalFilename);
            //新的文件名字  在你图片原始名字的前面添加随机数 不会出现名字重复的问题
//            String newFileName = UUID.randomUUID() + originalFilename;
            //封装上传文件位置的全路径  把你要保存的文件的路径和图片的新名字连到一起，得到这个文件位置的全路径
            File targetFile = new File(filePath,originalFilename);
//            File targetFile = new File(filePath, newFileName);
            System.out.println("targetFile"+targetFile);//targetFileE:\eCloud\blog-test\test\src\main\webapp\images\71bbd566-1c64-45e0-8b6c-4929582ef47bQQ图片20200726223852.png
            //把本地文件  上传到 封装上传文件位置的全路径 主要把MultipartFile转换为File
            file.transferTo(targetFile);
            user.setOriginalPicture(filePath+"\\"+originalFilename);

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
            /*String filePath = "E:\\eCloud\\RuoYi-Vue-fast\\src\\main\\resources\\webapp\\images";
            //获取原始图片的拓展名 即原来的文件名在客户机的文件系统名称  就是你要上传的图片在电脑中的名字
            String originalFilename = file.getOriginalFilename();
            System.out.println("originalFilename"+originalFilename);
            //新的文件名字  在你图片原始名字的前面添加随机数 不会出现名字重复的问题
            String newFileName = UUID.randomUUID() + originalFilename;
            //封装上传文件位置的全路径  把你要保存的文件的路径和图片的新名字连到一起，得到这个文件位置的全路径
            File targetFile = new File(filePath, newFileName);
            System.out.println("targetFile"+targetFile);//targetFileE:\eCloud\blog-test\test\src\main\webapp\images\71bbd566-1c64-45e0-8b6c-4929582ef47bQQ图片20200726223852.png
            //把本地文件  上传到 封装上传文件位置的全路径 主要把MultipartFile转换为File
            file.transferTo(targetFile);
            doorOpenRecord.setOriginalPicture(filePath+"\\"+newFileName);*/

            String newFilePath = "E:\\eCloud\\RuoYi-Vue-fast\\src\\main\\resources\\webapp\\newImages";
            //获取原始图片的拓展名 即原来的文件名在客户机的文件系统名称  就是你要上传的图片在电脑中的名字
            String newOriginalFilename = newFile.getOriginalFilename();
            System.out.println("originalFilename"+newOriginalFilename);
            //新的文件名字  在你图片原始名字的前面添加随机数 不会出现名字重复的问题
//            String newNewFileName = UUID.randomUUID() + newOriginalFilename;
            //封装上传文件位置的全路径  把你要保存的文件的路径和图片的新名字连到一起，得到这个文件位置的全路径
            File newTargetFile = new File(newFilePath, newOriginalFilename);
            System.out.println("newTargetFile"+newTargetFile);//targetFileE:\eCloud\blog-test\test\src\main\webapp\images\71bbd566-1c64-45e0-8b6c-4929582ef47bQQ图片20200726223852.png
            //把本地文件  上传到 封装上传文件位置的全路径 主要把MultipartFile转换为File
            newFile.transferTo(newTargetFile);
            doorOpenRecord.setContrastingPicture(newFilePath+"\\"+newOriginalFilename);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}

