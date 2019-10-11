// let resultData= new Promise(function(resolve,reject){
//     if(10===10){
//         reject('Failed');
//     }else{
//         resolve('success');
//     }
// });
// resultData.then((data)=>{
//     console.log('then block=' +data);
// }).catch((error)=>{
//     console.log('catch block=' +error);
// });

let employeeData= new Promise(function(resolve,reject){
    const employee=[
                    {
                        name:'shaharukh',
                        age:60
                    },
                    {
                        name:'sundari',
                        age:45
                    },
                    {
                        name:'akshay',
                        age: 40
                    }

    ];

    if(10>10){
        reject('Failed');
    }else{
        resolve(employee);
    }
});
employeeData.then((data)=>{
    // console.log('Employee Data=', data);
    return data;
}).catch((error)=>{
    console.log('catch block=' +error);
}).then(function(data1){
    console.log("this is then block 2" ,data1);
});













