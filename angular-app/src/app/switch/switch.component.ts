import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-switch',
  templateUrl: './switch.component.html',
  styleUrls: ['./switch.component.css']
})
export class SwitchComponent implements OnInit {
condition=false;
person ='pranali';


  constructor() { }
printInput(element){
console.log(element.value);
}
  ngOnInit() {
  }

}
