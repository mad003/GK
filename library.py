with open("readme.md","r") as file:
  data = file.read()

 with open("test.txt","wb") as file2:
  file2.write(data)
 
print("writing done")
