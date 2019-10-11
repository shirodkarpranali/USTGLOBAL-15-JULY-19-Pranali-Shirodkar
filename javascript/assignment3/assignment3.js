//for each
var cricketers=['sachin','dhoni','virat','rohit'];
cricketers.forEach(function(value,index){
    console.log("cricketers name=" +value);
});

var cartoons=['Tom','jerry','doremon','chota bheem'];
cartoons.forEach(function(value,index){
    console.log("cartoons=" +value);
});

//is array
var hobbies=['coding','singing','cricket','bike riding'];
console.log(Array.isArray(hobbies));

var friends=['neha','aishwarya','janhavi','souvik','shubham'];
console.log(Array.isArray(friends));
// push method
cricketers.push('ajinkya','pandya');
console.log("insert last element="+cricketers);

cartoons.push('schinchan','nobita');
console.log("insert last element="+cartoons);

//pop method
cricketers.pop();
console.log("remove last elements=" +cricketers);

cartoons.pop();
console.log("remove last elements=" +cartoons);

//unshift method
cricketers.unshift('dinesh');
console.log("insert first element=" +cricketers);

cartoons.unshift('mr.been');
console.log("insert first element=" +cartoons);

//shift method
cricketers.shift();
console.log("remove first elements=" +cricketers);

cartoons.shift();
console.log("remove first elements=" +cartoons);

// includes method:-to checkt element is there or not to get output as true or false.
var cricketers1= cricketers.includes('sachin');
console.log("to check=" +cricketers1);

var cartoons1= cartoons.includes('nobita');
console.log("to check=" +cartoons1);

//splice method:-(where to start,how many items delete,what item add);it is help to remove and add elements
cricketers.splice(0,1,'virendra','pant');
console.log("remove and add=" +cricketers);

cartoons.splice(0,1,'nody','ostworld');
console.log("remove and add=" +cartoons);

//slice method:-(start index,end index-1) 
//it will return new array.it will not modify original array.
//it is used to return sub array.
var cricketers2=cricketers.slice(0,2);
console.log("old array=" +cricketers);
console.log("sub array=" +cricketers2);

var cartoons2=cartoons.slice(0,2);
console.log("old array=" +cartoons);
console.log("sub array=" +cartoons2);

//join method:-it will convert array as a string and add a separator
// if u didnt pass any parameter it will add
var joincricketers=cricketers.join('-');
console.log("add separator=" +joincricketers);

var joincartoons =cartoons.join('-');
console.log("add separator=" +joincartoons);

//indexOf method:-it will give index of element
var indexCricketers= cricketers.indexOf('ajinkya');
console.log(indexCricketers);

var indexCartoons= cartoons.indexOf('doremon');
console.log(indexCartoons);

//map method:-it is used to add e.g num+10
var numbers=[10,20,30,40,50];
var newNumbers=numbers.map((val,index)=>{
    val=val+10;
    return val;
});
console.log("old array=" +numbers);
console.log("new array="+ newNumbers);

var num=[50,60,70,80];
var newNum=num.map((val,index)=>{
    val=val+10;
    return val;
});
console.log("old array=" +num);
console.log("new array="+ newNum);

//filter method
var newNumbers=numbers.filter((val,index)=>{
    return val>30;
});
console.log("filter=" +newNumbers);

var newNumbers1=num.filter((val,index)=>{
    return val>50;
});
console.log("filter=" +newNumbers1);

//string methods
// toLowerCase();
var myname='pranali shirodkar';
var newname=myname.toLowerCase();
console.log("old name=" +myname);
console.log("lowercase=" +newname);

var friend='neha parab';
var newfriend=friend.toLowerCase();
console.log("lowercase=" +newfriend);

//toUpperCase()
var name1='pranali shirodkar';
var newname=name1.toUpperCase();
console.log("old name=" +name1);
console.log("uppercase=" +newname);

var friend='neha parab';
var newfriend=friend.toUpperCase();
console.log("old name=" +friend);
console.log("uppercase=" +newfriend);

//charAt();
var name1='pranali shirodkar';
var newname=name1.charAt(2);
console.log("char at=" +newname);

var newfriend=friend.charAt(0);
console.log("char at=" +newfriend);

//indexof
var name1='pranali shirodkar';
var newname1=name1.indexOf('s',1);
console.log("indexof=" +newname1);

var name2='neha parab';
var newfriend1=name2.indexOf('p',1);
console.log("indexof=" +newfriend1);

//concat
var name3=name1.concat(' alia','bhatt');
console.log("concat=" +name3);

var name4=name2.concat(' alia','bhatt');
console.log("concat=" +name4);

//includes
var newHeroin=name3.includes('t',9);
console.log("includes=" +newHeroin);

var newHeroin1=name4.includes('t',9);
console.log("includes=" +newHeroin1);

//replace
var name5='janhavi';
var name6='aishwarya';

var newHeroin=name5.replace('t','k');
console.log("replace=" +newHeroin);

var newHeroine=name6.replace('a','k');
console.log("replace=" +newHeroine);

//split
var name7='rekha';
var name8='veena';

var newMum=name7.split('k',3);
console.log("split=" +newMum);

var newMum1=name8.split('n',3);
console.log("split=" +newMum1);

//substr
var newHeroin=name7.substr(0,3);
console.log("substring=" +newHeroin);

var newHeroin1=name8.substr(0,3);
console.log("substring=" +newHeroin1);

//search
var newHeroin=name7.search('e');
console.log("search=" +newHeroin);

var newHeroin1=name8.search('n');
console.log("search=" +newHeroin1);

//trim
var newHeroin=name5.trim();
console.log("trim=" +newHeroin);

var newHeroin1=name6.trim();
console.log("trim=" +newHeroin1);

