#!/usr/bin/env python3
# -*- coding: utf-8 -*-
# @Time    : 2021/8/19 20:36
# @Author  : Tianqunhui
# @contact : tqunhui@163.com
# @File    : 345.py
# @Software: PyCharm


def reverseVowels(self, s: str) -> str:
    n = len(s)
    if n == 1:
        return s

    yyzm = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
    s_list = list(s)
    s1 = []

    for i in range(n):
        if s_list[i] in yyzm:
            s1.append(s_list[i])
            s_list[i] = 'a'
    n1 = len(s1)
    print(s1)
    if n1 <= 1:
        return s

    for i in range(n):
        if s_list[i] == 'a' and n1 > 0:
            s_list[i] = s1[n1 - 1]
            n1 = n1 - 1

    return ''.join(s_list)