import { Component, OnInit } from '@angular/core';
import { TaskService } from '../task.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  constructor(private service: TaskService, private router: Router) { }

  deleteTask(task)  {
    this.service.deleteData(task).subscribe(data => {
      console.log(data);
      this.router.navigateByUrl('/show');
    });
  }

  updateTask(task) {
    this.service.updateData(task).subscribe(data => {
      console.log(data);
      this.router.navigateByUrl('/show');
    });
  }
  ngOnInit() {
    this.service.getData();
  }

}
