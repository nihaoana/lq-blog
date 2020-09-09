package com.qiangesoft.accessory.controller;

import com.qiangesoft.util.CaptchaUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

@RestController
public class TestController {

    @Autowired
    private CaptchaUtil captchaUtil;

    /**
     *
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
            StringBuffer verificationCodeText = new StringBuffer();
            //加入到session方便后面验证
            request.getSession().setAttribute("captcha",verificationCodeText);
            BufferedImage image = captchaUtil.genRandomCodeImage(verificationCodeText);
            ImageIO.write(image,"jpg",outputStream);
            captchaChallengeAsJpeg = outputStream.toByteArray();
            String base64 = Base64.getEncoder().encodeToString(captchaChallengeAsJpeg);
            return base64;
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

}
