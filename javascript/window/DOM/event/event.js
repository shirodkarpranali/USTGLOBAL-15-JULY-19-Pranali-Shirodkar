function sayHello(){
    alert('Hello!!!');
}

let buttonELement= document.getElementById('clickButton');
buttonELement.onclick=function(){
    alert("hello World");
}

function clickButton1()
{
    let pElementData1=document.createElement('p');
    pElementData1.textContent="this is p ELement";
    document.body.appendChild(pElementData1);
}

let alertElement = document.getElementById('alertHi');
alertElement.addEventListener('click',function(){
    alert('Good Evening');
});
let h1Element= document.createElement('h1');
function showText(){
    let inputElement=document.getElementById('showData');
    console.log(inputElement.value);
    //let h1Element= document.createElement('h1');
    h1Element.textContent=inputElement.value;
    document.body.appendChild(h1Element);

}


