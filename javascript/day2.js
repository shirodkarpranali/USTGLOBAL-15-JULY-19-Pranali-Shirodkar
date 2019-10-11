var num1=10;
var name= 'my name';
var num2='10';
if(num1===num2){
    console.log("equal");
}
else{
    console.log("not equal");
}
//if condition in js ternry operator
var equals=(num1===num2)?'true':'false';
console.log("ans="+equals);

//else if in ternary
var comp=(num1>11)?'greater':(num1===11)?'equal':'smaller';
console.log("op="+comp);

//typeof operator
var myAge=50;
console.log(typeof myAge);
var myName='pranali';
console.log(typeof myName);
var hobbies=['cricket','bike riding','coding', ,];
console.log(typeof hobbies);
console.log(Array.isArray(hobbies));

//complex array
var library=[
    {author:'bill gates',title:'the road ahead',bookId:1254},
    {author:'steve jobs',title:'walter sacson',bookId:4264},
    {author:'suzanne collins',title:'Mockingjay: the final books of the hunger games',bookId:3254},
    
    ];
    for(var i=0;i<library.length;i++)
    {
      console.log(library[i]);
    }
    
    for(var i=0;i<library.length;i++)
    {
      console.log(library[i].author);
      console.log(library[i].title);
    }
    // forof,forin,foreach
    var person={
        name:'tanu',
        
    };
    for(var index in hobbies)
    {
      console.log("hobbies= " +hobbies[index]);
    }

    for(var index in person){
        console.log(person[index]);
    }

    for(var index of hobbies){
        console.log("hobbies=" +hobbies[index]);
    }
    //break will break only loops,not statemnt.

    //adding value in array
    console.log("==========================================");
    hobbies[5]='table tennis';
    hobbies['name']='jumping';

    for(var index in hobbies){
        console.log("hobbies=" +hobbies[index]);
    }
    
    for(var index of hobbies){
        console.log("hobbies=" +[index]);
    }

    




