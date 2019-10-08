import { Component } from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent {
  redColour=true;
  name="pranali";
  textClasses='bg-success text-white';
  paragraphStyle = 'blue';
  ternery=true;
  padding='50px';

  
  columnspan=2;
imgURL='https://cdn.pixabay.com/photo/2019/08/01/15/35/landscape-4377796__340.jpg';


  constructor() {
    setTimeout(()=>{
      this.redColour=false;
      this.ternery=false;
    },5000);
   }
}
