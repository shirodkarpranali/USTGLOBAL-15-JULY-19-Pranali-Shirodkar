//break will break only loops not statement
//var val=2;
//if(val===2)
//{
  //  break;
    //console.log(val);
//}

var hobbies=['a','b','c'];
hobbies[3]='skipping';
hobbies['name']='jumping';
for(var i=0;i<hobbies.length;i++)
{
    if(hobbies[i])
    {
        break;
    }
}

console.log("=========================");
for(var value of hobbies){
    console.log("hobbies="+value);
}

console.log("=========================");
for(var value in hobbies){
    console.log("hobbies="+hobbies[index]);
}