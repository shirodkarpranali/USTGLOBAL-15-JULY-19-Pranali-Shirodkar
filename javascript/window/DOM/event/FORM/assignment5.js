function validateForm(){
    let formData= document.forms[0];
    console.log(formData.uname.value);

    let firstName= formData.fname.value;
    let lastName= formData.Lname.value;
    if(firstName.length>4 && lastName.length>2){
        // console.log('success');
        formData.fname.style.border='1px solid green';
        formData.Lname.style.border='1px solid green';
        formData.subMit.disabled = false;
}else{
        formData.fname.style.border='4px solid red';
        formData.Lname.style.border='4px solid red';
        formData.subMit.disabled =true;
    }
}
