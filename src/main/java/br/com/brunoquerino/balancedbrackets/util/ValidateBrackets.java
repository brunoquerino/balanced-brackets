/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brunoquerino.balancedbrackets.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bruno
 */
public class ValidateBrackets {

    public static boolean isValidBrackets(String expr) {
        Pattern innerBrackets = Pattern.compile("([(]([^()]*)[)])|([{]([^{}]*)[}])|([\\[]([^\\[\\]]*)[\\]])");
        Matcher m = innerBrackets.matcher(expr);
        while (m.find()) {
            String exprInto = expr.substring(m.start() + 1, m.end() - 1);
            if (!isValidBrackets(exprInto)) {
                return false;
            }
            expr = expr.substring(0, m.start()) + expr.substring(m.end());
            m = innerBrackets.matcher(expr);
        }
        return !Pattern.compile("[(){}\\[\\]]").matcher(expr).find();

    }
}
