function getSum(a,b){
    var c=a+b;
    return c;
    }
    var num=getSum(10,20);
   console.log(num);
////////
    var getName=function(num1,num2)
    {
     var sum=num1+num2;
     return sum;
    }
    console.log(getName(20,30));
//////////
//IIFE(immediately invoked function expression)
(function(val1,val2)
{
    var sum= val1+val2;
    console.log("sum= "+sum);
}(10,20));

//fat arrow function
var getSumDate=(val3,val4)=>{
    var sumVal =val3+val4;
    return sumVal;
}
var value=getSumDate(100,200);
console.log(value);

//hoisting
console.log(name1);
var name1='Gandhi';
console.log(name1);
/////
function fname(){
    console.log(name2);
    var name2='Dinga';
}
fname();
////
//function fname(){
  //  var name1;
    //console.log(name1);
    //name1='pinga';
//}
//fname();

function first(callback){
    setTimeout(function(){
    console.log("first");
    callback();
});
}
function second (){
    console.log("second");
}
first(second);
//second();






