let employeeJSON={
                  name:'Dinga',
                  age: 24,
                  hobbies:['dancing','singing']              
};
// console.log('My name is ' employeeJSON.name);
console.log(`My name is ${employeeJSON.name}`);
console.log(employeeJSON);
let jsonObject= JSON.stringify(employeeJSON); //js object convert into json object
console.log(jsonObject);
let jsObject=JSON.parse(jsonObject); //json object converts into js object.
console.log(jsObject);

