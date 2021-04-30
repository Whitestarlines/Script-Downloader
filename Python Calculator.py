import time
n1 = float(input("Type your first number : "))
n2 = float(input("Type your second number : "))
c = input("What operation do you want to do? +, -, /, * or % : ")
if n1 == 0 and n2 == 0:
	if c == "/":
	   print("Sorry, You cannot Divide 0 by 0")

if c == "+":
	a=n1+n2
	print("",n1, " ",c, " ",n2, " = ",a)
elif c == "/":	
	a=n1/n2
	print("",n1, " ",c, " ",n2, " = ",a)
elif c == "*":
	a=n1*n2
	print("",n1, " ",c, " ",n2, " = ",a)
elif c == "-":
	a=n1-n2
	print("",n1, " ",c, " ",n2, " = ",a)	
elif c == "%":
	a=n1%n2
	print("",n1, " ",c, " ",n2, " = ",a)
else:
	print("Sorry we could not understand your operation, please try again and use : *, /, +, - or %")
time.sleep(10)