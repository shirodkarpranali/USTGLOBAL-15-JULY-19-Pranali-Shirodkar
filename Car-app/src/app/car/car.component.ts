import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {

  carData: any = '';
  cars = [
    {
      brand: 'car magazine',
      img: "https://car-images.bauersecure.com/upload/30929/images/000956b33e2c-2e76-42a2-8.jpg",
      description: 'Awesome car'
    },
    {
      brand: 'BMW',
      img: "https://www.bmw.in/content/dam/bmw/marketIN/bmw_in/Images/all-models/BMW%20Series/BMW%203%20series/sedan/2019/desktop.jpg",
      description: 'nice car'
    },
    {
      brand: 'Mercedeez',
      img: "https://images.carscoops.com/2015/12/2017-Mercedes-C-Class-Coupe-29.jpg",
      description: 'good '
    },
      {
        brand: 'Honda',
        img: "https://article.images.consumerreports.org/f_auto/prod/content/dam/CRO%20Images%202018/Cars/October/CR-Cars-InlineHero-2018-Honda-CR-V-driving-10-18",
        description: 'better'
      }

  ];


  constructor() { }

  sendCar(car){
    this.carData = car;
  }

  ngOnInit() {
  }

}
