package com.example.gitaction.service;

import org.springframework.stereotype.Service;

@Service
public class Helloword {
    public int calulate(int a, int b)
    {
        int c = a *b;
        c +=1;
        return c;
    }
}
