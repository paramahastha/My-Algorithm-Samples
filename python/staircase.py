from __future__ import print_function

def staircase(n):
  for i in range(0,n):
    j = n
    while j > 0:
      if (j <= i+1):
        print("x", end="")
      else:
        print(" ",end="")
      j -= 1
    print("")
    
  

print(staircase(25))