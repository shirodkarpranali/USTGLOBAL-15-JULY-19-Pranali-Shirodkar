function sum(a,b)
{
    function addsum(){      // for privacy we use closure
    return a+b;             
}
return addsum;
}
var addfunc=sum(10,20);
var total=addfunc();
console.log(total);
//var addfunc=sum(20,30);
//var total1=addfunc();
//console.log(total1);
console.log(window);
console.log(this);
console.log(this===window);
var name="rakshith";
console.log(window.name);  //whenever u invoke method using object reference then this keyword consist object.
console.log(this.name);

var person={
            name:'Dulquer salman',
            age: 30,
            getName:function(){
                console.log(this);
                console.log(window);
                getData();
                function getData(){
                    console.log("Get data method=" +this.name);
                }
                return this.name;
            }
}
var hero=person.getName();
console.log(hero);
console.log("========================================================");
//using let keyword u cannot redeclaration.but reassign the value is possible.
for(var i=0;i<5;i++)
{
    console.log(i);     // var is global and block scope
}
console.log("value of i=" +i);

//for(let j=0; j<5;j++)
//{
  //  console.log(j);     //let is local 
//}
//console.log("value of j=" +j);
 var hobbies =['dancing','singing','cricket'];
 console.log('hobbies' +hobbies);
 var hobbies=['nomismatics'];
 console.log('hobbies' +hobbies);
 console.log("=====================");
 let fruits=['orange','banana'];
 console.log('fruits='+fruits);   //let=redeclaration is not possible.but reinitialisation is possible.
 fruits=['Jackfruit'];
 console.log('fruits='+fruits);
 console.log("=========================");
 const items=['lipstick','kajal','deo','wallet'];
 console.log('items=' +items);
items[0]=['bag','book'];
console.log(items)






