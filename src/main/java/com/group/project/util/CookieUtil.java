package com.group.project.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class CookieUtil {
    private static final Integer cookieExpire = 60 * 60 * 24 * 1; // 1 day

    static final Logger LOGGER = LoggerFactory.getLogger(CookieUtil.class);
    
    /**
     * Save Cookie
     * @param cid
     * @param value
     * @param res
     */
    public static void setCookie(String cid, String value, HttpServletResponse res) {

        Cookie ck = null;
        try {
            ck = new Cookie(cid, URLEncoder.encode(value, "utf-8"));
        }catch(Exception ex){
            LOGGER.debug("#setCookie error:"+ex.getMessage());
        }
        ck.setPath("/");
        ck.setMaxAge(cookieExpire);
        res.addCookie(ck);        
    }

    /**
     * Remove Cookie
     * @param cid
     * @param res
     */
    public static void delCookie(String cid, HttpServletResponse res) {

        Cookie ck = new Cookie(cid, "");
        ck.setPath("/");
        ck.setMaxAge(0);
        res.addCookie(ck);
    }

    /**
     * Get Cookie
     * @param cid
     * @param request
     * @return
     */
    public static String getCookie(String cid, HttpServletRequest request) {
        String ret = "";

        if (request == null) {
            return ret;
        }
        
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return ret;
        }
        
        for (Cookie ck : cookies) {
            if (ck.getName().equals(cid)) {
                try {
                    ret = URLDecoder.decode(ck.getValue(), "utf-8");
                }catch(Exception ex){
                    LOGGER.debug("#getCookie error:"+ex.getMessage());
                }
                
                ck.setMaxAge(cookieExpire);
                break; 
            }
          }
        return ret; 
    }
   
}

