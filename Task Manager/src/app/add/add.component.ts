import { Component, OnInit } from '@angular/core';
import { TaskServiceService } from '../task-service.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private service: TaskServiceService) { }

addData(form){
  this.service.tasks.push(form);
  console.log(form);
}

  ngOnInit() {
  }

}
