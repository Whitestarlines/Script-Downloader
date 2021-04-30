#Opening Files
f = open("FileName.extension or Path/To/FileName.extension")

#Reading Files
f = open("FileName.extension or Path/To/FileName.extension", "r")
print(f.read())

#Writing in Files
f = open("FileName.extension or Path/To/FileName.extension", "a")
f.write("Now the file has more content!")
f.close()

#Create Files, This will create a new file and give an error if a file with the name provided already exists.
f = open("FileName.extension or Path/To/FileName.extension", "x")

#Delete Files
#If...Else Statements have been added so that it will not give an error if a file doesn't exist. 
import os
if os.path.exists("FileName.extension or Path/To/FileName.extension"):
  os.remove("FileName.extension or Path/To/FileName.extension")
else:
  print("The file does not exist")