import { Component, OnInit } from '@angular/core';
import { TaskService } from '../task.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private service: TaskService, private router: Router) { }

  sendDetails(taskInfo: NgForm) {
    this.service.sendData(taskInfo.value).subscribe(data => {
      console.log(data);
      taskInfo.reset();
      this.router.navigateByUrl('/show');
    }, err => {
      console.log(err);
    });
  }
  ngOnInit() {
  }

}
