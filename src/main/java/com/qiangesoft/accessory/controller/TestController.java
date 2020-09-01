package com.qiangesoft.accessory.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;

@RestController
public class TestController {

    @Autowired
    private DefaultKaptcha defaultKaptcha;

    /**
     * 生成验证码
     *
     * @param request
     * @throws IOException
     */
    @RequestMapping("/Captch")
    @RequiresPermissions("user:update")
    public String Captch(HttpServletRequest request) {
        byte[] captchaChallengeAsJpeg;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            String verificationCodeText = defaultKaptcha.createText();
            //加入到session方便后面验证
            request.getSession().setAttribute("captcha",verificationCodeText);
            BufferedImage image = defaultKaptcha.createImage(verificationCodeText);
            ImageIO.write(image,"jpg",outputStream);
            captchaChallengeAsJpeg = outputStream.toByteArray();
            String s = Base64.getEncoder().encodeToString(captchaChallengeAsJpeg);

//            BASE64Decoder decoder = new BASE64Decoder();
//            byte[] data = decoder.decodeBuffer(s);
//            for(int i =0 ; i < data.length ;i++) {
//                if(data[i] < 0) {
//                    data[i] += 256;
//                }
//            }
//            //写入保存成jpeg文件
//            FileOutputStream fos = new FileOutputStream ("D:\\test.jpg");
//            fos.write(data);
//            fos.flush();
//            fos.close();
            return s;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return "验证码生成失败，请重试";
    }

    /**
     * 生成验证码
     *
     * @param request
     * @throws IOException
     */
//    @RequestMapping("/Captcha.jpg")
//    public void Captcha(HttpServletRequest request, HttpServletResponse response) {
//        try {
//            OutputStream outputStream = response.getOutputStream();
//            //设置相应类型,告诉浏览器输出的内容为图片
//            response.setContentType("image/jpeg");
//
//            //设置响应头信息，告诉浏览器不要缓存此内容
//            response.setHeader("Pragma", "No-cache");
//            response.setHeader("Cache-Control", "no-cache");
//            response.setDateHeader("Expire", 0);
//
//            String verificationCodeText = defaultKaptcha.createText();
//            //加入到session方便后面验证
//            request.getSession().setAttribute("captcha", verificationCodeText);
//            BufferedImage image = defaultKaptcha.createImage(verificationCodeText);
//            ImageIO.write(image, "jpg", outputStream);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}
