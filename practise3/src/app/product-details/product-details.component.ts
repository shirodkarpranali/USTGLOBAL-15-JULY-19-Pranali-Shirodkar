import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
 
  prod = {
    id :'',
    title :'',   
    imgUrl : '', 
    description : ''
  }

Products : any[] = [];

  constructor(private service : ProductService) {
    
   }

  updateProduct(key,data){
    this.service.updateData(key,data).subscribe(data=>{
      console.log(data);
      this.getDataa();
    },err=>{
      console.log(err);
    })
  }
    
  deleteProduct(key){
    this.service.deleteData(key).subscribe(data=>{
      console.log(data);
      this.getDataa();
    },err=>{
      console.log(err);
    })
  }

  sendProduct(pro){
    this.prod.id = pro.id,
    this.prod.title = pro.title,
    this.prod.imgUrl = pro.imgUrl,
    this.prod.description = pro.description;
    console.log(pro);
  }

  getDataa(){
    this.service.getData().subscribe(data=>{
      this.Products = data;
      console.log(data);
    },err =>{
      console.log(err);
    })
  }

  ngOnInit() {
  this.getDataa();
  }

}
