def fields = ""
def getbranches = ("git ls-remote -t -h https://github.com/shrutika88/Calculator.git refs/heads/*").execute() 
def branchlist=[]

       branchlist = getbranches.text.readLines() 
	   .collect { it.split()[1].replaceAll('refs/heads/', '')  } 
	   .unique() 
	   .sort()
	   .reverse()
       .findAll()
	   
return branchlist
