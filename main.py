def bubbleSort(listNum:list,ascending:bool):
    if ascending == True:
        for y in range(len(listNum)-1):
            for x in range(0,len(listNum)-1-y):
                if listNum[x] > listNum[x+1]:
                    temp = listNum[x]
                    listNum[x] = listNum[x+1]
                    listNum[x+1] = temp
                    #print(listNum)
    if ascending == False:
        for y in range(len(listNum)-1):
            for x in range(0,len(listNum)-1-y):
                if listNum[x] < listNum[x+1]:
                    temp = listNum[x]
                    listNum[x] = listNum[x+1]
                    listNum[x+1] = temp
                    #print(listNum)
    return listNum

listNum = [3,6,4,7,5,4,9]


if __name__ == "__main__":
    print(bubbleSort(listNum,True))
    print(bubbleSort(listNum,False))
