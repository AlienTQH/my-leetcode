
a = 'abcabcbb'
aa = 'bbbbb'
aaa = " "

def ss(s):
    b = list(s)
    sub_str = []
    flag = 1
    if len(s) == 0:
        return 0
    for i in range(len(s)):
        sub_str = [s[i]]
        b.pop(0)
        for j in range(len(b)):
            if b[j] not in sub_str:
                sub_str.append(b[j])
                if flag < len(sub_str):
                    flag = len(sub_str)
            else:
                break
    return flag


print(ss(a))
