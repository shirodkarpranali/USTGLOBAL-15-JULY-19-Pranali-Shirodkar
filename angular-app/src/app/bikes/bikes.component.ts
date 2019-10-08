import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
bikeData:any='';
  bikes= [
    {
      brand:'KTM',
      img:"https://cdn.pixabay.com/photo/2017/11/10/17/51/motorcycle-2937056_1280.jpg",
      description:'KTM RC 200 is powered by the liquid cooled 4-stroke 199.5 cc engine. It is a mono-cylinder, 4 valves, with a BS4 emission standard. The bike is designed to pump out a power of 24.65 bhp @ 10,000 rpm with utmost torque of 19.2 Nm @ 8000 rpm.'
    },
    {
      brand:'pulsar',
      img:"https://cdn.pixabay.com/photo/2019/05/10/06/26/rs200-4192863_960_720.jpg",
      description:'The Bajaj Pulsar 150 is powered by a 149.5 cc air-cooled engine which produces of power. It has a fuel tank of 15 L and a claimed mileage of 65kmpl. The Bajaj Pulsar 150 starts at Rs 68,250 and goes up to Rs 88,838 (ex-showroom, Delhi). It is available in three variants.'
    },
    {
      brand:'royal enfield',
      img:"https://cdn.pixabay.com/photo/2018/07/01/11/42/royal-enfield-3509231_1280.jpg",
      description:'About Classic 350 Specs and Features The 346cc, single cylinder, 4-stroke, twin-spark motor generates a maximum output of 20.08PS at 5250rpm and 28Nm of torque at 4000rpm.The power is transferred to the rear wheel via a five-speed gearbox. The Classic has a fuel capacity of 13.5 litres and weighs in at 192kg '
    },
      {
        brand:'TVS apache 180',
        img:"https://image.shutterstock.com/image-photo/mountainbiker-600w-208232557.jpg",
        description:'KTM RC 200 is powered by the liquid cooled 4-stroke 199.5 cc engine. It is a mono-cylinder, 4 valves, with a BS4 emission standard. The bike is designed to pump out a power of 24.65 bhp @ 10,000 rpm with utmost torque of 19.2 Nm @ 8000 rpm.'
      },
      {
        brand:'Passion Pro',
        img:" https://cdn.pixabay.com/photo/2014/03/30/23/55/motorcycle-301725_1280.jpg",
        description:'abjkgasbafsfkhaK BS'
      },
      {
        brand:'Bajaj Avenger',
        img:'https://cdn.pixabay.com/photo/2019/07/16/00/00/avenger-hulk-hero-4340712__340.jpg',
        description:' Bajaj Avenger Street 220 is available in India at a price of Rs. 1.04 Lakh ... The addition of ABS will increase the price of the bike by around Rs 6,000 to Rs 8,000'
      },
      {
        brand:'Yamaha YZF',
        img:"https://bd.gaadicdn.com/processedimages/yamaha/yzf-r15-v3/source/m_yzf-r15-v3_11540277694.jpg",
        description:'Yamaha has given the popular R15 a MotoGP treatment called the YZF-R15 Version 3.0 Monster Energy Yamaha MotoGP Limited Edition 2019. This is the second time the R15 gets a MotoGP edition and this time, it comes with a black theme with Eneos and Monster Energy stickers. The bike is priced at Rs 1,42,780 (ex-showroom Delhi) and it is dearer than the standard colour variant by Rs 2,500.'
       }
  ];
  constructor() { }
  sendBike(bike){
    this.bikeData = bike;
  }
  ngOnInit() {
  }

}
