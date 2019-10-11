//getElementById();
let pElement= document.getElementById('demo');
console.log(pElement);
pElement.textContent='this is a new p tag';
//getElementByCLassName()
let divElement=document.getElementsByClassName('blue');
console.log(divElement);
let pElements= document.getElementsByTagName('p');
console.log(pElements);
let nameElements= document.getElementsByName('helement');
console.log(nameElements);
let demoElements=document.querySelector('#demo');
console.log(demoElements);
let blueClassElements= document.querySelectorAll('.blue');
console.log(blueClassElements);
let buttonELement= document.createElement('button');
buttonELement.textContent='CLick Me';
console.log(buttonELement);
document.body.appendChild(buttonELement);
let spanEle=document.getElementById('spanid');
spanEle.style.color='pink';
let buttonELement1=document.getElementById('buttonELe');
//buttonELement1.className='add';
buttonELement1.classList='add add1';
document.getElementById('tableid').innerHTML=
`<table border="1">
<tr>
    <td>Name</td>
    <td>Ages</td>
</tr>
<tr>
    <td>john</td>
    <td>14</td>
</tr>
<tr>
    <td>Dinga</td>  
    <td>20</td>
</tr>
<tr>
<td>sundari</td>
<td>22</td>
</tr>
</table>`;

let pElementData=document.getElementById('demo1');
//pElementData.style.color='blue';
//pElementData.className='blue';
pElementData.classList = 'blue fonts';























//let tableELe=document.createElement('table');
//let tr1=document.createElement('tr');
//let trd1=document.createElement('td');
//trd1.textContent='Name';
//let trd2=document.createElement('td');
//trd2.textContent='Age';
//tr1.appendChild(trd1);
//tr1.appendChild(trd2);

//let tr2=document.createElement('tr');
//let trd3=document.createElement('td');
//trd3.textContent='john';
//let trd4=document.createElement('td');
//trd4.textContent='40';
//tr2.appendChild(trd3);
//tr2.appendChild(trd4);

//<p id='demo'>data</p>
//let pElement=document.getElementById('demo');
//pElement.textContent='data changed';
//let pElement=document.getElementsByTagName('p');
//pElement(0);
