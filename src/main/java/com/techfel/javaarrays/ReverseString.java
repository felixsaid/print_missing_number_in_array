/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techfel.javaarrays;

/**
 *
 * @author kiamba felix 
 */
public class ReverseString {
    //using recursion
    private static String reverse(String str)
    {
        //check if string is null or empty
        if (str == null || str.equals(""))
            return str;
 
        //last character + recur for remaining string
        return str.charAt(str.length() - 1) +
                reverse(str.substring(0, str.length() - 1));
    }
 
    public static void main (String[] args)
    {
        String str = "Felix Kiamba";
 
        str = reverse(str);
 
        System.out.println("Reverse of the string is : " + str);
    }
}
