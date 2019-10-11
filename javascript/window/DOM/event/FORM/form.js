function validateForm(){
    let formData= document.forms[0];
    //console.log(formData.uname.value);

    let userName= formData.uname.value;
    let passWord= formData.password.value;
    if(userName.length>4 && passWord.length<7){
        // console.log('success');
        formData.uname.style.border='1px solid green';
        formData.password.style.border='1px solid green';
        formData.loginSubmit.disabled = false;
}else{
        formData.uname.style.border='4px solid red';
        formData.password.style.border='4px solid red';
        formData.loginSubmit.disabled =true;
    }
}

// function validForm(){
//    let formData1=document.forms[0];
//    let passWord= formData1.password.value;
//    if(passWord.length>7){
//        console.log('done');
//        formData1.password.style.border='1px solid green';

//    } else{
//        formData1.password.style.border='4px solid red';
//    }
// }
