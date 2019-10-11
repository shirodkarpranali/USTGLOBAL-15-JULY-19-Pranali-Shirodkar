//Factorial
function factNumber(numb)
{
    var facto=1;
    for(var i=1;i<=numb;i++)
    {
         facto=facto*i;
    }
    return facto;
}
var getFacto = factNumber(10);
console.log("Factorial = "+getFacto);




var facNumber = function(num)
{
    var fac=1;
    for(var i=1;i<=num;i++)
    {
         fac=fac*i;
    }
    return fac;
}
var  getFac = facNumber(5);
console.log("Factorial = "+getFac);



(function(nu){
    var fa1=1;
    for(var i=1;i<=nu;i++)
    {
         fa1=fa1*i;
    }
    console.log("Factorial = "+fa1);
}(10))




var getFacto= ((val1)=> {
    var fa2=1;
    for(var i=1;i<=val1;i++)
    {
         fa2=fa2*i;
    }
    return fa2;
});
var pro = getFacto(10);
console.log("Factorial = "+pro);



//Fibonacci Series


function fNumber(m)
{
    var a=1;
    var b=1;
    var fi=0;
    if(m===1)
    {
        console.log(a);
    }else
    if(m===2)
    {
        console.log(a);
        console.log(b);
    }else
    {
        console.log(a);
            console.log(b);
        for(i=3;i<=m;i++)
        {
            fi=a+b; 
            console.log(fi);
            a=b;
            b=fi;
        }
    }
    return fi;
}
var getFi = fNumber(10);
console.log("Fibonacci = "+getFi);



var fibbNumber = function(number)
{
    var a=1;
    var b=1;
    var fib=0;
    if(number===1)
    {
        console.log(a);
    }else
    if(number===2)
    {
        console.log(a);
        console.log(b);
    }else
    {
        console.log(a);
            console.log(b);
        for(i=3;i<=number;i++)
        {
            fib=a+b; 
            console.log(fib);
            a=b;
            b=fib;
        }
    }
    return fib;
}
var  getFib = fibbNumber(10);
console.log("Fibonaci = "+getFib);



 (function(g){
    var a=1;
    var b=1;
    var fib=0;
    if(g===1)
    {
        console.log(a);
    }else
    if(g===2)
    {
        console.log(a);
        console.log(b);
    }else
    {
        console.log(a);
            console.log(b);
        for(i=3;i<=g;i++)
        {
            fib=a+b; 
            console.log(fib);
            a=b;
            b=fib;
        }
    }
     console.log("Fibonacci = "+fib);
 }(10))

 var getFibonacci= (val6)=> {
    var a=1;
    var b=1;
    var fib=0;
    if(val6===1)
    {
        console.log(a);
    }else
    if(val6===2)
    {
        console.log(a);
        console.log(b);
    }else
    {
        console.log(a);
            console.log(b);
        for(i=3;i<=val6;i++)
        {
            fib=a+b; 
            console.log(fib);
            a=b;
            b=fib;
        }
    }
    return fib;
}
var p = getFibonacci(10);
console.log("Fibonacci = "+p);


// Circumference of a circle

function cirCirum(radius)
{
    var circle =2*3.14*radius;
    return circle;
}
var ciCir = cirCirum(10);
console.log("Circumference = "+ciCir);





var cirCu = function(radii)
{
    var circle =2*3.14*radii;
    return circle;
}
var  cCir = cirCu(10);
console.log("Circumference = "+cCir);








(function(rad){
    var cir =2*3.14*rad;
     console.log("Circumference = "+cir);
 }(10))







 var circleCirumcumference= (val9)=> {
    var circle =2*3.14*val9;
    return circle;
}
var pro = circleCirumcumference(4);
console.log("Circumference = "+pro);




// Prime Number

function checkPrime(x)
{
    if(x===1)
    {
        return false;
    }
    else
    if(x===2){
        return true;
    }
    else{
        for(var i=2;i<=x/2;i++){
            if(x%i==0){
                return false;
            }
        }return true;
    }
}
var cPrime = checkPrime(13);
console.log("Is the given Number Prime? = "+cPrime);



var chPrime = function(pr)
{
    if(pr===1)
    {
        return false;
    }
    else
    if(pr===2){
        return true;
    }
    else{
        for(var i=2;i<=pr/2;i++){
            if(pr%i==0){
                return false;
            }
        }return true;
    }
}
var  chPri = chPrime(5);
console.log("Is the given Number Prime? = "+chPri);



(function(primeno){
    if(primeno===1)
    {
        console.log("Is the given Number Prime? = false");
    }
    else
    if(primeno===2){
        console.log("Is the given Number Prime? = true");
    }
    else{
        for(var i=2;i<=primeno/2;i++){
            if(primeno%i==0){
                console.log("Is the given Number Prime? = false");
            }
        }console.log("Is the given Number Prime? = true");
    }
 }(5))




 var checkingPrime= (val7)=> {
    if(val7===1)
    {
        return false;
    }
    else
    if(val7===2){
        return true;
    }
    else{
        for(var i=2;i<=val7/2;i++){
            if(val7%i==0){
                return false;
            }
        }return true;
    }
}
var primenumber = checkingPrime(37);
console.log("Is the given Number Prime? = "+primenumber);






//Array 


function sumArray(b)
{
    var sumar=0;
    for(var i=0;i<b.length;i++)
    {
         if(isNaN(b[i])){
             continue;
         }
         sumar=sumar+b[i];
    }
    return sumar;
}
var a=[10,20,30,40];
var getSumo = sumArray(a);
console.log("Sum = "+getSumo);




var addArray = function(c)
{
    var sumar=0;
    for(var i=0;i<c.length;i++)
    {
         if(isNaN(c[i])){
             continue;
         }
         sumar=sumar+c[i];
    }
    return sumar;
}
var d=[40,50,60,70];
var  getSummation = addArray(d);
console.log("Sum = "+getSummation);



(function(e){
    var sumar=0;
    for(var i=0;i<e.length;i++)
    {
         if(isNaN(e[i])){
             continue;
         }
         sumar=sumar+e[i];
    }
    console.log("Sum = "+getSummation);
}([1,2,10,20]))




var getSumma= (val8)=> {
    var sumar=0;
    for(var i=0;i<val8.length;i++)
    {
         if(isNaN(val8[i])){
             continue;
         }
         sumar=sumar+val8[i];
    }
    return sumar;  
}
var j= [1,2,10,20];
var arr = getSumma(j);
console.log("Sum = "+arr);

