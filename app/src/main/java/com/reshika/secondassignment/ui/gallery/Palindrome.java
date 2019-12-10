package com.reshika.secondassignment.ui.gallery;

public class Palindrome {
    public int reverse(int num){
        int r, rev=0;
        while(num>0){
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        return rev;
    }
}
