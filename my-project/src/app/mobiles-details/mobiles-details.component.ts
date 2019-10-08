import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-mobiles-details',
  templateUrl: './mobiles-details.component.html',
  styleUrls: ['./mobiles-details.component.css']
})
export class MobilesDetailsComponent implements OnInit {
 @Input()
  mobilesDetails:any='';
  constructor() { }

  ngOnInit() {
  }

}
