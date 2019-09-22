import { Component, OnInit } from '@angular/core';
import { TaskServiceService } from '../task-service.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  view:any[]=[];

  constructor(private service:TaskServiceService) { }

  deleteData(i){
    this.service.tasks.push(i);
  }

  addData(form,i) {
    this.service.tasks.push(i);
    this.service.tasks.push(form); 
    console.log(form)
  }

  ngOnInit() {
    
    for(var i of this.service.sendData()) {
      this.view.push(i);
      console.log(i)
    }
    
  }
}