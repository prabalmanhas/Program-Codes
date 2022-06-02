firstside = float(input("enter the side 1:"))
secondside = float(input("enter the side 2:"))
thirdside = float(input("enter the side 3:"))

spmtr = (firstside+secondside+thirdside) / 2 

areaoftriangle = (spmtr*(spmtr-firstside)*(spmtr-secondside)*(spmtr-thirdside)) ** 0.5  
print ("The area of triangle is = ",areaoftriangle, "sq. units")
