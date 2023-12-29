//Write a program to input any alphabet and check whether it is vowel or consonant.

package practice;

import java.util.Scanner;

public class VowelorConsonant {

	    public static void main(String[] args) {

	        char ch = 'z';

	        switch (ch) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println(ch + " is vowel");
	                break;
	            default:
	                System.out.println(ch + " is consonant");
	        }
	    }
	}