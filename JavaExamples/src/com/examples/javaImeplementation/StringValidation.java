package com.examples.javaImeplementation;

import java.util.Scanner;
import java.util.Stack;

public class StringValidation {
	private  final char L_PAREN    = '<';
    private  final char R_PAREN    = '>';
    private  final char L_BRACE    = '{';
    private  final char R_BRACE    = '}';
    private  final char L_BRACKET  = '[';
    private  final char R_BRACKET  = ']';

    public boolean isBalanced(String s) {
    	
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {

            if      (s.charAt(i) == L_PAREN)   stack.push(L_PAREN);

            else if (s.charAt(i) == L_BRACE)   stack.push(L_BRACE);

            else if (s.charAt(i) == L_BRACKET) stack.push(L_BRACKET);

            else if (s.charAt(i) == R_PAREN) {
                if (stack.isEmpty())        return false;
                if (stack.pop() != L_PAREN) return false;
            }

            else if (s.charAt(i) == R_BRACE) {
                if (stack.isEmpty())        return false;
                if (stack.pop() != L_BRACE) return false;
            }

            else if (s.charAt(i) == R_BRACKET) {
                if (stack.isEmpty())        return false;
                if (stack.pop() != L_BRACKET) return false;
            }

            // ignore all other characters

        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the string");
		String s = sc.nextLine();
		System.out.println("input string " + s);
		StringValidation pr=new StringValidation();
		boolean b=pr.isBalanced(s);
		if(b){
			System.out.println("this is valid string");
		} else {
			System.out.println("not valid");
		}

	}

}