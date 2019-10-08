import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidators } from './custom.validators';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }

  get name(){
    return this.registerForm.get('name'); 
  }

  get email(){
    return this.registerForm.get('email'); 
  }

  get phno(){
    return this.registerForm.get('phno'); 
  }

registerForm = new FormGroup({
  name : new FormControl('',[Validators.minLength(3),
                             Validators.required]),
  email : new FormControl('',[Validators.email,
                              Validators.minLength(5),
                               Validators.required,
                              CustomValidators.noSpace]),
  phno : new FormControl('',[Validators.minLength(10),
                              Validators.required])
})
  ngOnInit() {
  }
  printForm(form){
    console.log(form);
    console.log(form.value);

  }
}
