'''
PRABAL MANHAS 20BCS4513
20BIT-1/A
'''
print(">>>> PRABAL MANHAS | 20BCS4513 | SOL 2 <<<<\n")

#Creating a class Vehicle
class Vehicle:

    def __init__(self, name, max_speed, mileage):
        self.name = name
        self.max_speed = max_speed
        self.mileage = mileage

# Creating child class BUS to inherit  all the variables and methods of Vehicle Class
class Bus(Vehicle):
    pass

# Printing the desired output of vehicle name, speed and mileage

School_bus = Bus("SCHOOL VOLVO", 180, 12)
print("VEHICLE NAME > ", School_bus.name, "SPEED > ", School_bus.max_speed, "MILEAGE > ", School_bus.mileage)