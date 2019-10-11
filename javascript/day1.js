var fruits=['apple','mango','papaya','banana','jackfruit'];
console.log(fruits);

for(var i=0;i<fruits.length;i++){
    console.log(fruits[i]);
}

var vegetables=['brinjal','carrot'];
for(var j=0;j<vegetables.length;j++)
{
    console.log(vegetables[j]);
}

var todayDate=new Date();
console.log("todays date=" +todayDate);

var Date=new Date(2018,11,24,10,33,30,0);
console.log("date=" +Date);

var month= ['jan','feb','mar','apr','may','jun','july','aug','sept','oct','nov','dec'];
var day=['sun','mon','tue','wed','thu','fri','sat'];
console.log(month[todayDate.getMonth()]);
console.log(day[todayDate.getDay()]);

console.log(Math.ceil(4,6));
console.log(Math.random());
console.log(Math.floor(4.4));
console.log(Math.round(7.4));
console.log(Math.pow(5,5));
console.log(Math.random()*10+Math.random());

//primitive type
var name='rahul';
console.log(name);
var name1=name;
console.log(name1);
name1='gandhi';
console.log(name);
console.log(name1);

//reference type
var person={
    name:'tanu'
};
console.log(person.name);
var person1=person;
console.log(person1.name);
person1.name='Anu';
console.log(person.name);
console.log(person1.name);

//array using new as keyword
var fruits=new Array('apple','mango','jackfruit','coconut');
console.log(fruits);

