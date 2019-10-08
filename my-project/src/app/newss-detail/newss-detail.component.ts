import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-newss-detail',
  templateUrl: './newss-detail.component.html',
  styleUrls: ['./newss-detail.component.css']
})
export class NewssDetailComponent implements OnInit {

 @Input() newsDetails :any=''; 
  constructor() { }

  ngOnInit() {
  }

}
