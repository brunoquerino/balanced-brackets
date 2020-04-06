/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brunoquerino.balancedbrackets;

import br.com.brunoquerino.balancedbrackets.util.ValidateBrackets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bruno
 */
public class Main {
    
    public static void main(String[] args) {
       if(args.length == 0){
           System.out.println("Missing argument 1 ");
       }
       if(ValidateBrackets.isValidBrackets(args[0])){
           System.out.println("OK - The brackets is valid.");
       }else{
           System.out.println("Brackets are not valid.");
       }
    }

    
    
}
