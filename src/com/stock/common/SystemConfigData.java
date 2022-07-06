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
public class SystemConfigData {
    private static String actUsername;
    private static String actUsertype;
    private static String actEmpId;

    public static String getActUsername() {
        return actUsername;
    }

    public static void setActUsername(String aActUsername) {
        actUsername = aActUsername;
    }

    public static String getActUsertype() {
        return actUsertype;
    }

    public static void setActUsertype(String aActUsertype) {
        actUsertype = aActUsertype;
    }

    public static String getActEmpId() {
        return actEmpId;
    }

    public static void setActEmpId(String aActEmpId) {
        actEmpId = aActEmpId;
    }
}
