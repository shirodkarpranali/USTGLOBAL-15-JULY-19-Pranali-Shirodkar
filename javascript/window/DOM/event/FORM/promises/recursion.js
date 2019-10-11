let factorial=GetFactorial(10);
console.log('factorial='+factorial)

function GetFactorial(){
    if(number>0)
    {
        return number*GetFactorial(number-1);
    }
    else{
        return 1;
    }
}

function fact(n){
    if(n===0)\\n===1
}