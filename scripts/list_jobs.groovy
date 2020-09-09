import hudson.model.Hudson
for(jobObj in Hudson.instance.items){
  println(jobObj.name)
}
