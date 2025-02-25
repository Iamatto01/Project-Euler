n = 1
MaxDiv = int(input("Enter max divisor:")) 
i =1 
while i <= MaxDiv :
    if n % i == 0:
       
        i += 1
    else:
        n+=1
        i = 1
        
        
print(n)        