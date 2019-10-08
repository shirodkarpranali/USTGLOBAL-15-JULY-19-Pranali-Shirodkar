import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {
 condition=false;
  users =[
    {
      id:1234,
      name:'pranali',
      location:'worli'
    },
    {
      id:123,
      name:'jadii',
      location:'goregaon'
    },
    {
      id:1234,
      name:'aishwarya',
      location:'sion'
    },
    {
      id:1234,
      name:'janhavi',
      location:'sion'
    },
    {
      id:1234,
      name:'raje',
      location:'jogeshwari'
    },
    {
      id:1234,
      name:'souvik',
      location:'parel'
    },
    {
      id:1234,
      name:'anna',
      location:'dombivli'
    }
  ];
  constructor() { }
  
  removeUser(i){
   let index=this.users.indexOf(i);
   this.users.splice(index,1);
   this.condition =true;
  }

  ngOnInit() {
  }

}
