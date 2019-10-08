import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {
mobilesData:any='';
mobiles=[{
  name:'Samsung Galaxy M30 (Gradation Black, 4+64 GB)',
  img:"https://images-na.ssl-images-amazon.com/images/I/81Ir1ZnwJsL._SL1500_.jpg",
  description:'13+5+5MP Triple rear camera with f1.9 aperture, 2.2 wide angle, 2.2 flash | 16MP front camera with f2.0 aperture.16.21 centimeters (6.4-inch) FHD+ multi-touch capacitive touchscreen with 2340 x 1080 pixels resolution and 16M color support.Memory, Storage and SIM: 4GB RAM | 64GB internal memory expandable up to 512GB | Dual SIM (nano+nano) dual-standby (4G+4G)'
},
{
  name:'OnePlus 7 (Mirror Blue, 6GB RAM, 128GB Storage)',
  img:"https://images-na.ssl-images-amazon.com/images/I/612byLIR%2BgL._SL1000_.jpg",
  description:'Rear Camera - 48MP (Primary) + 5 MP (Tele-photo) | Front Camera - 16MP.16.2814 centimeters (6.41-inch) with 2340 x 1080 pixels resolution.Memory, Storage & SIM: 6GB RAM | 128GB internal memory | Dual SIM dual-standby (4G+4G).Android v9.0 Oxygen operating system with 2.84GHz Snapdragon 855 7nm octa core processor.3700mAH lithium-ion battery that supports 20W (5V/ 4A) fast charging.'
},
{
  name:'Redmi Y3 (Prime Black, 4GB RAM, 64GB Storage)',
  img:"https://images-na.ssl-images-amazon.com/images/I/718FBBTV0IL._SL1500_.jpg",
  description:'12MP+2MP dual rear camera | 32MP front facing camera.15.9004 centimeters (6.26-inch) with 1520 x 720 pixels resolution, 269 ppi pixel density.Memory, Storage and SIM: 4GB RAM | 64GB internal memory expandable up to 512GB | Dual SIM (nano+nano) dual-standby (4G+4G).Android Pie v9.0 operating system with 1.8GHz Qualcomm Snapdragon 632 octa core processor, Adreno 506.4000mAH lithium-ion battery.'
},
{
  name:'Honor Play (Navy Blue, 4GB RAM, 64GB Storage)',
  img:"https://images-na.ssl-images-amazon.com/images/I/81pIWq7ToYL._SL1500_.jpg",
  description:'16MP+2MP dual rear camera with scene recognition, support EIS for multi frame stabilization | 16MP front camera.16.002 centimeters (6.3-inch) with 2340 x 1080 pixels resolution.Memory, Storage and SIM: 4GB RAM | 64GB internal memory expandable up to 256GB | Dual SIM dual-standby (4G+4G).Android Oreo v8.1+EMUI v8.2 operating system with 2.36GHz Kirin 970 AI Chipset octa core processor.3750mAH lithium-polymer battery'
},
{
  name:'LEAGOO M9 Pro 5.72-inch HD+ IPS Full Screen Display OS Android 8.0 2GB RAM, 16GB ROM, MT6739V/WW, Battery 3000mAh, 4G Global Network Frequency Smartphone - Black',
  img:"https://images-na.ssl-images-amazon.com/images/I/7163hOq2NML._SL1000_.jpg",
  description:'Colour - Black, Blue, Gold.5.72" HD+ IPS display.CPU - MT6739V/WW Cortex-A53 Quad Core.Camera - Rear 13MP + 2MP and Front 5MP.Memory 2GB + 16GB'
},
{
  name:'Vivo V15 (Frozen Black, 6GB RAM, 64GB Storage) with No Cost EMI/Additional Exchange Offers',
  img:"https://images-na.ssl-images-amazon.com/images/I/61MDwaWYWqL._SL1200_.jpg",
  description:'Display: 16.59cm (6.53) FHD+ ultra fullView with 5th generation corning gorilla glass.Pop-Up selfie camera: 32MP pop-up selfie camera with impressive features like face beauty, portrait bokeh, and much more.Triple rear camera: 12MP (24 million photosensitive Units) + 8MP + 5MP AI Triple rear camera with AI super wide-angle, AI body shaping, and many more.Powerful performance: MediaTek P70 processor.'
},
{
  name:'OPPO K3 (Aurora Blue, 6GB RAM, 64GB Storage)',
  img:"https://images-na.ssl-images-amazon.com/images/I/71ZzqHNrwCL._SL1500_.jpg",
  description:'16MP+2MP dual rear camera with AI wisdom beauty, front HDR, facial recognition, front portrait style | 16MP front camera.16.51 centimeters (6.5-inch) full screen AMOLED display with 2340 x 1080 pixels resolution, 394 ppi pixel density and 16M color support.Memory, Storage & SIM: 6GB RAM, 64GB internal memory | Dual SIM (nano+nano) dual-standby (4G+4G).Android ColorOS v6.0 operating system with 2.2GHz Snapdragon 710 octa core processor, Adreno 616.3765mAH lithium-polymer'
},
{
  name:'LENOVO K9 Note 4/64 Black',
  img:"https://images-na.ssl-images-amazon.com/images/I/416LnzjP-oL.jpg",
  description:'*5.99 INCH FULL SCREEN DISPLAY,3760 MAH BATTERY,4GB RAM+64GB ROM,EXTERNAL UPTO 256 GB,16MP+2MP REAR AL DUAL CAMERA,8MP FRONT CAMERA,,QUALCOMM SNAPDRAGON M450 OCTA CORE PROCESSOR'
},
{
  name:'Moto G6 Plus (Indigo Black, 6+64 GB)',
  img:"https://images-na.ssl-images-amazon.com/images/I/61vtCu41MgL._SL1500_.jpg",
  description:'12+5 MP dual camera: Google Lens, text scanner, portrait mode, spot colour, face filters, panorama, manual mode, up to 4K ultra HD video capture, time lapse and slow motion video.16 MP front camera: Group selfie, beautification, manual mode, face filters, up to 1080p (30 fps) time lapse and slow motion video.14.99 cm (5.9-inch) Full HD+ display with 1080 x 2160 pixels resolution.6 GB RAM, 64 GB internal memory expandable up to 256 GB | Dual SIM (nano+nano) with dual-standby (4G+4G).2.2GHz Qualcomm Snapdragon 630 octa-core processor with Android v8.0 Oreo.3200 mAh lithium-polymer battery, Multi-function fingerprint reader.'
},
{
  name:'Apple iPhone XR (256GB) - Black',
  img:"https://images-na.ssl-images-amazon.com/images/I/519KIlHA2wL._SL1024_.jpg",
  description:'6.1-inch Liquid Retina display (LCD).IP67 water and dust resistant (maximum depth of 1 meter up to 30 minutes).12MP camera with OIS and 7MP TrueDepth front camera—Portrait mode, Portrait Lighting, Depth Control, and Smart HDR.Face ID for secure authentication.A12 Bionic with next-generation Neural Engine.A12 Bionic with next-generation Neural Engine.iOS 12 with Memoji, Screen Time, Siri Shortcuts, and Group FaceTime'
}]
  constructor() { }
sendMobiles(mobile){
  this.mobilesData = mobile;
}
  ngOnInit() {
  }

}
