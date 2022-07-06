/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stock.common;

/**
 *
 * @author pasindu hathurushigh
 */
public class FormatText {

    public static String nameFormat(String name) {
        String nameArr[] = name.split(" ");
        String formatted_name = "";
        for (String part : nameArr) {
            String formatted_part = part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
            formatted_name += formatted_part + " ";
        }
        return formatted_name.trim();
    }

}
