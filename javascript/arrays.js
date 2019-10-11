var hobbies=['singing','dancing','coding','skipping'];
hobbies.forEach(function(value,index){
    console.log("hobbies=" +value);
});
//fat arrow function
hobbies.forEach((value,index)=>{
    console.log("hobby=" +value);
});
// push method
hobbies.push('bike','travelling');
console.log("insert last element="+hobbies);
//pop method
hobbies.pop();
console.log("remove last elements=" +hobbies);
//unshift method
hobbies.unshift('painting');
console.log("insert first element=" +hobbies);
//shift method
hobbies.shift();
console.log("remove first elements=" +hobbies);
// includes method:-to checkt element is there or not to get output as true or false.
var hasHobbies= hobbies.includes('coding');
console.log(hasHobbies);
//splice method:-(where to start,how many items delete,what item add);
hobbies.splice(0,1,'cricket','watching movie');
console.log(hobbies);
//slice method:-(start index,end index-1) 
//it will return new array.it will not modify original array.
var hobbies1=hobbies.slice(0,2);
console.log(hobbies);
console.log(hobbies1);
//join method:-it will convert array as a string and add a separator
// if u didnt pass any parameter it will add
hobbies.join('-');
console.log(hobbies);
//indexOf method:-it will give index of element
var indexHobbies= hobbies.indexOf('coding');
console.log(indexHobbies);
//map method:-
var numbers=[10,20,30,40];
var newNumbers=numbers.map((val,index)=>{
    val=val+10;
    return val;
});
console.log("old array=" +numbers);
console.log("new array="+ newNumbers);
//filter method
var newNumbers=numbers.filter((val,index)=>{
    return val>30;
});
console.log("filter=" +newNumbers);

// class assignment:-
var items=[{
    item:'pen', 
    price:50
},{item:'bag', 
price:500
},{
    item:'laptop', 
    price:50000
},{
    item:'movie', 
    price:500
}];

var mapItems=items.map((index)=>{
    index.price=index.price+10;
    return index;
});
console.log(mapItems);
///
var filterItems= items.filter((index)=>{
    return index.price>100 && index.item.length>3;
});
console.log(filterItems);

//string methods
var heroin='alia bhat';
var newHeroin=heroin.toLowerCase();
console.log("lowercase=" +newHeroin);

var newHeroin=heroin.toUpperCase();
console.log("uppercse=" +newHeroin);

var newHeroin=heroin.charAt(2);
console.log("charat=" +newHeroin);

var newHeroin=heroin.indexOf('l',1);
console.log("indexof=" +newHeroin);

var newHeroin=heroin.concat('alia','bhat');
console.log("concat=" +newHeroin);

var newHeroin=heroin.includes('t',9);
console.log("includes=" +newHeroin);

var newHeroin=heroin.replace('a','k');
console.log("replace=" +newHeroin);

var newHeroin=heroin.split('a',3);
console.log("split=" +newHeroin);

var newHeroin=heroin.substr(0,3);
console.log("substring=" +newHeroin);

var newHeroin=heroin.search('l');
console.log("search=" +newHeroin);

var newHeroin=heroin.trim();
console.log("trim=" +newHeroin);





























