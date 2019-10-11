var fruits =['Apple','Orange','Banana','Mango'];
console.log(fruits);
fruits[4]='grapes';

for(var i=0;i<fruits.length;i++)
{
  console.log(fruits[i]);
}

var todayDate = new Date();
console.log("Todays Date= " +todayDate);

var date=new Date(0);
console.log("Date= " +date);

var ndate= new Date("October 13,2014 11:13:00");
console.log("nDate= " +ndate);

var todayDate=new Date();
todayDate.getFullYear();
todayDate.getMonth();
todayDate.getDay();
todayDate.getDate();

var month=['jan','feb','march','apr','may','june','july','august','sept','octo','nov','dec'];
var day=['sun','mon','tue','wed','thu','fri','sat'];
console.log(month[todayDate.getMonth()]);
console.log(day[todayDate.getDay()]);

console.log(Math.ceil(4.6));
console.log(Math.random());
console.log(Math.floor(4.5));
console.log(Math.round(7.9));
console.log(Math.pow(2,3));
console.log(Math.random()*10+Math.random());
for(var i=10;i<100;i++)
{
    console.log(Math.random()+i);
}

var name ='Rahul';
console.log(name);
var name1=name;
console.log(name1);
name1= 'gandhi';
console.log(name); 
console.log(name1);

var person ={
    name:'tanu'
};
console.log(person.name);
var person1 = person;
console.log(person1.name);
person1.name ='Anu';
console.log(person.name);
console.log(person1.name);






function newFunction() {
    var fruits = ['Apple', 'Orange', 'Banana', 'Mango'];
    console.log(fruits);
}
 
console.log("================");
var num1=10;
var name= 'MyName';
var num2='10';
if(num1==num2)
{
  console.log("equal");
}
else
{
  console.log("not equal");
}
///////
var num1=10;
var name= 'MyName';
var num2='10';

if(num1===num2)
{
  console.log("equal");
}
else
{
  console.log("not equal");
}
//if condition
var num1=10;
var num3=20;
var equals=(num1==num3)?'true':'false';
console.log("ans=" +equals);

//else if condition
var num1=10;
var num3=20;
var value=(num1>10)?'greater':(num1===10)?'equal':'lesser';
console.log("ANS=" +value);

//type of operator
var MyAge=50;
typeof MyAge;
console.log("my age=" +MyAge);

var MyName='charan';
typeof MyName;
console.log("my name="+MyName);

var hobbies=['coding','singing','cricket','bike riding']
typeof hobbies;
console.log("my hobby="+hobbies);

var hobbies=['coding','singing','cricket','bike riding'];
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
}

for(var index in hobbies)
{
  console.log("hobbies= " +hobbies[index]);
}

//forin
var person={
  name='chandan',
  age=32
};
for(var index in person)
{
  console.log(person[i]);
}

//forof
var hobbies=['a','b','c'];
for(var value of hobbies)
{
  console.log(value);
}













