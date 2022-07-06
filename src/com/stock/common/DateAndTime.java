/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stock.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pasindu hathurushigh
 */
public class DateAndTime {
     public static String getDateTime(){
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        String format_date = sdf.format(d);
        
        return format_date;
    }
     public static String getDate(){
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        String format_date = sdf.format(d);
        
        return format_date;
    }
}
