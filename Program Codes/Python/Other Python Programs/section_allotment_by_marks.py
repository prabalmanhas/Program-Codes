class PrabalPythonAssignment:
    
    def __init__(prabals):
        prabals.rollnumber=0
        prabals.name=""
        prabals.marks=[]
        prabals.total=0
        prabals.percentage=0
        prabals.section=""
        prabals.result=""

    print("++++++++++++++++++++++++++++++++++++++++++++++++++++++")
    print("SECTION ALLOTMENT PROGRAM ~ Made by PRABAL MANHAS")
    print("+++++++++++++++++++++++++++++++++++++++++++++++++++++++")
    
    
    def studentData(prabals):
        prabals.rollnumber=int(input("> 1. ENTER YOUR UID >>"))
        prabals.name=input("> 2. ENTER YOUR NAME >>")
        print("> 3. ENTER YOUR MARKS OF ALL 5 SUBJECTS, FOR SECTION ALLOTMENT >>\n")
        for i in range(5):
            prabals.marks.append(int(input("MARKS OF SUBJECT "+str(i+1)+" >> ")))
			
    def MarksCalculator(prabals):
        for x in prabals.marks:
            prabals.total+=x
			
    def PercCalculator(prabals):
        prabals.percentage=prabals.total/5
		
    def SecAlloter(prabals):
        if prabals.percentage>=80:
            prabals.section="A"
        elif prabals.percentage>=70-79:
            prabals.section="B"
        elif prabals.percentage>=60-69:
            prabals.section="C"

			
    def getResult(prabals):
        count=0
        for x in prabals.marks:
            if x>=50:
                count+=1
        if count==5:
            prabals.result="CONGRATS, PASSED!"
        elif count>=3:
            prabals.result="COMPARTMENT,TRY HARD NEXT TIME"
        else:
            prabals.result="SORRY FAILED,GOOD LUCK NEXT TIME"
			
    def showStudent(prabals):
        prabals.studentData()
        prabals.MarksCalculator()
        prabals.PercCalculator()
        prabals.SecAlloter()
        prabals.getResult()

        print("\n")
        print("<----------- BRANCH ~ B.E - CSE (INTERNET OF THINGS) IBM SPECIALIZED ----------->")
        print("DEAR STUDENT, THE SECTION ALLOTED TO YOU IS >>>",prabals.section)
        print("YOUR UID >>>",prabals.rollnumber,"  YOUR NAME >>>",prabals.name,"  YOUR PERCENTAGE >>>",prabals.percentage)
        print("\n")
        print("******* THANKYOU HAVE A GREAT TIME IN CHANDIGARH UNIVERISTY! *******")

def main():
    # Creating an Object for PrabalPythonAssignment
    s=PrabalPythonAssignment()
    s.showStudent()

if __name__=="__main__":
    main()