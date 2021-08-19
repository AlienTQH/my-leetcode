def zws(nums1,nums2):
    len1 = len(nums1)
    len2 = len(nums2)
    if len1 == 0:
        if len2 % 2  == 0:
            return (nums2[int(len2/2) - 1] + nums2[int(len2/2)])/2.0
        else:
            return nums2[int(len2 / 2 )]
    if len2 == 0:
        if len1 %2 == 0:
            return (nums1[int(len1/2)-1] + nums1[int(len1/2) ])/2.0
        else:
            return nums1[int(len1 / 2)]

    # i = 0
    # flag = 1
    # while len(nums2)!=0:
    #     temp = nums2.pop(0)
    #     print(nums2)
    #     while len(nums1)!=i:
    #         if temp > nums1[i]:
    #             pass
    #         else:
    #             nums1.insert(i,temp)
    #         i += 1

        # nums1 = nums1 + nums2
        # break



    i = 0
    for j in range(len2):
        print('j =====  ' + str(j))
        while 1:
            print('i is  '+str(i))
            if i == len(nums1):
                break
            if nums2[j] > nums1[i]:
                i += 1
            else:
                print('插入 i is  ' + str(i))
                print('nums2[j] is  ' + str(nums2[j]))
                nums1.insert(i, nums2[j])
                # i += 1
                break
        if (j+1) == len2:
            temp = nums2.pop(j)
            if temp in nums1:
                pass
            else:
                nums1 += [temp]

            # print(nums2.pop(j))
            break
        if i == len1:
            nums1 = nums1 + nums2
            break

    new_len = len(nums1)
    print(nums1)
    if new_len % 2 == 0:
        return (nums1[int(new_len / 2) - 1] + nums1[int(new_len / 2)]) / 2.0
    else:
        return nums1[int(new_len / 2)]



nums1 = [3]
nums2 = [-2.,-1]
print(zws(nums1,nums2))